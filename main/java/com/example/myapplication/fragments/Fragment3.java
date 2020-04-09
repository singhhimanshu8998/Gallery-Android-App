package com.example.myapplication.fragments;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {

    Uri path;
    public Fragment3(Uri path) {
        // Required empty public constructor
        this.path = path;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        ImageView imageView = view.findViewById(R.id.image3);
        imageView.setImageURI(path);
        return view;
    }
}
