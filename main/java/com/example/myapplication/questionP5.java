package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.fragments.Fragment12;
import com.example.myapplication.fragments.Fragment13;

public class questionP5 extends AppCompatActivity implements Fragment12.SendMessage {

    FragmentManager fragmentManager;
    Fragment fragment;

    @Override
    public void sendData(String massage) {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().remove(fragment).commit();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLay,new Fragment13(massage));
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_p5);
        fragmentManager = getSupportFragmentManager();
        fragment = new Fragment12();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLay,fragment);
        fragmentTransaction.commit();
    }
}