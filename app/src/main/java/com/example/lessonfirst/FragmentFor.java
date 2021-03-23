package com.example.lessonfirst;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentFor extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for, container, false);
        TextView textViewF = v.findViewById(R.id.textViewFor);
        for (int a = 15; a < 20; a++) {
            textViewF.setText("a is = " + a);
        }
        return v;
    }
}