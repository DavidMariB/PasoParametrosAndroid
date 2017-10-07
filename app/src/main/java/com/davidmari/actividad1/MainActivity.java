package com.davidmari.actividad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {

    private EditText et1;
    private RadioButton r1,r2;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        tv4=(TextView)findViewById(R.id.tv4);
    }


    public void cambiarActivity(View v){
        et1.setEnabled(false);
        if(r1.isChecked()==true){
            r2.setEnabled(false);
        }else if(r2.isChecked()==true){
            r1.setEnabled(false);
        }

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("nombre",et1.getText().toString());
        startActivityForResult(i,1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        tv4.setText(data.getExtras().getString("edad"));
    }
    
}
