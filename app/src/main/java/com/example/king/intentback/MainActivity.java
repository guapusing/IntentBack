package com.example.king.intentback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                startActivity(i);

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main3Activity.class);

                startActivity(i);

            }

        });
    }
}
