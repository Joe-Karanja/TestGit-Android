package com.example.advaapp;

import java.io.File;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProductRegistrationPortal extends Activity {
			 
	EditText name;
	EditText pname;
	EditText pdescription;
	EditText cost;
	EditText contacts;
	//ImageView image;
	Button post;
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	private File fileUri;
	public static final int MEDIA_TYPE_IMAGE = 1;

	
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product_registration_portal);
 name =(EditText) findViewById(R.id.name);
 pname = (EditText) findViewById(R.id.pname);
 pdescription = (EditText) findViewById(R.id.pdescription);
 cost = (EditText) findViewById(R.id.cost);
 contacts = (EditText) findViewById(R.id.contacts);
}

public void capture(View v)
{
Intent intent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
fileUri = getOutputMediaFile(MEDIA_TYPE_IMAGE); // create a file to save the image
intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name

startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
}//end






/** Create a File for saving an image or video */
private static File getOutputMediaFile(int type){
    // To be safe, you should check that the SDCard is mounted
    // using Environment.getExternalStorageState() before doing this.

    File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
              Environment.DIRECTORY_PICTURES), "MyCameraApp");
    // This location works best if you want the created images to be shared
    // between applications and persist after your app has been uninstalled.

    // Create the storage directory if it does not exist
    if (! mediaStorageDir.exists()){
        if (! mediaStorageDir.mkdirs()){
            Log.d("MyCameraApp", "failed to create directory");
            return null;
        }
    }
	return null;
}


public void getdata(View v)
{
	 Intent x = new Intent(this,SearchProduct.class);
    startActivity(x);    	 
}

public void post(View v)
{

	//c = can access www
    AsyncHttpClient c = new AsyncHttpClient();
    
    RequestParams params = new RequestParams();
    params.add("name", name.getText().toString());
    params.add("pname", pname.getText().toString());
    params.add("pdescription", pdescription.getText().toString());
    params.add("cost", cost.getText().toString());
    params.add("contacts", contacts.getText().toString());
    //params.add("image", image.getContext().toString());
     
    if(name.getText().toString().length()< 1){
    	
    	
    }
if(pname.getText().toString().length()< 1){
    	
    	
    }

if(pdescription.getText().toString().length()< 1){
	
	
}

if(cost.getText().toString().length()< 1){
	
	
}

if(contacts.getText().toString().length()< 1){
	
	
}


      
    
    
    c.post("http://10.0.2.2/advaphp/add.php", params, new AsyncHttpResponseHandler()
    
    {   
       public void onSuccess(int statusCode, String content) {
           
           Toast.makeText(ProductRegistrationPortal.this, "Post Successful", Toast.LENGTH_LONG).show();
           name.setText("");
           
       };  
       
       public void onFailure(Throwable error, String content) {
           Toast.makeText(ProductRegistrationPortal.this, "Problem incurred!! Please Try Again", Toast.LENGTH_LONG).show();
       };
            

    });
}




@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present
		getMenuInflater().inflate(R.menu.product_registration_portal, menu);
		return true;
	}

}
