package com.malnutrition.malnutritionsceening;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;


public class SlidingMenuOptionList extends SherlockListFragment {

	String[] list_contents = {
			"Add a patient",
			"Edit a patient",
			"Delete a patient"
	};
	//private AreaCursorAdapter mAdapter;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.list, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list_contents));
		 //mAdapter = new AreaCursorAdapter(this, null);
	      //  setListAdapter(mAdapter);
	}
	
	//TODO onClick handler for Slide menu options.
	@Override
    public void onListItemClick(ListView parent, View v, int position, long id) { 
		

    }
}
