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
public class Fragment5 extends Fragment {
    Uri path;

    public Fragment5(Uri path) {
        // Required empty public constructor
        this.path = path;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);
        ImageView imageView = viewGroup.findViewById(R.id.image1);
        imageView.setImageURI(path);
        return viewGroup;
    }}
