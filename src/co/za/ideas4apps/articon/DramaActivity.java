package co.za.ideas4apps.articon;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DramaActivity extends Activity {
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drama);
		
		actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drama, menu);
		return true;
	}
	@Override 
	public boolean onOptionsItemSelected(MenuItem item)
	{
        Intent parentActivityIntent = new Intent(this,TabHostActivity.class);
        startActivity(parentActivityIntent);
        
		return true;
	}
}
