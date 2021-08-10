package com.em;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



public class NPRNewsDetails extends Activity {
	//a main category subject has already been selected by the user
	//(data <"urlCaption", "urlAddress"> comes in a bundle sent
	// by main, access web-feed and show corresponding headlines
	ArrayList<SingleNewsItem> newsList= new ArrayList<SingleNewsItem>();
	ArrayAdapter<String> aa;
	ListView myListView;
	String urlAddress= "";
	String urlCaption= "";
	SingleNewsItem selectedNewsItem;
	Context context= getApplication();
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	myListView= (ListView)this.findViewById(R.id.myListView);
	//create a local Intent handler (needed to process input parameters)
	Intent myLocalIntent= getIntent();
	//grab the data bundle with all the pieces sent to us
	//it contains 1. url-address and 2. caption-text
	Bundle myBundle= myLocalIntent.getExtras();
	urlAddress= myBundle.getString("urlAddress");
	urlCaption= myBundle.getString("urlCaption");
	
	//top caption for this screen
	String todayStr= AndroNPR.niceDate();
	this.setTitle(" Breaking News  -"+ urlCaption+ " \t"+ todayStr);
	//clicking a line shows more about selected news item
	myListView= (ListView)this.findViewById(R.id.myListView);
	myListView.setOnItemClickListener(new OnItemClickListener() {
	public void onItemClick(AdapterView<?> _av, View v,int index,long id) {
	selectedNewsItem= newsList.get(index);
	showNiceDialogBox(selectedNewsItem, context);
	}
	});
	}//onCreate
	@Override
	protected void onResume() {
	super.onResume();
	try{
	URL url= new URL(urlAddress);
	URLConnection connection;
	connection = url.openConnection();
	HttpURLConnection httpConnection= (HttpURLConnection) connection;
	int responseCode= httpConnection.getResponseCode();
	
	
	if(responseCode== HttpURLConnection.HTTP_OK) {
		InputStream in = httpConnection.getInputStream();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document dom= db.parse(in);
		Element docEle= dom.getDocumentElement();
		// NodeListnl= docEle.getElementsByTagName("entry");
		NodeList nl= docEle.getElementsByTagName("item");
		if((nl!= null) && (nl.getLength() > 0)) {
		for(int i= 0; i< nl.getLength(); i++) {
		dissectNode(nl, i);
		}// for
		}// if
		}// if
		int layoutID= R.layout.my_simple_list_item_1;
		ArrayAdapter<SingleNewsItem> aaNews=
		new ArrayAdapter<SingleNewsItem>(this, layoutID, newsList);
		myListView.setAdapter(aaNews);
		} catch(MalformedURLException e) {
		e.printStackTrace();
		} catch(IOException e) {
		e.printStackTrace();
		Toast.makeText(context, "Trouble!!!", 1).show();
		} catch(ParserConfigurationException e) {
		e.printStackTrace();
		} catch(SAXException e) {
		e.printStackTrace();
		}
		}// onResume
	
	
	
	public void dissectNode(NodeList nl, int i){
		try{
		Element entry = (Element) nl.item(i);
		Element title = (Element) entry.getElementsByTagName(
		"title").item(0);
		Element description = (Element) entry.getElementsByTagName(
		"description").item(0);
		Element pubDate= (Element) entry.getElementsByTagName(
		"pubDate").item(0);
		Element link = (Element) entry.getElementsByTagName(
		"link").item(0);
		String titleValue= title.getFirstChild().getNodeValue();
		String descriptionValue=description.getFirstChild().getNodeValue();
		String dateValue= pubDate.getFirstChild().getNodeValue();
		String linkValue= link.getFirstChild().getNodeValue();
		SingleNewsItem singleItem= new SingleNewsItem(
		dateValue,titleValue,descriptionValue, linkValue);
		newsList.add(singleItem);
		} catch(DOMException e) {
		e.printStackTrace();
		}
		}//dissectNode
	
	
	public void showNiceDialogBox(SingleNewsItem selectedNewsItem, Context context){
		//assemble a nice looking dialog box
		try{
		final Uri myLink= Uri.parse(selectedNewsItem.getLink());
		AlertDialog.Builder myBuilder= new AlertDialog.Builder(this);
		myBuilder
		.setIcon(R.drawable.images)
		.setTitle(urlCaption)
		.setMessage( selectedNewsItem.getTitle() + "\n\n"
		+ selectedNewsItem.getDescription() + "\n")
		.setPositiveButton("Close", null)
		.setNegativeButton("More", new OnClickListener() {
		public void onClick(DialogInterface dialog, int whichOne) {
		// use native web browsing
		Intent webIntent= new Intent( Intent.ACTION_VIEW, myLink);
		startActivity(webIntent);
		}
		})//setNegativeButton
		.show();
		} catch(Exception e) {
		e.printStackTrace();
		}
		}//showNiceDialogBox
		}//NprNewsDetails