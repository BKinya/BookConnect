package com.beatrice.bookfinder;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //set up BottomNavigation using setUpWithNavController of navigation components
        NavController mNavController = NavHostFragment.findNavController(getChildFragmentManager().findFragmentById(R.id.fragment_container_main));
        BottomNavigationView mBottomNav = rootView.findViewById(R.id.bottomNavigationView);
        NavigationUI.setupWithNavController(mBottomNav, mNavController);
        return  rootView;
    }

}
