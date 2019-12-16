package com.beatrice.bookfinder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_main, container, false)

        val nameTextview = rootView.findViewById<TextView>(R.id.name_txtview_main)

        //passing text using bundles
        //val name = arguments?.getString("name")

        //passind data using safe args
        //use fromBundles() method to retrieve the arguments
        val name = MainFragmentArgs.fromBundle(arguments!!).name
        nameTextview.text = name

        return  rootView
    }


}
