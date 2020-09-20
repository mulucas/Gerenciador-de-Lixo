package br.imd.fic.gerenciadordelixo.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.imd.fic.gerenciadordelixo.R;
import br.imd.fic.gerenciadordelixo.adapter.MaterialAdapter;
import br.imd.fic.gerenciadordelixo.dominio.Material;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Material> listaMaterial = new ArrayList<>();

        listaMaterial.add(new Material(1L, "Pet", "4"));
        listaMaterial.add(new Material(2L, "Plastico", "2"));

        MaterialAdapter materialAdapter = new MaterialAdapter(listaMaterial,this);

        recyclerView.setAdapter(materialAdapter);
    }
}