package com.example.java_aula_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pet lua = new Pet("Lua", "Branco", "Lulu da pomerania", 2, "3 de janeiro", R.drawable.lua);
        Pet lucky = new Pet("Lucky", "Colorido", "Maltês", 3, "13 de maio", R.drawable.lucky);
        Pet maggie = new Pet("Maggie", "Branco preto ", "Sem raça definida", 5, "27 de janeiro", R.drawable.maggie);

        Button btnLua = findViewById(R.id.btnLua);
        btnLua.setOnClickListener(v -> abrirDetalhes(lua));

        Button btnLucky = findViewById(R.id.btnLucky);
        btnLucky.setOnClickListener(v -> abrirDetalhes(lucky));

        Button btnMaggie = findViewById(R.id.btnMaggie);
        btnMaggie.setOnClickListener(v -> abrirDetalhes(maggie));
    }

    private void abrirDetalhes(Pet pet) {
        Intent intent = new Intent(this, DetalhesPetActivity.class);
        intent.putExtra("pet", pet);
        startActivity(intent);
    }
}
