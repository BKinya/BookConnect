package com.beatrice.bookfinder


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.google.android.material.bottomnavigation.BottomNavigationView


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        val mNavHostFragment = childFragmentManager.findFragmentById(R.id.fragment_container_main) as NavHostFragment?
        val mNavController = NavHostFragment.findNavController(mNavHostFragment!!)

        //set up BottomNavigation using setUpWithNavController of navigation components
        val mBottomNav = rootView.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(mBottomNav, mNavController)

        //set up Toolbar using setUpWithNavController of navigation components
        val mToolBar = rootView.findViewById<Toolbar>(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(mToolBar)
        //NavigationUI.setupWithNavController(mToolBar, mNavController);
        mNavHostFragment.navController.addOnDestinationChangedListener { _, destination, _ -> mToolBar.title = destination.label }

        // Bundle b = getArguments();
        //        String name = b.getString("name");

        //replace with safe arguments
        val name = MainFragmentArgs.fromBundle(arguments!!).name
        Log.e("NAME", name)

        return rootView
    }

}// Required empty public constructor
