package com.example.lessonfirst;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public class RunnableTask implements Runnable {

    @Override
    public  void run() {
        long delay = 5;
        for (int i = 0; i <= 10; i++) {
            Log.d("RunnableLoop", String.valueOf(i));
            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {}
        }
    }
}
