package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textViewCompare;
    TextView textViewMSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCompare = findViewById(R.id.textViewUser);
        textViewMSum = findViewById(R.id.textViewSum);

                //for (int a = 15; a < 20; a++) {
        //System.out.println("a is = " + a);
        //}

        //int [] numbers = {10, 20, 22, 30};
        //for (int number : numbers) {
        //System.out.println("Number: " + number);
        //}

        //int count = 1;
        //while (count <= 15) {
        //System.out.println("Count is: " + count++);
        //}

        // int count = 2;
        // do {
        //System.out.println("Count is: " + count++);
        //} while (count < 10);

        //for (int i = 4; i < 10; i ++) {
        // if (i == 5) break;
        //System.out.println("i: = " + i);
        //}
        //System.out.println("The loop is complete");

        //for (int i = 0; i < 10; i++) {
        // System.out.println("i: " + i);
        // if (i == 3)
        //continue;
        //System.out.println("i: ");
        //}

        int a = getNumber (5);
        System.out.println("A is: " + a);

    }
    public int getNumber(int i) {
        return i *2;
    }

    public void colour (String colour) {
        String nameOfColour = "Add your colour" + colour;
        System.out.println(nameOfColour);
    }
}



