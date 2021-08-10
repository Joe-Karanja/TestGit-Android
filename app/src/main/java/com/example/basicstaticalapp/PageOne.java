package com.example.basicstaticalapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class PageOne extends Activity {

	TextView tvquotes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page_one);
		//find the textview in XML
		tvquotes = (TextView) findViewById(R.id.tvqoutes);
		//set some String of quotes in the textview
		String quotes = 
				"No matter how long we have travelled on the wrong road,we can always turn around.\n\n"+
				"When your enemies are making mistakes,don`t interrupt them.\n\n"+
				"The whole world is great!!!,that is...until you wake up.\n\n"+
				"Some times the best revenge is moving forward & being happy despite the people that try to drag you down.\n\n"+
				"Don`t worry about tomorrow,you did that yesterday.\n\n"+
				"My life is open book but I don`t allow everyone to read it.\n\n"+
				"I don`t like to think myself as 'Special' I like to think myself as limited edition.\n\n"+
				"Can you stop being soo attractive?I`m trying to move on here.\n\n"+
				"You can`t make the same mistake twice.The second time you make it,it`s no longer a mistake,it`s a choice.\n\n"+
				"Genius by birth,evil by nature,human by chance.\n\n"+
				"I won`t try to be awesome,awesome tries to be me.\n\n"+
				"My mind tells me to give up,my heart won`t` let me.\n\n"+
				"Would like to remind you that amateurs built the ark,professionals built the Titanic.\n\n"+
				"If somebody really cares about you they will never put you on back burner.\n\n"+
				"You don`t` have to watch what you say if you watch what you think.\n\n"+
				"If people are trying to bring you down,it only means that you are above them.\n\n"+
				"People wear masks to see who really cares enough to see through it.I built a wall around me to see who would be brave enough to climb it.\n\n"+
				"There is a thin line between insanity & genius.I,Myself,Am in the middle,& quite frankly,I enjoy every second of it.\n\n"+
				"Crazy people love crazy people coz normal people don`t` understand.\n\n"+
				"Problems of solving a problem is not a problem,but whwn a problem solves a problem without any problem then the problem is not at all a problem.";
         
		tvquotes.setText(quotes);
				
		
	}

	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page_one, menu);
		return true;
	}

}
