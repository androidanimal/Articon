package co.za.ideas4apps.articon;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//Helper Class to apply styling etc.
//
public class Helper {

	
	public Helper(){
	
	}
	
	//TODO: needs to be more generic: layout-type and layout-id
	public boolean applyFont(View view, Activity activity, Class classToFind, String fontName) 
	{
		LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);
		Typeface font = Typeface.createFromAsset(activity.getAssets(), fontName );
		
	    for (int i = 0; i < layout.getChildCount(); i++) 
	    {
	        View v = layout.getChildAt(i);
	        Class c = v.getClass();
	        if (c == classToFind) 
	        {
	            Button but = (Button) v;
	            but.setTypeface(font, Typeface.BOLD);
	        }
	    }
	    return true;
	}
	
	//Iterates through a linear layout with id = 'layout'
	//and finds a specified class and then sets the width
	//based on orientation of screen
	//TODO: needs to be more genereic: layout-type and layout-id
	public boolean changeWidth(View view, Activity activity, Configuration config, Class classToFind)
	{
		LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);
		for (int i = 0; i < layout.getChildCount(); i++) 
	    {
	        View v = layout.getChildAt(i);
	        Class currentClass = v.getClass();
	        if (currentClass == classToFind)
	        {
	            Button but = (Button) v;
            	LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)but.getLayoutParams();
            	params.setMargins(5,5,5,5);
	            
	            if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){

	            	params.width = 800;
	            	
	            }
	            else{
	            	params.width = 400;
	            }
	            but.setLayoutParams(params); 	
	        }
	    }
		return true;
	}
	
	//Applies style to custom tab in actionbar
	//TODO:needs to be more generic: specify what color
	public boolean applyTabStyle(int titleView,int titleImage, int titleDrawable, String title, Activity activity)
	{
		((TextView) activity.findViewById(titleView)).setText(title);
		((TextView) activity.findViewById(titleView)).setTextColor(activity.getResources().getColor(R.color.WhiteSmoke));
		((ImageView) activity.findViewById(titleImage)).setImageDrawable(activity.getResources().getDrawable(titleDrawable));
		return true;
	}

}
