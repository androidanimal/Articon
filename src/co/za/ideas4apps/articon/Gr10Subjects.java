package co.za.ideas4apps.articon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Gr10Subjects extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	    //set the layout you want to display in First Fragment
	    View view = inflater.inflate(R.layout.activity_grade10,
	            container, false); 
	    
	    return view;
	}

}
