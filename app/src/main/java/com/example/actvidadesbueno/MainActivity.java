package com.example.actvidadesbueno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<String> listaDatos= new ArrayList<>();
    RecyclerView recyclerView;

    private EditText mMessageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        Intent intent = getIntent();
        String nota = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE);

            if (nota != null){
            listaDatos.add(nota);
        }


        AdaptadorDatos adaptador = new AdaptadorDatos(listaDatos);
        recyclerView.setAdapter(adaptador);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);

        startActivity(intent);


    }
}