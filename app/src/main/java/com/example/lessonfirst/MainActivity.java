package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    boolean a = true;
    byte b = 127;
    short c = 32767;
    int d = 214783647;
    long e = 999999999;
    long large_number;
    float f = 3.14f;
    double double_example;
    char g = '?';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("example_boolean", String.valueOf(a));
        Log.i("example_byte", String.valueOf(b));
        Log.i("example_short", String.valueOf(c));
        Log.i("example_int", String.valueOf(d));
        large_number = e * 60 * 60 * 60;
        double_example = c / b;
        Log.i("example_long", String.valueOf(large_number));
        Log.i("example_float", String.valueOf(f));
        Log.i("example_double", String.valueOf(double_example));
        Log.i("example_char", String.valueOf(g));

    }
}