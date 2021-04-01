package com.example.lessonfirst;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_text);
        ((TextView) findViewById(R.id.textViewGetText)).setText(getIntent().getStringExtra("text"));
    }
}