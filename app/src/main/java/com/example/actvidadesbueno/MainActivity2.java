package com.example.actvidadesbueno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText;
    public static final String EXTRA_MESSAGE = "com.example.actvidadesbueno.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         editText = (EditText)findViewById(R.id.texto_nota);
        Intent intent = getIntent();
    }

    public void crearNota(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        String nota = editText.getText().toString();
       intent.putExtra(EXTRA_MESSAGE,nota);

       startActivity(intent);

    }
}