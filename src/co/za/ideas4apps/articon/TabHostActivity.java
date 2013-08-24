package co.za.ideas4apps.articon;

import java.util.Locale;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import co.za.ideas4apps.articon.tabs.Academics_tab;
import co.za.ideas4apps.articon.tabs.Arts_tab;
import co.za.ideas4apps.articon.tabs.Find_us_tab;
import co.za.ideas4apps.articon.tabs.More_tab;
import co.za.ideas4apps.articon.tabs.Vision_tab;

public class TabHostActivity extends FragmentActivity implements
		ActionBar.TabListener {
	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	ActionBar actionBar;
	Helper helper = new Helper();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_host);
		
			
		// Set up the action bar.
		actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		// Create the adapter that will return a fragment for each
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
		//Create Tabs and set the custom layouts for each action bar item
		//
		CreateTab(R.layout.custom_vision,R.id.tab_text_vision, R.id.tab_icon_vision, R.drawable.icon1x, "Vision");
		CreateTab(R.layout.custom_arts,R.id.tab_text_arts, R.id.tab_icon_arts, R.drawable.icon2x, "Arts");
		CreateTab(R.layout.custom_academics,R.id.tab_text_academics, R.id.tab_icon_academics, R.drawable.icon3x, "Academics");
		CreateTab(R.layout.custom_find_us,R.id.tab_text_find_us, R.id.tab_icon_find_us, R.drawable.icon4x, "Find Us");
		CreateTab(R.layout.custom_more,R.id.tab_text_more, R.id.tab_icon_more, R.drawable.icon5x, "More");

		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});
		
		// For each of the sections in the app, add a tab to the action bar.
		//for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.
		
	}
	
	
	//Creates a tab and sets a custom view for the tab bar
	//
	public void CreateTab(int customView, int titleView,int titleImage, int titleDrawable, String title){
			
		actionBar.addTab(actionBar.newTab()
				 .setTabListener(this)
				 .setCustomView(customView));	
		helper.applyTabStyle(titleView, titleImage, titleDrawable, title, this);
	}
	
 	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.tab_host, menu);
		
		return true;
	}
	 

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}
@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.

			if(position == 0)
			{				
				return new Vision_tab();
			}
			if(position == 1)
			{
				return new Arts_tab();
			}
			if(position == 2)
			{
				return new Academics_tab();
			}
			if(position == 3)
			{
				return new Find_us_tab ();
			}
			if(position == 4)
			{
				return new More_tab();
			}
			else
				return null;
			
		}

		@Override
		public int getCount() {
			Resources res = getResources();
			return res.getInteger(R.integer.number_of_tabs);
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.vision_title).toUpperCase(l);
			case 1:
				return getString(R.string.arts_title).toUpperCase(l);
			case 2:
				return getString(R.string.academics_title).toUpperCase(l);
			case 3:
				return getString(R.string.find_us_title).toUpperCase(l);
			case 4:
				return getString(R.string.more_title).toUpperCase(l);
			}
			return null;
		}
		
//		//Set icons
//		public int getPageIcon(int position)
//		{
//			switch (position) {
//			case 0:
//				return R.drawable.icon1;
//			case 1:
//				return R.drawable.icon2;
//			case 2:
//				return R.drawable.icon3;
//			case 3:
//				return R.drawable.icon4;
//			case 4:
//				return R.drawable.icon5;
//			}
//			return 0;
//		}
	}
	
}
