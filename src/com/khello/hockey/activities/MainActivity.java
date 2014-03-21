package com.khello.hockey.activities;

import com.khello.hockey.fragments.HomeFragment;
import com.khello.hockey.navdrawer.AbstractNavDrawerActivity;
import com.khello.hockey.navdrawer.NavDrawerActivityConfiguration;
import com.khello.hockey.navdrawer.NavDrawerAdapter;
import com.khello.hockey.navdrawer.INavDrawerItem;
import com.khello.hockey.navdrawer.NavMenuItem;
import com.khello.hockey.navdrawer.NavMenuSection;
import com.khello.navigationdrawer.R;
import com.khello.navigationdrawer.R.drawable;
import com.khello.navigationdrawer.R.id;
import com.khello.navigationdrawer.R.layout;
import com.khello.navigationdrawer.R.string;

import android.os.Bundle;

public class MainActivity extends AbstractNavDrawerActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ( savedInstanceState == null ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();
        }
    }
    
    @Override
    protected NavDrawerActivityConfiguration getNavDrawerConfiguration() {
        
        INavDrawerItem[] menu = new INavDrawerItem[] {
                NavMenuSection.create( 100, "Demos"),
                NavMenuItem.create(101,"List/Detail (Fragment)", "navdrawer_friends", false, this),
                NavMenuItem.create(102, "Airport (AsyncTask)", "navdrawer_airport", true, this), 
                NavMenuSection.create(200, "General"),
                NavMenuItem.create(202, "Rate this app", "navdrawer_rating", false, this),
                NavMenuItem.create(203, "Eula", "navdrawer_eula", false, this), 
                NavMenuItem.create(204, "Quit", "navdrawer_quit", false, this)};
        
        NavDrawerActivityConfiguration navDrawerActivityConfiguration = new NavDrawerActivityConfiguration();
        navDrawerActivityConfiguration.setMainLayout(R.layout.activity_main);
        navDrawerActivityConfiguration.setDrawerLayoutId(R.id.drawer_layout);
        navDrawerActivityConfiguration.setLeftDrawerId(R.id.left_drawer);
        navDrawerActivityConfiguration.setNavItems(menu);
        navDrawerActivityConfiguration.setDrawerShadow(R.drawable.drawer_shadow);       
        navDrawerActivityConfiguration.setDrawerOpenDesc(R.string.drawer_open);
        navDrawerActivityConfiguration.setDrawerCloseDesc(R.string.drawer_close);
        navDrawerActivityConfiguration.setBaseAdapter(
            new NavDrawerAdapter(this, R.layout.navdrawer_item, menu ));
        return navDrawerActivityConfiguration;
    }
    
    @Override
    protected void onNavItemSelected(int id) {
        switch ((int)id) {
        case 101:
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();
            break;
        case 102:
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();
            break;
        }
    }
}