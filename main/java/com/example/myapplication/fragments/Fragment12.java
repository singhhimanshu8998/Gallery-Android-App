package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Fragment12 extends Fragment {

    SendMessage sendMessage;

    public Fragment12() {
        // Required empty public constructor
    }

    public interface SendMessage
    {
        public void sendData(String massage);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_12, container, false);
        final EditText text = view.findViewById(R.id.editSaveText);
        Button button = view.findViewById(R.id.btnSend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = text.getText().toString().trim();
                if(str.equals("")){
                    text.setError("Please enter text");
                }
                else{
                    sendMessage=(SendMessage)getActivity();
                    sendMessage.sendData(str);
                }

            }
        });
        return view;
    }
}
