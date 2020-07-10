package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <Pokemon> myPokemons = new ArrayList<>();

        Pokemon P1 = new Pokemon("Bulbasaur",R. drawable.bulbasaur,49,49,318);
        Pokemon P2 = new Pokemon("Ivysaur",R.drawable.ivysaur,50,50,400);
        Pokemon P3 = new Pokemon("Charmander",R.drawable.charmander,52,43,309);
        Pokemon P4 = new Pokemon("Charizard",R.drawable.charizard,130,111,634);
        Pokemon P5 = new Pokemon("Butterfree",R.drawable.butterfree,45,50,395);

        myPokemons.add(P1);
        myPokemons.add(P2);
        myPokemons.add(P3);
        myPokemons.add(P4);
        myPokemons.add(P5);

        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        PokemonAdapter adapter = new PokemonAdapter(myPokemons,this);
        rv.setAdapter(adapter);





    }
}