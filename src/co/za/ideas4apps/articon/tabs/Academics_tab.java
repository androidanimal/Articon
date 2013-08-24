package co.za.ideas4apps.articon.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import co.za.ideas4apps.articon.Helper;
import co.za.ideas4apps.articon.R;

public class Academics_tab extends Fragment {
	 Helper helper = new Helper();
	 View view;
	
	@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    //set the layout you want to display in First Fragment
	//
    view = inflater.inflate(R.layout.academics_tab,
            container, false);
    
    //Helper to set font
    //
    helper = new Helper();
    helper.applyFont(view, getActivity(),Button.class,getActivity().getResources().getString(R.string.app_font));
    
//    final Button btnGr8 = (Button) view.findViewById(R.id.btnGr8);
//    final Button btnGr10 = (Button) view.findViewById(R.id.btnGr10);
//    final TextView content = (TextView) view.findViewById(R.id.academics_content);
//    
//	Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bradley Hand ITC.TTF");
//	
//    btnGr8.setTypeface(font, Typeface.BOLD);
//    btnGr8.setOnClickListener(new OnClickListener()
//    {
//    	public void onClick(View v)
//    	{
//    		content.setText(R.string.gr8_text);
//    		btnGr8.setBackgroundResource(R.drawable.button_selected);
//    		btnGr10.setBackgroundResource(R.drawable.articon_button);
//    	}
//    });
//    
//    btnGr10.setTypeface(font, Typeface.BOLD);
//    btnGr10.setOnClickListener(new OnClickListener()
//    {
//    	public void onClick(View v)
//    	{
//    		content.setText(R.string.gr10_text);
//    		btnGr10.setBackgroundResource(R.drawable.button_selected);
//    		btnGr8.setBackgroundResource(R.drawable.articon_button);
//    	}
//    });
    
    
    
    
    
    //
    //The code below is to be used in the event of a Expandable list
    //
    
//    mExpandableList = (ExpandableListView)view.findViewById(R.id.lv);
//    
//    ArrayList<ListParent> arrayParents = new ArrayList<ListParent>();
//    ArrayList<String> arrayChildren = new ArrayList<String>();

    //here we set the parents and the children

        //for each "i" create a new Parent object to set the title and the children
//        ListParent parent = new ListParent();
//        parent.setTitle("Subject Choices");
//         
//        arrayChildren = new ArrayList<String>();
//        arrayChildren.add("Grade 8 and 9");
//        arrayChildren.add("Grade 10 and 12");
            
        
//        parent.setArrayChildren(arrayChildren);

        //in this array we add the Parent object. We will use the arrayParents at the setAdapter
//        arrayParents.add(parent);

    //sets the adapter that provides data to the list.
//    mExpandableList.setAdapter(new MyCustomAdapter(getActivity(),arrayParents));
//    
//    mExpandableList.setOnChildClickListener(new OnChildClickListener() 
//    {               
//       public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) 
//       { 
//    	   if(childPosition == 0)
//    	   {
//	    	   Intent intent = new Intent(getActivity(),Grade8Activity.class);
//	    	   startActivity(intent);
//    	   }
//    	   else
//    	   {
//    		   Intent intent = new Intent(getActivity(),Grade10Activity.class);
//    		   startActivity(intent);
//    	   }
//           return true;
//       }
//    });
    
    
    return view;

	}

}