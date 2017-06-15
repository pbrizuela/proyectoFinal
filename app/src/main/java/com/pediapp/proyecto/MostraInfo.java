package com.pediapp.proyecto;

import android.bluetooth.BluetoothHealthAppConfiguration;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by hp 340 g1 on 14/6/2017.
 */

public class MostraInfo extends AppCompatActivity  {
    protected TextView nombrePadre;
    protected TextView nombreHijo;
    protected TextView fechaNacHijo;
    protected TextView sexoHijo;
    public String nombreEmail;

    protected void onCreate(Bundle savedInstanceState) {

        nombrePadre = (EditText) findViewById(R.id.nombreP);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);
        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        String datoNombre=(String)extras.get("nombre");
        nombrePadre.setText(datoNombre);


    }
    /*public void onClick(View v,String nombre) {

        nombreEmail=(getIntent().getExtras().getString(nombre));
        nombrePadre.setText(nombreEmail);


*/


    }

