package com.example.messagediary_perl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Handler extends SQLiteOpenHelper {
    Context context;
	public Handler(Context context) {
		//this is the DB name 'SocialDB'   & '1' is version
		super(context, "socialdb", null, 1);
		this.context=context;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//create Table 'users'
		db.execSQL("CREATE TABLE users (id INT(10),message TEXT(500));");
	}

	//this method saves 2 variables
	public void save(String id,String message)
	{
		//get writable database
		SQLiteDatabase db = this.getWritableDatabase();
		//query to INSERT Records
		db.execSQL("INSERT INTO users(id,message)VALUES('"+id+"','"+message+"');");
	    Toast.makeText(context, "Saved", Toast.LENGTH_LONG).show();
	}
	
	 
	 
	 //get data method: NB: This method returns a String
	 public String getData() {
	     //get readable DB
		 SQLiteDatabase db = this.getReadableDatabase(); 
		 //query form users table
		 final Cursor c = db.rawQuery("SELECT * FROM users", null);
         //count if rows are 0
	     if(c.getCount() == 0){
	 	
	 		Toast.makeText(context, "Not Found", Toast.LENGTH_SHORT).show();
	 		c.close();
	 	 }
	      
	     String result = "";
	     //get colms indexes 
	     int id = c.getColumnIndex("id");
	     int message = c.getColumnIndex("message");
	     
	     //loop all rows
	     while(c.moveToNext())
	     {
	    	 result = result + "ID :"+c.getString(id) + "\n\nName " + c.getString(message)+"\n";
	    	 
	     }
         //return a result
	     return result;
	}//end get Data

	//ignore
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
