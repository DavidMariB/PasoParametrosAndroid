package com.davidmari.actividad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv4;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv4 = (TextView)findViewById(R.id.tv4);
        et1 = (EditText)findViewById(R.id.et1);

        Bundle bundle = getIntent().getExtras();
        tv4.setText("Hola "+bundle.getString("nombre")+", indicanos tu edad:");
    }

    public void devolver(View v){
        int numero = Integer.parseInt(et1.getText().toString());
        String lmao = "";
        if(numero<18){
            lmao = "Eres menor de edad";
        }else if(numero>=18 && numero<25){
            lmao = "Ya eres mayor de edad";
        }else if(numero>=25 && numero<35){
            lmao = "Aprovecha lo que te queda";
        }else if(numero>=35){
            lmao = "Vas a morir";
        }

        getIntent().putExtra("edad",lmao);
        setResult(RESULT_OK,getIntent());
        this.finish();
    }
}