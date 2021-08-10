package com.example.basicstaticalapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class LoveQuotes extends Activity {
	TextView tvlovequotes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_love_quotes);
		
		//find the textview in XML
		tvlovequotes = (TextView) findViewById(R.id.tvloveqoutes);
		//set some String of quotes in the textview
		String lovequotes = 
				"1. I Get Jealous,\nI Get Mad,\nI Get Worried,I Get Curious..\nBut,Thats Only Bcz I Love U Soo Much \n\n" +
				"2. The More I Meet U,\nThe More U Appear New..\nThe More I Know U,\nThe More I Want To Love U..\nEach Day My Love For U Is My First Love..\nBcoz Each Day I Feel As If I Have Just Started Loving  U\n\n" +
				"3. Millions & Millions Of Years \n Would Still Not Give Me Half Enough Time..\n To Describe That Tiny Instant Of All Eternity \n When U Put Ur Arms Around Me..\n And,I Put My Arms Around U..!\n\n" +
				"4. Its Not Important That \n I`m Beautiful To U..\n It Is Beautiful That I`m.. \n Important To U..\n U Are The Most Beautiful Thing That Ever Happened To Me ..\n Love U My Sweetheart...!!!\n\n" +
				"5. It`s Crazy,The Way You See \n Someone For 2 Minutes And \n Yet It Was The Best Of Your \n Day But,	It`s Crazier When \n You Find Yourself Thinking \n About That Person For About 23 Hrs & 58 Minutes. \n\n" +
				"6. You Are Always In My Thoughts,\n Your Words Reach The Deep\n Of My Heart,Your Pictures\n Support My Fantasy,Your\n Voice Mesmerized Me,I Can\n Hardly Explain It..But,\n I Feel So Much Love For U..\n\n" +
				"7. I`m So Addicted To You,Your\n Smile Your,Laugh,Your\n Yelling,Your Talks,Your\n Crying,Your Care Your Love \n Is My Drug,If I Would Have\n Got You,Its Like A Dream\n Come True..Love You\n\n"+
				"8. I Don`t Know If This Sounds Wrong\n   Or Right,\n But I Just Want TO Kiss You All Day\n   And Night,\n Coz I Don`t Know How Lonh Would\n    I Survive,\n But I Want To Love You As Long As\n   I Am Alive\n And Whenever I Hold You So Close\n    To Me,\n Somehow I Know Your Heart Is My\n   Destiny,\n The Way You Have Loved Me Since\n    The Start,\n I Felt Your Love To The Bottom Of\n     My Heart.s\n\n"+
				"9. Am Happy To Wait For You\n When You Say'Am Buzy,Wait',\n Am Happy To Wait For You\n Knowing That You Will Never\n Turn Back,Am Happy To Wait\n Even When You Don`t Know That\n I Was Waiting Fot You,Am\n Still Waiting For You To Say\n I Love You...!!!\n\n"+
				"10. I Always Lose Control When\n You Are By My Side,You Have\n Become The Light Of My Life,\n  I Always Enjoy The Time I\n Spend With You,I Think I`m\n Falling In Love With You\n\n"+
				"11. If The Feelings Are True\n From Heart,They Are Hard\n To Replace.Remember\n You Are The Sweetest Thing\n In My Life The Loving Heart\n In Few Caring Hearts I See\n The Real Face Of Me In\n Your Tears I Will Never Let\n Them Go Away From My Heart.\n\n"+
				"12. My Sweetest Memory..\n   Ur Message\n My Biggest Sadness..\n  The Distance\n My Biggest Hope..\n  I Will See U Soon\n My Strongest Prayer..\n  Our Relationship Continues Forever..\n\n"+
				"13. Your Kiss Is Sweeter Than\n Cherries,Your Love Is More\n Beautiful Than A Bed Of\n Roses,Your Touch Is Stronger\n Than A Moutain,Your Voice\n Is As Calming As The Morning\n Birds Singing, You Remain\n In Ma Heart Forever My Love.\n\n"+
				"14. I Forget The Whole World,\n And Lost In Your Silky Soft\n Arms I Love This Feeling\n Of Being With You\n Every Day,Every Moments!\n\n"+
				"15. My Heart Could Feel You\n My Mind Could Imagine You\n My Eyes Could See You\n My Breath Could Sense You\n My Silence Could Mean You\n   I Knew I Loved You\n Even Before I Met You\n\n"+
				"16. Hearts Could Only Love For\n A While..Feets Could Only\n Walk For Some Miles..Clothes\n Wont Forever Be In Style..\nBut,Having You As My Lover\n Is Forever Worth While..!\n\n"+
				"17. I Don`t Want To Be Ur\n Favourite Or Ur Best\n I Want To Be Ur Only 	One And\n Make U Forget The Rest\n\n"+
				"18. I Need 3 Things In My Life:\n The Sun For The Day..\n The Moon For The Night..\n  			And\n U For The Rest Of My Life..!\n\n"+
				"19. When You Touched My Hand\n For The First Time..It Was\n A Feeling That Can Be Said\n As Divine..My Heart Was\n Waiting For This To Happen\n Evee,I Wanted Nothing More\n Than To Hold It Forever\n\n"+
				"20. One Day You`ll Ask Me Which\n Is More Important To Me,\n	You Or My Life.I`ll Say,Ofcourse,My Life.And You`ll\n Go And Walk Away Without Even\n Knowing That You Are My Life\n\n";         
		tvlovequotes.setText(lovequotes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.love_quotes, menu);
		return true;
	}

}
