package com.beatrice.bookfinder


import android.os.Bundle

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_login, container, false)
        val usernameEditTxtview = rootView.findViewById<EditText>(R.id.username_edittxt)
        val loginBtn = rootView.findViewById<Button>(R.id.login_btn)

        //add a callback
        //without using na
        loginBtn.setOnClickListener {
            val username = usernameEditTxtview.text.toString()

            //using bundles to pass arguments
            //                Bundle bundle = new Bundle();
            //                bundle.putString("name", username);
            if (!TextUtils.isEmpty(username)) {
                //Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_welcomeFragment, bundle);

                //use safe plugin to pass arguments between destination
                //first create an action
                val loginAction = LoginFragmentDirections.actionLoginFragmentToMainFragment(username)
                Navigation.findNavController(activity!!, R.id.fragment_container).navigate(loginAction)
            }
        }

        return rootView
    }

}// Required empty public constructor
