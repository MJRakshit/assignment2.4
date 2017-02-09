package com.example.monojit.check;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.id.button1;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    String a;
    Button button1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
        button1 = (Button) findViewById(R.id.button);
        a = (String) (button1.getText());
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               if (a.equals("Hide")) {
                    img.setVisibility(View.INVISIBLE);
                    button1.setText("Show");

                }
                if (a.equals("Show")) {
                   img.setVisibility(View.VISIBLE);
                    button1.setText("Hide");
                }


            }
        });
    }
}

