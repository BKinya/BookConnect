package com.beatrice.bookfinder


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_login, container, false)

        val usernameEditTxtview = rootView.findViewById<EditText>(R.id.username_edittxt)
        val loginBtn = rootView.findViewById<Button>(R.id.login_btn)

        //implement button setOnclickListener callback
        loginBtn.setOnClickListener {
            //check if the user has supplied there name
            //then navigate to the home screen
            val name = usernameEditTxtview.text.toString()
            if (name.isNotEmpty()){
                findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
            }

        }
        return  rootView;
    }


}
