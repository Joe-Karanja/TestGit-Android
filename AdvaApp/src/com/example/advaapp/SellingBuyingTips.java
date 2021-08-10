package com.example.advaapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SellingBuyingTips extends Activity {
TextView tvtips;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selling_buying_tips);
		
		//find the TextView in XML
				tvtips = (TextView) findViewById(R.id.tvtips);
				//set some String of quotes in the TextView
			String sbtips =
				"SELLING TIPS\n\n"+	
				"1. Enter Your name in the provided space so that the buyer can familiarise with your " +
				"name in time of contant \n" +
				"2.Enter product name in the spaces provided\n" +
				"3.Give description regarding your product\n" +
				"4.Post a picture by igniting the Camera button below\n" +
				"5.Provide your contacts to enable the buyer reach you\n\n\n" +
				
				 
                "BUYING TIPS\n\n"+
                "1.Search Products Posted either by ProductName\n"+
                "2.If you find the product of your choise Call the contact number given for more infomation"
				; 
					
		         
				tvtips.setText(sbtips);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selling_buying_tips, menu);
		return true;
	}

}
