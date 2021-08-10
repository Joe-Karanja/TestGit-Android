package com.example.mytrivia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ResultsActivity extends Activity {
    TextView pointsearned;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		pointsearned = (TextView) findViewById(R.id.pointsearned);
		Bundle b = getIntent().getExtras();
		int rpoints = b.getInt("points");
		pointsearned.setText("YOU GOT "+rpoints);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

}
