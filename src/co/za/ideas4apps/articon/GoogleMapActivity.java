package co.za.ideas4apps.articon;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class GoogleMapActivity extends FragmentActivity {
	private GoogleMap map;
	private static final LatLng ARTICON = new LatLng(-26.76580,27.85277); 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_google_map);	
		
		map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		map.addMarker(new MarkerOptions()
		.position(ARTICON)
		.title("Articon"));
		CameraPosition cameraPosition = new CameraPosition.Builder()
	    .target(ARTICON)  
	    .zoom(17)                  
	    .build();                   
	map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.google_map, menu);
		return true;
	}

}
