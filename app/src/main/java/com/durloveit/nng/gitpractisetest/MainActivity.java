package com.durloveit.nng.gitpractisetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void GitTestMethod()
    {
        Toast.makeText(getApplicationContext(), "Test", Toast.LENGTH_LONG).show();
    }
}
