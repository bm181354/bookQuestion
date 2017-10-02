package com.example.bikenmaharjan.ch4_28;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button ToMeters;
    private Button ToMiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToMeters = (Button) findViewById(R.id.btnFtoC);
        ToMiles = (Button) findViewById(R.id.btnCtoF);



        ToMeters.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Convertor.class);
                intent.putExtra("type",0);
                intent.putExtra("Font","To METER");
                startActivity(intent);
                finish();
            }
        });

        ToMiles.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Convertor.class);
                intent.putExtra("type",1);
                intent.putExtra("Font","To MILES");
                startActivity(intent);
                finish();
            }
        });


    }

}
