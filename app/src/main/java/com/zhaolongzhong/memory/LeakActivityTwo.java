package com.zhaolongzhong.memory;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class LeakActivityTwo extends AppCompatActivity {
    public static final String TAG = LeakActivityTwo.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_activity_two);

        setTitle(R.string.leak_example_2);

        runAsyncTask();
    }

    void runAsyncTask() {
        // This is an anonymous class and has a hidden reference to outer activity.
        // This activity will leak if it gets destroyed before the task finishes.
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                SystemClock.sleep(20000);
                return null;
            }
        };
    }
}
