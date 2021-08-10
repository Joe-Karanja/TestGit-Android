package com.example.basicstaticalapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // m = MediaPlayer.create(this, R.raw.song);
   //m.start(); 
    }
    MediaPlayer s;
    MediaPlayer p;
    //1st button click
    public void qoutes(View v)
    {
    	p.stop(); 
    	//link to pageoneactivity
    	Intent x = new Intent(this,PageOne.class);
    	startActivity(x);
 
    }//end
    //2nd button click
    public void bestmessages(View v)
    {
    	p=MediaPlayer.create(this, R.raw.song);
    	p.start();
    	//link to pagetwoactivity
    	Intent x = new Intent(this,PageTwo.class);
    	startActivity(x);
    	
    }//end
    
    public void success (View v)
    {
    	s=MediaPlayer.create(this,R.raw.song);
    	s.start();	
    Intent x = new Intent(this,SuccessQuotes.class);
    startActivity(x);
    }
  
    public void love (View v)
    {
    	s.stop();
    Intent x = new Intent(this,LoveQuotes.class);
    startActivity(x);
       
    }
    //TO DO
    

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
