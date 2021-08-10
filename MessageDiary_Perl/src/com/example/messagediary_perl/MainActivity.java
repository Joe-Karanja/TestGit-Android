package com.example.messagediary_perl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //handle button
    EditText idno,message;
    public void save(View v)
    {
    idno= (EditText) findViewById(R.id.idno);
    message = (EditText) findViewById(R.id.message);
    //get user Inputs
    String id = idno.getText().toString();
    String msg = message.getText().toString();
    
    //SQLite to save
    //create an object to help access save method
    Handler h = new Handler(this);
    h.save(id, msg);//DONE
    //clear text
    
    idno.setText("");
    message.setText("");
    
    //after save display
    String x = h.getData();
    Toast.makeText(this, x, Toast.LENGTH_LONG).show();
    
    }//end


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
