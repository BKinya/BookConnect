package com.beatrice.bookfinder;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
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
        NavHostFragment mNavHostFragment = (NavHostFragment) getChildFragmentManager().findFragmentById(R.id.fragment_container_main);
        NavController mNavController = NavHostFragment.findNavController(mNavHostFragment);

        //set up BottomNavigation using setUpWithNavController of navigation components
        BottomNavigationView mBottomNav = rootView.findViewById(R.id.bottomNavigationView);
        NavigationUI.setupWithNavController(mBottomNav, mNavController);

        //set up Toolbar using setUpWithNavController of navigation components
        final Toolbar mToolBar = rootView.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolBar);
        //NavigationUI.setupWithNavController(mToolBar, mNavController);
        mNavHostFragment.getNavController().addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                mToolBar.setTitle(destination.getLabel());
            }
        });

        return  rootView;
    }

}
