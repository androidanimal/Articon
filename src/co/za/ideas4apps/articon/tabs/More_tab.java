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

import co.za.ideas4apps.articon.ContactUsActivity;
import co.za.ideas4apps.articon.Helper;
import co.za.ideas4apps.articon.R;

public class More_tab extends Fragment {
	
	Helper helper = new Helper();
    View view;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    //set the layout you want to display in First Fragment
    view = inflater.inflate(R.layout.more_tab,
            container, false);
    
    //Helper to set font
    //
    
    helper.applyFont(view, getActivity(),Button.class, "Bradley Hand ITC.TTF");
    
    final Button btnContact = (Button) view.findViewById(R.id.btnContactUs);
    btnContact.setOnClickListener(new OnClickListener()
    {
    	public void onClick(View v){
    		Intent intent = new Intent(getActivity(),ContactUsActivity.class);
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