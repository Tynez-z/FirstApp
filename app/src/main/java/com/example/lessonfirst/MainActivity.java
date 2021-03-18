package com.example.lessonfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 10;
    int b = 20;
    int c = 0;
    TextView textViewCompare;
    TextView textViewMSum;
    TextView textViewMin;
    TextView textViewIncrease;
    TextView textViewsplit;
    TextView textViewPercent;
    TextView textViewPercent2;
    TextView textViewBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCompare = findViewById(R.id.textViewUser);
        textViewMSum = findViewById(R.id.textViewSum);
        textViewMin = findViewById(R.id.textViewMin);
        textViewIncrease = findViewById(R.id.textViewIncrease);
        textViewsplit = findViewById(R.id.textViewSplit);
        textViewPercent = findViewById(R.id.textViewPercent);
        textViewPercent2 = findViewById(R.id.textViewPercent2);
        textViewBoolean = findViewById(R.id.textViewBoolean);


        textViewCompare.setText("Результат выражения: a == b; false " +
                "\nРезультат выражения: a != b; true" +
                "\nРезультат выражения: a > b; false" +
                "\nРезультат выражения: a < b; true" +
                "\nРезультат выражения: b >= a; true" +
                "\nРезультат выражения: b <= a; false" +
                "\nРезультат выражения: c = a + b; 30" +
                "\nРезультат выражения: c += a; 10" +
                "\nРезультат выражения: c -= a; -10" +
                "\nРезультат выражения: c *= a; 0" +
                "\nРезультат выражения: где c = 15; c /= a; 1    ");

        int a = 5;
        int b = 10;
        int c = 25;

        int f = a + b;
        int f1 = a - b;
        int f2 = a * b;
        int f3 = b / a;
        int f4 = b % a;
        int f5 = c % a;

        textViewMSum.append(String.valueOf(a + "+" + b + "=" + f));
        textViewMin.append(String.valueOf(a + "-" + b + "=" + f1));
        textViewIncrease.append(String.valueOf(a + "*" + b + "=" + f2));
        textViewsplit.append(String.valueOf(b + "/" + a + "=" + f3));
        textViewPercent.append(String.valueOf(b + "%" + a + "=" + f4));
        textViewPercent2.append(String.valueOf(c + "%" + a + "=" + f5));



        textViewBoolean.setText("Результат выражения: a = true + true; true " +
                "\nРезультат выражения: b = false + false; false" +
                "\nРезультат выражения: a | b + a | b; true" +
                "\nРезультат выражения: a & b + a & b; false ");

        int month = 3;
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Зимука зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Не знаю";
        }
        System.out.println("March is in the " +    season +     ".");

    }
}