package com.beatrice.bookfinder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_main, container, false)

        val msgTextview = rootView.findViewById<TextView>(R.id.msg_txtview)

        //passing text using bundles
        //val name = arguments?.getString("name")

        //passing data using safe args
        //use fromBundles() method to retrieve the arguments
        val name = MainFragmentArgs.fromBundle(arguments!!).name
        msgTextview.text ="welcome " +name


        //navHostFragment
        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment_container_main) as NavHostFragment
        //set up bottomNavigationView
        rootView.findViewById<BottomNavigationView>(R.id.bottomNavigationView).setupWithNavController(
                navController = navHostFragment.navController
        )

        //set up toolbar
//        rootView.findViewById<Toolbar>(R.id.toolbar).setupWithNavController(
//                navController = navHostFragment.navController
//        )

//        //setting up toolbar using custom navigatedListener
        val toolbar = rootView.findViewById<Toolbar>(R.id.toolbar)
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            toolbar.title = destination.label
        }


        return  rootView
    }


}
