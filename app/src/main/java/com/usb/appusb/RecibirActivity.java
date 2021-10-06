package com.usb.appusb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class RecibirActivity extends AppCompatActivity {
    private TextView nomtextrec;
    private TextView edadtextrec;
    private TextView sexotextrec;
    private TextView librotext;
    private TextView playertext;
    private TextView disenotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);
        nomtextrec=findViewById(R.id.nomtextrec);
        edadtextrec=findViewById(R.id.edadtextrec);
        sexotextrec=findViewById(R.id.sexotextrec);
        librotext=findViewById(R.id.librotext);
        playertext=findViewById(R.id.playertext);
        disenotext=findViewById(R.id.disenotext);
        recibir();

    }

    public void recibir(){

        Bundle bundle=getIntent().getBundleExtra("bundle");
        String nombre,sexo,gusto1,gusto2,gusto3,edad;
        nombre=bundle.getString("nombre");
        edad=bundle.getString("edad");
        sexo=bundle.getString("sexo");
        gusto1=bundle.getString("gusto1");
        gusto2=bundle.getString("gusto2");
        gusto3=bundle.getString("gusto3");
        nomtextrec.setText(nombre);
        edadtextrec.setText(edad);
        sexotextrec.setText(sexo);
        librotext.setText(gusto1);
        playertext.setText(gusto2);
        disenotext.setText(gusto3);

    }




}