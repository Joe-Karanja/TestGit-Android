package com.example.basicstaticalapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class PageTwo extends Activity {

	 TextView tvbestqoutes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page_two);
		//find the textview in XML
		tvbestqoutes = (TextView) findViewById(R.id.tvbestquotes);
		//set some String of quotes in the textview
		String messages = 
				"When you are in bright light,Everyone will follow you But when you are in darkness even your own shadow will not follow you.\n\n"+
				"Being single is not a big deal b`coz sooner or later you will find your true love\n\n" +
				"Sometimes its not the person you miss,but the feelings and moments you had when you were with them\n\n" +
				"Don`t lose hope.When the SUN goes down,the STARS come out.\n\n" +
				"Keep smiling,b`coz life is a beautiful thing and there`s so much to smile about.\n\n" +
				"Sometimes you have to forgive & forget.Forgive them for hurting & forget they even existed.\n\n"+
				"If you want to know your past,look into your present conditions.If you want to know your future,look into your present actions\n\n"+
				"I don`t have ABS or orgasmic shoulder muscles but I have a Heart that will treat you right.\n\n"+
				"Don`t let time sneak up on you.Enjoy every moment that you have\n\n"+
				"It`s not a matter of finding the right person but its a matter of being the right person for the one you choose to love.\n\n"+
				"Be nice to people on your way up b`coz you will meet them on your way down\n\n"+
				"The best things in life are the people you love,the places you have seen & the memories you have made along the way.\n\n"+
				"Often in life we forget the things we should remember & remember the things we should forget.\n\n"+
				"May you follow your dreams and always believe in yourself.Keep your eyes on the stars & hope in your heart.\n\n"+
				"SMILE...It irritates those who wish to destroy you\n\n"+
				"When you are in bright light,Everyone will follow you But when you are in darkness even your own shadow will not follow you.\n\n"+
				"Life is like riding a bicycle.To keep your balance,you must keep moving\n\n"+
				"Don`t prioritize your friends over your family.Friends come & go but your family will be with you even when you`ve fallen.\n\n"+
				"If you treat me like an option,I`ll leave you like a choice.\n\n"+
				"Maturity is not when we start speaking big things.Its when we start understanding small things.\n\n";
		tvbestqoutes.setText(messages);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page_two, menu);
		return true;
	}

}
