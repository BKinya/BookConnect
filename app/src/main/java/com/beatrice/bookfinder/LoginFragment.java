package com.beatrice.bookfinder;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
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
        final EditText usernameEditTxtview = rootView.findViewById(R.id.username_edittxt);
        final EditText passwordEditTxtview = rootView.findViewById(R.id.password_editxt);
        Button loginBtn = rootView.findViewById(R.id.login_btn);

        //add a callback
        //without using na
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameEditTxtview.getText().toString();
                String password = passwordEditTxtview.getText().toString();

                //using bundles to pass arguments
//                Bundle bundle = new Bundle();
//                bundle.putString("name", username);
//                if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)){
//                    Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_welcomeFragment, bundle);
//                }

                //use safe plugin to pass arguments between destination
                //first create an action
                LoginFragmentDirections.ActionLoginFragmentToWelcomeFragment loginAction =
                        LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username);
                Navigation.findNavController(getActivity(), R.id.fragment_container).navigate(loginAction);
            }
        });

        return rootView;
    }

}
