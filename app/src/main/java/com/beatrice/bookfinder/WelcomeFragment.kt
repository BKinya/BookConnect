package com.beatrice.bookfinder


import android.os.Bundle

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_welcome, container, false)
        rootView.findViewById<View>(R.id.next_txtview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_loginFragment)
        )
        return rootView
    }

}
