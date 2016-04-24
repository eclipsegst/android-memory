package com.zhaolongzhong.memory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.leak_example_id_1:
                intent = new Intent(this, LeakActivityOne.class);
                startActivity(intent);
                return true;
            case R.id.leak_example_id_2:
                intent = new Intent(this, LeakActivityTwo.class);
                startActivity(intent);
                return true;
            case R.id.leak_example_id_3:
                intent = new Intent(this, LeakActivityThree.class);
                startActivity(intent);
                return true;
            case R.id.leak_example_id_4:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
