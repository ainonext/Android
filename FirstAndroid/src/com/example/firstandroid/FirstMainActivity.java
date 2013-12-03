package com.example.firstandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FirstMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first_main, menu);
        return true;
    }
    
}
