package com.pediapp.proyecto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hp 340 g1 on 14/6/2017.
 */

public class altaDatos extends AppCompatActivity implements View.OnClickListener {
    private EditText et1, et2, et3, et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hijos);
        findViewById (R.id.alta).setOnClickListener(this);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        //et1.setText(txtNombre.getText().toString());


    }
        public void onClick(View v) {

            AdminSqLiteOpenHelper admin = new AdminSqLiteOpenHelper(this, "adm", null, 1);
            SQLiteDatabase bd = admin.getWritableDatabase();

            String cod = et1.getText().toString();
            String nn = et2.getText().toString();
            String va = et3.getText().toString();
            String vf = et4.getText().toString();
            ContentValues reg = new ContentValues();
            reg.put("codigo", cod);
            reg.put("nombrehijo", nn);
            reg.put("vacunasapli", va);
            reg.put("vacunasfal", vf);
            bd.insert("padreshijos", null, reg);
            bd.close();
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            Toast.makeText(this, "Se cargaron los datos del artículo",
                    Toast.LENGTH_SHORT).show();

        }

    }



