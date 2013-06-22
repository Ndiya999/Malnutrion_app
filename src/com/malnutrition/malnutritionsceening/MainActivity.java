package com.malnutrition.malnutritionsceening;

import com.actionbarsherlock.view.Menu;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;



public class MainActivity extends BaseActivity {

	private Fragment mContent;
	
	public MainActivity(){
		super(R.string.app_name);
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock_Light);
       // setContentView(R.layout.activity_main);
        
        if(savedInstanceState != null)
        	mContent = getSupportFragmentManager().getFragment(savedInstanceState, "mContent");
        if(mContent == null)
        	mContent = new Frag_StartPage();
        
        setContentView(R.layout.content_frame);
        getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.content_frame, mContent).commit();
        
        setBehindContentView(R.layout.menu_frame);
        getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.menu_frame, new SlidingMenuOptionList()).commit();
        
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        setSlidingActionBarEnabled(true);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
    	super.onSaveInstanceState(outState);
    	getSupportFragmentManager().putFragment(outState, "mContent", mContent );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
