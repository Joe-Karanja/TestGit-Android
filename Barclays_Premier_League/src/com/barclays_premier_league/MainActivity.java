package com.barclays_premier_league;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;



public class MainActivity extends Activity{
	//declare listview
	ListView list;
	String[] itemname ={
		      "1.Leicester City",
		      "2.Tottenham FC",
		      "3.Manchester City",
		      "4.Arsenal",
		      "5.Manchester United",
		      "6.Westham United",
		      "7.Liverpool Fc",
		      "8.Southampton",
		      "9.Chelsea FC",
		      "10.Stoke City",
		      "11.Everton",
		      "12.Watford",
		      "13.West Bromwich Albion",
		      "14.Bournemoth AFC",
		      "15.Swansea City",
		      "16.Crystal Palace",
		      "17.Sunderland FC",
		      "18.Norwich",
		      "19.Newcastle United",
		      "20.Aston Villa"
	};

	
	String[] subitems ={
		      "Stadium:King Power Stadium\nManager:Claudio Ranieri",
		      "Stadium:White Hart Lane\nManager:Mauricio Pochettino",
		      "Stadium:Etihad Stadium\nManager:Manuel Pellegrini",
		      "Stadium:Fly Emirates\nManager:Arsène Wenge",
		      "Stadium:Old Traford\nManager:Louis van Gaal",
		      "Stadium:Queen Elizabeth Olympic Park\nManager:Slaven Bilić",
		      "Stadium:Anfield\nManager:Jürgen Klopp",
		      "Stadium:St Mary's Stadium\nManager:Ronald Koeman",
		      "Stadium:Stamford Bridge\nManager:Guus Hiddink",
		      "Stadium:Britannia Stadium\nManager:Britannia Stadium",
		      "Stadium:Goodison Park\nManager:Roberto Martínez",
		      "Stadium:Vicarage Road\nManager:Quique Sánchez Flores",
		      "Stadium:The Hawthorns\nManager:Tony Pulis",
		      "Stadium:Dean Court\nManager:Eddie Howe",
		      "Stadium:Liberty Stadium\nManager:Francesco Guidolin",
		      "Stadium:Selhurst Park\nManager:Alan Pardew",
		      "Stadium:Stadium of Light\nManager:Sam Allardyce",
		      "Stadium:Carrow Road\nManager:Alex Neil",
		      "Stadium:St James Park\nManager:Rafael Benítez",
		      "Stadium:Villa Park\nManager:Eric Black"
		      
		    };
	//declare image strings
	  Integer[] imgid={
	      R.drawable.leicester,
	      R.drawable.tottemham,
	      R.drawable.city,
	      R.drawable.arsenal,
	      R.drawable.manu,
	      R.drawable.westhamunited,
	      R.drawable.liverpool1,
	      R.drawable.southampton,
	      R.drawable.chelsea,
	      R.drawable.stk,
	      R.drawable.everton,
	      R.drawable.watford,
	      R.drawable.westambion,
	      R.drawable.bournemoth,
	      R.drawable.swansea,
	      R.drawable.crystalpalace,
	      R.drawable.sunderland,
	      R.drawable.norwich,
	      R.drawable.newcastle,
	      R.drawable.astonvilla,
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
		
			
			//TO DO click listeners
			 list.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					// TODO Auto-generated method stub
					
					//Leicester
					if (arg2==0)
					{
					//UON is clicked-link to another page
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Leicester+city+Fc+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==1)
					{
					//Tottenham
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Tottenham+Hotspur+FC+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==2)
					{
					//Man city
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Man+city+FC+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==3)
					{
					//Arsenal
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Arsenal+FC+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==4)
					{
					//Man u
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Man+u+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==5)
					{
					//West Ham
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=West+Ham+United+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==6)
					{
					//Liverpool
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Liverpool+FC+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==7)
					{
					//Southamton
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Southampton+FC+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==8)
					{
					//Chelsea FC
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=chelsea+fc+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==9)
					{
					//Stoke City
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=stoke+city+fc+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==10)
					{
					//Everton
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=everton+fc+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==11)
					{
					//Watford
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=watford+fc+feeds&tbm=nws"));
					startActivity(x);
					}
					
					if (arg2==12)
					{
					//West Bromwich Albion
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=west+bromwich+Albion&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					if (arg2==13)
					{
					//Bournemoth AFC
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=A.F.C.+Bournemouth&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					if (arg2==14)
					{
					//Swansea City
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Swansea+city&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
				
					
					if (arg2==15)
					{
					//Crystal Palace
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Crystal+palace&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					if (arg2==16)
					{
					//Sunderland FC
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=sunderland+afc&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					if (arg2==17)
					{
					//Norwich
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Norwich+City+FC&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					if (arg2==18)
					{
	                //Newcastle United
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Newcastle+United&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					//Aston Villa
					if (arg2==19)
					{
					Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=Aston+Villa&ie=utf-8&oe=utf-8"));
					startActivity(x);
					}
					
					
					
					
				}
			});
			
		}
	



@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

//options menu click listeners
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.uefa:
		Intent x = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=uefa+champions+league"));
		startActivity(x);
		break;
	case R.id.table:
		Intent f = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=UEfA+Champion%27s+League"));
		startActivity(f);
		
	case R.id.facup:
		Intent t = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=FA+Cup"));
		startActivity(t);
		
	case R.id.updates:
		Intent u = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=Barclays+Premier+League"));
		startActivity(u);
		
		
		case R.id.live:
			Intent l= new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bbc.com/sport/football/live-scores"));
			startActivity(l);
			
			
		case R.id.transfers:
			Intent tr= new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bbc.com/sport/football/transfers"));
			startActivity(tr);
			
			
		case R.id.fixture:
			Intent fi = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/#q=EPL+Fixtures"));
			startActivity(fi);
		
	default:
		break;
	}//end switch
	
	return super.onOptionsItemSelected(item);
}



}

