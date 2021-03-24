package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoopActivity extends AppCompatActivity {
    private Button buttonFor;
    private Button buttonWhile;
    private Button buttonEsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
        buttonFor = findViewById(R.id.ButtonFor);
        buttonWhile = findViewById(R.id.ButtonWhile);
        buttonEsc = findViewById(R.id.button11);

        buttonFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFor ForFragment = new FragmentFor();
                FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
                fragment.replace(R.id.frameLayout, ForFragment);
                fragment.commit();
            }
        });

        buttonWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentWhile WhileFragment = new FragmentWhile();
                FragmentTransaction fragment2 = getSupportFragmentManager().beginTransaction();
                fragment2.replace(R.id.frameLayout, WhileFragment);
                fragment2.commit();
            }
        });

        buttonEsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
