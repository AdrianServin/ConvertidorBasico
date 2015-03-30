package com.example.root.convertirdor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText cantidad;
    private TextView resultado;
    private RadioButton r1,r2;
    private RadioGroup radioGroup;
    int a;
    double resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cantidad = (EditText) findViewById(R.id.editText);
        resultado = (TextView) findViewById(R.id.textView);
        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);



        r1.setOnClickListener(new RadioGroup.OnClickListener() {
            public void onClick(View v) {
                a = Integer.parseInt(String.valueOf(cantidad.getText()));

                resul = (a - 32) / 1.8;

                resultado.setText("Conversion:" + resul+"°C");


            }
        });

        r2.setOnClickListener(new RadioGroup.OnClickListener() {
            public void onClick(View v) {
                a = Integer.parseInt(String.valueOf(cantidad.getText()));
                resul = (a * 1.8) + 32;

                resultado.setText("Conversion:" + resul+"°F");
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

