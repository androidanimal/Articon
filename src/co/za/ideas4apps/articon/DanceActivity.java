package co.za.ideas4apps.articon;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class DanceActivity extends Activity implements OnInitializedListener {

	ActionBar actionBar; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dance);
		actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		

	    YouTubePlayerFragment youTubePlayerFragment =
	        (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.youtube_fragment);
	    youTubePlayerFragment.initialize("AIzaSyA68QWc7CfOFj0QtzwWvvrOe1Nkrm3gO9E", this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dance, menu);

		return true;
	}
	
	@Override 
	public boolean onOptionsItemSelected(MenuItem item)
	{
        Intent parentActivityIntent = new Intent(this,TabHostActivity.class);
        startActivity(parentActivityIntent);
        finish();
		return true;
	}

	  @Override
	  public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
	      boolean wasRestored) {
	    if (!wasRestored) {
	      player.cueVideo("BZHDFliS6vo");
	    }
	  }
	  
	  protected YouTubePlayer.Provider getYouTubePlayerProvider() {
	    return (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.youtube_fragment);
	  }

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		
	}


}
