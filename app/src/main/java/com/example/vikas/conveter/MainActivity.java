package com.example.vikas.conveter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void function(View v) {
        TextView t1 = (TextView) findViewById(R.id.t1);
        EditText e1 = (EditText) findViewById(R.id.e1);
        Float f=Float.valueOf(e1.getText().toString());
        if(f==null){
            t1.setText(" ");
        }
        Spinner s1 = (Spinner) findViewById(R.id.s1);
        Spinner s2 = (Spinner) findViewById(R.id.s2);
        String c1 = String.valueOf(s1.getSelectedItem());
        String c2 = String.valueOf(s2.getSelectedItem());
        //t1.setText(c1.toString());
        if ((c1.toString()).equals("Kilos") && (c2.toString()).equals("Pounds") ) {

        Double res=Double.valueOf(f/0.45359237);
            t1.setText(res.toString());
        }else if ((c1.toString()).equals("Pounds") && (c2.toString()).equals("Kilos")){
            Double res=Double.valueOf(f*0.45359237);
            t1.setText(res.toString());
        }else if ((c1.toString()).equals("Meters") && (c2.toString()).equals("Yards") ){
            Double res=Double.valueOf(f*1.0936133);
            t1.setText(res.toString());
        }else if ((c1.toString()).equals("Yards") && (c2.toString()).equals("Meters") ){
            Double res=Double.valueOf(f*0.9144);
            t1.setText(res.toString());
        }else if ((c1.toString()).equals("Celsius") && (c2.toString()).equals("Fatrenheit") ){
            Double res=Double.valueOf(f*1.8+32);
            t1.setText(res.toString()+"F");
        }else if ((c1.toString()).equals("Fatrenheit") && (c2.toString()).equals("Celsius") ){
            Double res=Double.valueOf(f-32*0.56);
            t1.setText(res.toString()+"C");
        }else{
            t1.setText("Cannot convert");
        }

    }
}