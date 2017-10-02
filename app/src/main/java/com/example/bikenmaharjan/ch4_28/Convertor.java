package com.example.bikenmaharjan.ch4_28;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Convertor extends AppCompatActivity {

    Model convertor;
    TextView tv,tvTwo;
    double inputValue;
    EditText ed;
    Button btnCtr;
    String getType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);

        gettingReference();
        defaultValue();
        buttonCompute();
    }

    public double getValue(){

        Intent intent = getIntent();
        int type = intent.getIntExtra("type",100);
        String font = intent.getStringExtra("Font");

        Log.i("CHECK", type+" ");

        int value = Integer.parseInt(ed.getText().toString());

        Log.i("CHECK1", value+" ");

        if (type == 0) {
            convertor = new Model();
            getType = convertor.getType(type);

            return convertor.conMilesToMeters(value);
        }
        else{
            convertor = new Model();
            getType = convertor.getType(type);
            return convertor.conMetersToMiles(value);
        }
    }

    private void buttonCompute(){

        btnCtr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                double value = getValue();
                tv.setText(""+value);
                int valueEd = Integer.parseInt(ed.getText().toString());
                tvTwo.setText(""+valueEd);

            }
        });

    }

    private void defaultValue(){

        ed.setText("0");
        double value = getValue();
        tv.setText(""+value);
        tvTwo.setText(""+inputValue);

    }

    private void gettingReference(){

        tv  = (TextView) findViewById(R.id.tvOne);
        tvTwo  = (TextView) findViewById(R.id.tvTwo);
        ed = (EditText) findViewById(R.id.ed2);
        btnCtr = (Button) findViewById(R.id.btnCtr);

    }




}
