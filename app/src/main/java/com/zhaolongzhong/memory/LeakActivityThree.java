package com.zhaolongzhong.memory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LeakActivityThree extends AppCompatActivity {
    public static final String TAG = LeakActivityThree.class.getSimpleName();

    private static Leak leak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_activity_three);

        setTitle(R.string.leak_example_3);

        // similar to example 1, static variable refer to activity itself
        leak = new Leak();
    }

    public class Leak {}

    @Override
    public void onDestroy() {
        super.onDestroy();
        leak = null;
    }
}
