package com.example.lessonfirst;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExampleThreadActivity extends AppCompatActivity {
    Button threadClick;
    Button toast;
    Thread thread1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_thread);
        initThreadClick();
        initToastClick();
    }

    private void initThreadClick() {
        threadClick = findViewById(R.id.buttThread);
        threadClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                thread1 = new Thread((java.lang.Runnable) new RunnableTask());
                Log.d("RunnableLoop", String.valueOf(thread1.getState()));
                thread1.start();
                Log.d("RunnableLoop", String.valueOf(thread1.getState()));
            }
        });
    }

    public void initToastClick() {
        toast = findViewById(R.id.buttonToast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Message", Toast.LENGTH_SHORT).show();
            }
        });
    }
}