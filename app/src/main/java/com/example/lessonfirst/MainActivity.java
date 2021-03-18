package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 18;
    int b = 45;
    boolean c = true;
    boolean d = false;
    boolean s = c | d;
    boolean e = c & d;
    boolean f = (!c & d) | (c & !d);
    boolean x = !c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        System.out.println(" c | d = " + s);
        System.out.println(" c & d = " + e);
        System.out.println(" (!c & d) | (c & !d) = " + f);
        System.out.println("!c = " + x);

        if (a < b) {
            System.out.println("True");
        }

        if (a > b) {
            System.out.println( "True");
        } else {
            System.out.println("False");
        }

        int numbers = 23;
        String description;
        switch (numbers) {
            case 1:
            case 2:
            case 12:
                description = "Incorrect";
                break;
            case 3:
            case 23:
            case 5:
                description = "Correct";
                break;
            default:
                description = "None";
        }
        System.out.println("Number  " +    description +     ".");

    }
}