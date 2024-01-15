package com.example.practical91;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.edittext1);
        ed2 = (EditText) findViewById(R.id.edittext2);
        txt = (TextView)findViewById(R.id.txt);
    }
    public void  add()
    {
        Button btn = (Button) findViewById(R.id.btn2);


        txt.setText((Integer.parseInt(ed1.getText().toString())+Integer.parseInt(ed2.getText().toString())));
    }
    public void  sub()
    {
        Button btn = (Button) findViewById(R.id.btn2);


        txt.setText((Integer.parseInt(ed1.getText().toString()) - Integer.parseInt(ed2.getText().toString())));
    }
    public void  mul()
    {
        Button btn = (Button) findViewById(R.id.btn2);


        txt.setText((Integer.parseInt(ed1.getText().toString()) * Integer.parseInt(ed2.getText().toString())));
    }
    public void  divide()
    {
        Button btn = (Button) findViewById(R.id.btn2);


        txt.setText((Integer.parseInt(ed1.getText().toString()) / Integer.parseInt(ed2.getText().toString())));
    }
    public void acFunc()
    {
        ed1.setText(" ");
        ed2.setText(" ");
    }
}