package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class LoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
    }

    public void onClickBottonFor(View view) {
        FragmentFor fragmentFor = new FragmentFor();
        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.frameLayout, fragmentFor);
        fragment.commit();
    }

    public void onClickBottonWhile(View view) {
        FragmentWhile fragmentWhile = new FragmentWhile();
        FragmentTransaction fragment2 = getSupportFragmentManager().beginTransaction();
        fragment2.replace(R.id.frameLayout, fragmentWhile);
        fragment2.commit();

    }

    public void onClickBack(View view) {
        finish();
    }
}