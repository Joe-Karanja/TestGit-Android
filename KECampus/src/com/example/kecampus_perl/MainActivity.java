package com.example.kecampus_perl;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ListView;



public class MainActivity extends Activity{
	//declare listview
	ListView list;
	//declare main strings
	String[] itemname ={
			"University of Nairobi",
			"KCA University",
			"Moi University",
			"Nazarene University",
			"Kenyatta University",
			"Kabarak University",
			"JKUAT",
			"Strathmore University"
		};
	
	//declare substring
	String[] subitems ={
			"Education is Power",
			"Aim for the Highest",
			"Laborarest Orare",
			"Center of Excellence",
			"Elimu ni Nguvu",
			"Best Education Partner",
			"Scalle heights of education",
			"Perfect place in Education"
		};
	//declare image strings
	Integer[] imgid={
			R.drawable.pic1,
			R.drawable.pic2,
			R.drawable.pic3,
			R.drawable.pic4,
			R.drawable.pic5,
			R.drawable.pic6,
			R.drawable.pic7,
			R.drawable.pic8,
	};
	//create the activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//access custom adapter and pass the 3 arrays
		CustomListAdapter adapter=new CustomListAdapter(this, itemname,subitems, imgid);
		list=(ListView)findViewById(R.id.list);
		list.setAdapter(adapter);//set adapter to the list
	
		
		
	}
}
