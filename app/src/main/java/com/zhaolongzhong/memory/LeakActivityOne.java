package com.zhaolongzhong.memory;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LeakActivityOne extends AppCompatActivity {
    public static final String TAG = LeakActivityOne.class.getSimpleName();

    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_activity_one);

        setTitle(R.string.leak_example_1);

        // static variable refer to activity itself, if this variable is not set to null in
        // onDestroy, the activity instance will leak
        context = this;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // set to context to null to avoid memory leak, comment it out to check leak event
        context = null;
    }
}
