package com.beatrice.bookfinder;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        EditText usernameEditTxtview = rootView.findViewById(R.id.username_edittxt);
        EditText passwordEditTxtview = rootView.findViewById(R.id.password_editxt);
        Button loginBtn = rootView.findViewById(R.id.login_btn);

        return rootView;
    }

}
