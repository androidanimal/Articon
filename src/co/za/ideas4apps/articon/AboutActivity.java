package co.za.ideas4apps.articon;



import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.VideoView;

public class AboutActivity extends Activity {
	ActionBar actionBar;
	VideoView video;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		actionBar = this.getActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);

		video = (VideoView) findViewById(R.id.video);					
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.demo));
		video.start();
		
		video.setOnTouchListener(new OnTouchListener(){
			public boolean onTouch(View v, MotionEvent event){
				if(video.isPlaying()){
					video.pause();
				}
				else
				{
					video.start();
				}
			return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}
	
	@Override  
	public boolean onOptionsItemSelected(MenuItem item)
	{
        Intent parentActivityIntent = new Intent(this,TabHostActivity.class);
        startActivity(parentActivityIntent);

		return true;
		
	}
	
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    	super.onConfigurationChanged(newConfig);
    	//setContentView(R.layout.activity_tab_host);
    	LayoutParams params;
    	if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
    		
			params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    	}
    	else{
			params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);			
    	}
    	video.setLayoutParams(params);
    }

}
