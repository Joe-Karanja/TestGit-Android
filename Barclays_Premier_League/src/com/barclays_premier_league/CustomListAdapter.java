package com.barclays_premier_league;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] mainname;
	private final String[] subitems;
	private final Integer[] imgid;
	//Constructor receives- passes arrays from main activity
	public CustomListAdapter(Activity context, String[] mainname,String[] subitems, Integer[] imgid) {
		super(context, R.layout.mylist, mainname);
		// TODO Auto-generated constructor stub
		//initialize them to instance variables
		this.context=context;
		this.mainname=mainname;
		this.subitems=subitems;
		this.imgid=imgid;
	}
	//This is the main Adapter-sets specific arrays @ different poistion in mylist.xml 
	public View getView(int position,View view,ViewGroup parent) {
		LayoutInflater inflater=context.getLayoutInflater();
		View rowView=inflater.inflate(R.layout.mylist, null,true);
		//we find the all the views
		//we set the arrays in this views
		TextView mainTitle = (TextView) rowView.findViewById(R.id.main);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
		TextView txtsub = (TextView) rowView.findViewById(R.id.sub);
		
		mainTitle.setText(mainname[position]);
		imageView.setImageResource(imgid[position]);
		txtsub.setText(subitems[position]);
		return rowView;
		
	};
}
