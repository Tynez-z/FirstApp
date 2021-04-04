package com.example.lessonfirst;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowTextFromFileActivity extends AppCompatActivity {
    TextView textViewShow;
    Button buttonShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text_from_file);
        textViewShow = findViewById(R.id.textViewShowText);
        buttonShowText = findViewById(R.id.buttonShowText);
        buttonShowText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textViewShowText)).setText(getIntent().
                        getStringExtra("text"));
                try {
                    FileInputStream fileInPut = openFileInput("‪D:\\Android Studio\\file.txt");
                    InputStreamReader reader = new InputStreamReader(fileInPut);
                    BufferedReader buff = new BufferedReader(reader);
                    StringBuffer strBuff = new StringBuffer();
                    String lines;
                    while ((lines = buff.readLine()) != null) {
                        strBuff.append(lines);
                    }
                    textViewShow.setText(strBuff.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}