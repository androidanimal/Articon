package co.za.ideas4apps.articon.tabs;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import co.za.ideas4apps.articon.AboutActivity;
import co.za.ideas4apps.articon.MissionActivity;
import co.za.ideas4apps.articon.Helper;
import co.za.ideas4apps.articon.R;
import co.za.ideas4apps.articon.VisionActivity;


public class Vision_tab extends Fragment  {
	
	Intent intent;	
	Helper helper = new Helper();
	View view;
	

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    //set the layout you want to display in First Fragment
    view = inflater.inflate(R.layout.vision_tab,
            container, false);
    
    //Helper to set font
    //
    Helper helper = new Helper();
    helper.applyFont(view, getActivity(),Button.class,getActivity().getResources().getString(R.string.app_font));
 
    //Set buttons OnClick
    //
    Button btnVision = (Button) view.findViewById(R.id.btnVision);
    btnVision.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(), VisionActivity.class);
    		startActivity(intent);
    	}
    });
    
    Button btnMission = (Button) view.findViewById(R.id.btnMission);
    btnMission.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),MissionActivity.class);
    		startActivity(intent);
    	}
    });
    
    Button btnAbout = (Button) view.findViewById(R.id.btnAbout);
    btnAbout.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent (getActivity(), AboutActivity.class);
    		startActivity(intent);
    	}
    });
    
    return view;

}

@Override
public void onConfigurationChanged(Configuration newConfig) {
	super.onConfigurationChanged(newConfig);
	helper.changeWidth(view, getActivity(), newConfig, Button.class);
}


}