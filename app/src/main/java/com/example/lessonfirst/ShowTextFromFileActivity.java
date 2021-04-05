package com.example.lessonfirst;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                ((TextView) findViewById(R.id.textViewShowText)).setText(getIntent().getStringExtra("text"));
                FileManager  fileManager = new FileManager ();
                textViewShow.setText(fileManager.getDataFromFIle());
            }
        });
    }
}