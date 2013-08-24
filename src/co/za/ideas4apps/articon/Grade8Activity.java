package co.za.ideas4apps.articon;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Grade8Activity extends Activity {
	ActionBar actionBar;
	AlertDialog.Builder dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grade8);
		
		actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		dialog = new AlertDialog.Builder(this);
		
		Button btnSubjects = (Button) findViewById(R.id.btnSubjects8);
		btnSubjects.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
	    		dialog.setTitle("Choice subjects");
	    		dialog.setMessage(Html.fromHtml("Dance <br/>Drama <br/>Design <br/> " +
	    										"Music <br/>Visual Art <br/> Hospitality Studies"));
	    		dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    	           public void onClick(DialogInterface dialog, int id) {
	    	                dialog.cancel();
	    	           }
	    	       });
	    		dialog.create();
	    		dialog.show();
			}
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grade8, menu);
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
