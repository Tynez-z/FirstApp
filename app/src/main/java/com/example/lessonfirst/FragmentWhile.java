package com.example.lessonfirst;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentWhile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_while, container, false);
        TextView textViewW = v.findViewById(R.id.TextViewWhile);
        int count = 1;
        while (count <= 15) {
            textViewW.setText("Count is: " + count++);
        }
        return v;
    }
}