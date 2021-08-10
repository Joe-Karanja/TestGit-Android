package com.example.basicstaticalapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SuccessQuotes extends Activity {
TextView tvsuccessquotes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success_quotes);
		//find the textview in XML
				tvsuccessquotes = (TextView) findViewById(R.id.tvsuccessqoutes);
				//set some String of quotes in the textview
				String successquotes = 
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"\n\n"+
						"";
		         
				tvsuccessquotes.setText(successquotes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.success_quotes, menu);
		return true;
	}

}
