package com.example.mascodys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class    MainActivity extends AppCompatActivity implements  View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button1 = findViewById(R.id.imageButton2);
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"administrador",Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(),menu_Activity.class);
                startActivity(intencion);
            }
        });
        ImageButton button2 = findViewById(R.id.imageButton);
        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"administrador",Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(),menu_Activity.class);
                startActivity(intencion);
            }


        });

        ImageButton button3 = findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"administrador",Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(),menu_Activity.class);
                startActivity(intencion);
            }


        });


            }


    @Override
    public void onClick(View v) {

    }
};







