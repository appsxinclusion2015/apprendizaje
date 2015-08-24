package com.hogar.joaquinbarcena.vaanda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.hogar.joaquinbarcena.vaanda.parametroSet;

public class Preconfig extends Activity {

    public static final parametroSet ob = new parametroSet();
    private EditText uno;
    private RadioButton ju,li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preconfig);

        uno = (EditText) findViewById(R.id.editText);
        ju = (RadioButton) findViewById(R.id.radioButton);
        li = (RadioButton) findViewById(R.id.radioButton2);
    }

    public void Siguiente(View v){
       ob.Nombre = uno.getText().toString();
        if(ju.isChecked()){ob.Sexo = "Hombre";}
        else if(li.isChecked()){ob.Sexo = "Mujer";}
        else {
            Toast m = Toast.makeText(getBaseContext(),"Por favor seleccione el Sexo de la persona",Toast.LENGTH_LONG);
            m.show();
            return;
        }
        finish();
    }

}

