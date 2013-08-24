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

import co.za.ideas4apps.articon.DanceActivity;
import co.za.ideas4apps.articon.DesignActivity;
import co.za.ideas4apps.articon.DramaActivity;
import co.za.ideas4apps.articon.HospitalityActivity;
import co.za.ideas4apps.articon.MusicActivity;
import co.za.ideas4apps.articon.Helper;
import co.za.ideas4apps.articon.R;
import co.za.ideas4apps.articon.VisualActivity;

public class Arts_tab extends Fragment {
	Intent intent;
	Helper helper = new Helper();
	View view;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    //set the layout you want to display in First Fragment
    view = inflater.inflate(R.layout.arts_tab,
            container, false); 
    
    //Helper to set font
    //
    helper.applyFont(view, getActivity(),Button.class,getActivity().getResources().getString(R.string.app_font));
    
    //Set button click events
    //
    Button btnDance = (Button) view.findViewById(R.id.btnDance);
    btnDance.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),DanceActivity.class);
    		startActivity(intent);
    		
    	}
    });
    
    Button btnVisual = (Button) view.findViewById(R.id.btnVisual);
    btnVisual.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),VisualActivity.class);
    		startActivity(intent);
    		
    	}
    });
    
    
    Button btnHospitality = (Button) view.findViewById(R.id.btnHospitality);
    btnHospitality.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),HospitalityActivity.class);
    		startActivity(intent);
    		
    	}
    });
    
    
    Button btnDrama = (Button) view.findViewById(R.id.btnDrama);
    btnDrama.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),DramaActivity.class);
    		startActivity(intent);
    		
    	}
    });
    
    Button btnDesign = (Button) view.findViewById(R.id.btnDesign);
    btnDesign.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),DesignActivity.class);
    		startActivity(intent);
    		
    	}
    });
    
    
    Button btnMusic = (Button) view.findViewById(R.id.btnMusic);

    btnMusic.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		intent = new Intent(getActivity(),MusicActivity.class);
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