package com.example.mytrivia;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    //declare views to be used in this app
	RadioButton choice1,choice2,choice3,choice4;
	TextView quiz,timing;
	
	//set questions and choices, the last in each array is the answer, there are 10 quizzes: .....add more using the same approach
	String[] quiz1= {"Who was the first President of Kenya?","Uhuru Kenyatta","Daniel Moi","Mwai Kibaki","Jomo Kenyatta","Jomo Kenyatta"}; 
	String[] quiz2= {"Which Coutry Hosted The 1998 FIFA World Cup?","France","Brazil","South Africa","Ukraine","France"}; 
	String[] quiz3= {"Which year was the Olympics in Sydney?","2000","1994","2012","None of The Above","None of The Above"}; 
	String[] quiz4= {"Which one of the following is not a Programming Language?","JavaScript","Java","Bootstrap","Perl","Bootstrap"}; 
	String[] quiz5= {"One of the Following is not a Mobile OS!","Android OS","PHP","I-OS","Windows OS","PHP"}; 
	String[] quiz6= {"Who was the first President of Uganda?","Uhuru Kenyatta","Mugabe","Nyerere","Idi Amin","Nyerere"}; 
	String[] quiz7= {"Which Coutry Hosted The 2012 Africa Cup of Nations?","E. Guinea & Gabon","Nigeria","Cameroon","Ghana","E. Guinea & Gabon"}; 
	String[] quiz8= {"Who is the Cabinet Secretary of Agriculture?","Wamalwa","Ruto","Willy Bett","Kilonzo Mailu","Willy Bett"}; 
	String[] quiz9= {"Which one of the following is not a Programming Language?","Ruby","Perl","Elang","Juno","Juno"}; 
	String[] quiz10= {"Which is not a Phone Manufacturing Company!","Intel","HP","AMD","T-Mobile","AMD"}; 
	
	
	String [] quizarray;
	String[][] arrays;
	int x=0,points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timing();//start timing
        //add all arrays in a group
        arrays = new String[][] { quiz1, quiz2, quiz3,quiz4,quiz5,quiz6, quiz7, quiz8,quiz9,quiz10};
      
        //find all views
        choice1 = (RadioButton) findViewById(R.id.choice1);
        choice2 = (RadioButton) findViewById(R.id.choice2);
        choice3 = (RadioButton) findViewById(R.id.choice3);
        choice4 = (RadioButton) findViewById(R.id.choice4);
        quiz = (TextView) findViewById(R.id.quiz);
        timing = (TextView) findViewById(R.id.timer);
        
        //get the first quiz
        quizarray = arrays[0];
       
        //display the question and choices in radio buttons
        quiz.setText(quizarray[0]);
        choice1.setText(quizarray[1]);
        choice2.setText(quizarray[2]); 
        choice3.setText(quizarray[3]);
        choice4.setText(quizarray[4]);
    }
    //button click to answer
    public void answer(View v)
    {
    	//set choice to null
    	String userchoice = "";
    	//check what user entered & update userchoice
    	if(choice1.isChecked())
    	{
    		userchoice=choice1.getText().toString();
    	}
    	if(choice2.isChecked())
    	{
    		userchoice=choice2.getText().toString();
    	}
    	
    	if(choice3.isChecked())
    	{
    		userchoice=choice3.getText().toString();
    	}
    	
    	if(choice4.isChecked())
    	{
    		userchoice=choice4.getText().toString();
    	}
    	
    	//check if user choice is same as answer: last item in each array
    	String answer = quizarray[5];
    	if(answer==userchoice && x < 9)
    	{
    		//if answer is true: increament points
    		//increment x to increment to quiz 2
    		 x=x+1;
    		 points=points+4;
    		//here it picks arrays[x]:  x will be 1 .....10 questions
    		 quizarray = arrays[x];
    		 //this updates news questions      
    		 quiz.setText(quizarray[0]);
    	     choice1.setText(quizarray[1]);
    	     choice2.setText(quizarray[2]); 
    	     choice3.setText(quizarray[3]);
    	     choice4.setText(quizarray[4]);
    	}
    	else if(answer!=userchoice && x < 9){
    		//if wrong answer
    		 //same as above but no points added
    		 points=points+0;
    		 
    		 x=x+1;
    		 quizarray = arrays[x];
 		     quiz.setText(quizarray[0]);
 	         choice1.setText(quizarray[1]);
 	         choice2.setText(quizarray[2]); 
 	         choice3.setText(quizarray[3]);
 	         choice4.setText(quizarray[4]);
    	}
    	
    	else {
    		//questions are over: pass point to next activity
    		Intent x  = new Intent(this,ResultsActivity.class);
    		Bundle b = new Bundle();
    		b.putInt("points", points);
    		x.putExtras(b);
    		startActivity(x);
    		finish();
    	}
    	
    	
    }//end
    
          //this is our timer
          public void Timing()
           {
        	  //15 seconds
    	      new CountDownTimer(20000, 1000) {

	    	     public void onTick(long millisUntilFinished) {
	    	         timing.setText("Seconds Remaining: " + millisUntilFinished / 1000);
	    	     }

	    	     public void onFinish() {
	    	         timing.setText("Time Over!");
	    	       //time is over: pass point to next activity
	    	         Intent x  = new Intent(MainActivity.this,ResultsActivity.class);
	    	         Bundle b = new Bundle();
	    	    	 b.putInt("points", points);
	    	    	 x.putExtras(b);
	    	         startActivity(x);
	    	         finish();
	    	         
	    	     }
    	  }.start();

    	
    }//end
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
