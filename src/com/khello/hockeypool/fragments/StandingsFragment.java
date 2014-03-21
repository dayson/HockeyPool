package com.khello.hockeypool.fragments;

import com.khello.navigationdrawer.R;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StandingsFragment extends Fragment {
	
	public StandingsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_standings, container, false);
         
        return rootView;
    }
}

