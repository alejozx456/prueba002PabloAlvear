package com.doodlzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        usuario=findViewById(R.id.nombreUsuario);
        clave=findViewById(R.id.claveUsuario);
    }
    public void siguiente(View view){

        String usuariop=usuario.getText().toString().toUpperCase();
        if(usuario.getText().toString().equals("PABLO") ||
                usuario.getText().toString().equals("ALEJANDRO") ||
                usuario.getText().toString().equals("pablo") ||
                usuario.getText().toString().equals("alejandro") &&
                        clave.getText().toString().equals("PABLO") ||
                clave.getText().toString().equals("ALEJANDRO") ||
                clave.getText().toString().equals("pablo") ||
                clave.getText().toString().equals("alejandro"))    {

            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(this,"Incorrecto",Toast.LENGTH_LONG).show();
        }
    }
}