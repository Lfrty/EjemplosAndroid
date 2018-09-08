package com.example.matt.ejemplosandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Toogle extends AppCompatActivity {

    ToggleButton btnToggle;
    TextView lblMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle);
        btnToggle = (ToggleButton)findViewById(R.id.btnToggle);
        lblMensaje = (TextView)findViewById(R.id.lblMensaje);

        btnToggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(btnToggle.isChecked())
                    lblMensaje.setText("Botón Toggle: ON");
                else
                    lblMensaje.setText("Botón Toggle: OFF");
            }
        });
    }
}
