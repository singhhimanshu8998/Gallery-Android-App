package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment13 extends Fragment {

    TextView textView;
    String string;

    public Fragment13()
    {

    }

    public Fragment13(String string) {
        this.string = string;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_13, container, false);
        textView = view.findViewById(R.id.textShow);
        textView.setText(string);
        return view;
    }
}
