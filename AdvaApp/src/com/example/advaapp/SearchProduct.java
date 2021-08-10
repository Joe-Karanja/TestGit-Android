package com.example.advaapp;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SearchProduct extends Activity {
	TextView data;
    EditText search;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_product);
		data = (TextView) findViewById(R.id.data);
		search = (EditText) findViewById(R.id.search);
	}
	
	public void search(View v)
	{
		 AsyncHttpClient c = new AsyncHttpClient();
		 RequestParams params = new RequestParams();
    	 params.add("pname", search.getText().toString());
    	 
    	 
         c.post("http://10.0.2.2/advaphp/view.php", params, new AsyncHttpResponseHandler()
    	 
    	 {	 
    		public void onSuccess(int statusCode, String content) {
    			
    			data.setText(content);
    		    
    		};	
  
    	 });	
		
		
	}//end

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_product, menu);
		return true;
	}

}
