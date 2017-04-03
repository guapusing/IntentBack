package com.example.king.intentback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by king on 3/14/2017.
 */
public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1 = (Button) findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(i);

            }

        });

    }
}