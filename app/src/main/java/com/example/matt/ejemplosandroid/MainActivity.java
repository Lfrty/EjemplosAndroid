package com.example.matt.ejemplosandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Intent intent= new Intent();
        switch (view.getId())
        {
            case R.id.btnSalir:
                finish();
                break;
            case R.id.btnGoogle:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
                break;
            case R.id.btnToogle:
                intent = new Intent(this, Toogle.class);
                break;
        }
        startActivity(intent);
    }
}
