package co.za.ideas4apps.articon;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 intent = new Intent(this, TabHostActivity.class);
		 ActionBar actionBar = getActionBar();
		 actionBar.setTitle("Welcome!");
		 actionBar.setDisplayShowHomeEnabled(false);
		 
		 setContentView(R.layout.activity_main);

		
		Button btn = (Button) findViewById(R.id.main_label);
		btn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v)
			{
				startActivity(intent);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
