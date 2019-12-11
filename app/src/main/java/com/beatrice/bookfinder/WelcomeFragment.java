package com.beatrice.bookfinder;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);

//        Bundle b = getArguments();
//        String name = b.getString("name");

        //replace with safe arguments
        String name = WelcomeFragmentArgs.fromBundle(getArguments()).getName();

        TextView nameTxtview = rootView.findViewById(R.id.name_txtview);
        nameTxtview.setText(name);
        rootView.findViewById(R.id.next_txtview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_mainFragment)
        );
        return  rootView;
    }

}
