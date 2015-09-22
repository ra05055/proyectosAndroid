package com.example.eliseo.latablademultiplicar;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button elBoton;
    TextView tv;
    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elBoton = (Button) findViewById(R.id.elboton);
        tv = (TextView) findViewById(R.id.tv);
        numero = (EditText) findViewById(R.id.numero);

        elBoton.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.elboton) {
            //Toast.makeText(getBaseContext(), "Presione el Boton", Toast.LENGTH_SHORT).show();
            String cadena = "";
            if (numero.getText().toString().equals("")) {
                Toast.makeText(getBaseContext(), "Ingrese un Numero", Toast.LENGTH_SHORT).show();
                numero.requestFocus();
            } else {
                for (int i = 0; i < 11; i++) {
                    int n = Integer.valueOf(numero.getText().toString());

                    cadena += "" + numero.getText().toString() + " X " + i + " = " + (n * i);
                    cadena+="\n";

                }
                tv.setText(cadena);

            }

        }
    }
}
