package com.em;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
public class AndroNPR extends Activity {
ArrayAdapter<String> aa;
ListView myListView;
Context context;
SingleNewsItem selectedNewsItem;
//links to news feeds i.e BBC,NTV,CNN etc
String [] myUrlAddress= {
		"https://www.google.com/#q=Barclays+Premier+League+feeds&tbm=nws",
		"https://www.google.com/#q=Spanish+Laliga+feeds&tbm=nws",
		"https://www.google.com/#q=italian+serie+A+feeds&tbm=nws",
		"https://www.google.com/#q=Bundesliga+feeds&tbm=nws",
		"https://www.google.com/#q=UEFA+Champions+league+feeds&tbm=nws",
		"https://www.google.com/#q=fa+cup+feeds&tbm=nws",
		"https://www.google.com/#q=Barclays+Premier+League+feeds&tbm=nws",
		"https://www.google.com/#q=Spanish+Laliga+feeds&tbm=nws",
		"https://www.google.com/#q=italian+serie+A+feeds&tbm=nws",
		"https://www.google.com/#q=Bundesliga+feeds&tbm=nws",
		"https://www.google.com/#q=UEFA+Champions+league+feeds&tbm=nws",
		

		
		
		};
     //Titles to be shown to users
		String [] myUrlCaption= {
				  "World Politics",
			      "Sports News",
			      "Fashions",
			      "New Music",
			      "New Movies",
			      "Gossips",
			      "Job Vacancies",
			      "ShoutOuts",
			      "Phones,Tablets & Laptops Models",
			      "Latest Cars Model",
			      "Motorbikes Models"
			      
			   


			      
		
		};
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		context= getApplicationContext();
		//add the above arrays in ListView
		this.setTitle("Latest Headline News "+ niceDate() );
		myListView= (ListView)this.findViewById(R.id.myListView);
		myListView.setOnItemClickListener(new OnItemClickListener() {
		public void onItemClick(AdapterView<?> _av, View v,int index,long id) {
		String urlAddress= myUrlAddress[index];
		String urlCaption= myUrlCaption[index];
		//create an Intent to talk to Activity2
		//check if Internet is available
		if(isNetworkAvailable())
		{
		Intent NprNewsDetailsIntent= new Intent(
		AndroNPR.this, NPRNewsDetails.class);
		//prepare a Bundle and add the data pieces to be sent
		Bundle myData= new Bundle();
		myData.putString("urlAddress", urlAddress);
		myData.putString("urlCaption", urlCaption);
		NprNewsDetailsIntent.putExtras(myData);
		startActivity(NprNewsDetailsIntent);
		}
		//NO Internet
		else {
			Toast.makeText(getApplicationContext(), "No INTERNET", Toast.LENGTH_LONG).show();
		}
		}
		});
		
		
		//bind main category list (Top News, ...) to the thelistView
		//show list and get ready for user to click on a category
		int  layoutID= R.layout.my_simple_list_item_1;
		aa= new ArrayAdapter<String>(this, layoutID, myUrlCaption);
		myListView.setAdapter(aa);
		}//onCreate
		
		//This methods shows date in each news displayed
		public static String niceDate() {
		DateFormatSymbols dfs= new DateFormatSymbols();
		// to get short weekday-month_nameString arrays
		String shortWeekdaysArray[] = dfs.getShortWeekdays();
		String shortMonthArray[] = dfs.getShortMonths();
		Calendar cal = Calendar.getInstance(Locale.US);
		int dd= cal.get(Calendar.DAY_OF_MONTH);
		int mm = cal.get(Calendar.MONTH);
		String mmText= shortMonthArray[mm];
		int yy= cal.get(Calendar.YEAR);
		int wd = cal.get(Calendar.DAY_OF_WEEK);
		String wdText= shortWeekdaysArray[wd];
		return( wdText+ " "+ mmText+ " "+ dd+ ", "+ yy);
		}// niceDate
		
        //check if internet is available
		private boolean isNetworkAvailable() {
		    ConnectivityManager connectivityManager 
		         = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		    return activeNetworkInfo != null;
		}

}// AndroNPR
