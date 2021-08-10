package com.example.advaapp;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView data;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void google(View v)
    {
    	Intent x =new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
    	startActivity(x);
    }
    
    public void fb(View v)
    {
    	Intent x =new Intent(Intent.ACTION_VIEW,Uri.parse("http://facebook.com"));
    	startActivity(x);
    }
    
    public void twitter(View v)
    {
    	Intent x =new Intent(Intent.ACTION_VIEW,Uri.parse("http://twitter.com"));
    	startActivity(x);
    }
    
    public void register(View v)
    {
    Intent x = new Intent(this,ProductRegistrationPortal.class);
    startActivity(x);
    }//end
    
    public void search (View v)
    {
    Intent x =new Intent(this,SearchProduct.class);	
    startActivity(x);
    
    }
    
    public void tips(View v)
    {
    Intent x = new Intent(this,SellingBuyingTips.class);
    startActivity(x);
    }
    
    public void viewposts(View v)
    {
    	AsyncHttpClient c = new AsyncHttpClient();
		 RequestParams params = new RequestParams();
   	 params.add("pname", search.getText().toString());
        c.post("http://10.0.2.2/advaphp/advaview1.php", params, new AsyncHttpResponseHandler()
   	 
   	 {	 
   		public void onSuccess(int statusCode, String content) {
   			
   			data.setText(content);
   		    
   		};	
 
   	 });	
		
    }
   
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
