package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        //ArrayList of songs and artists

        ArrayList<SongDetails> songs = new ArrayList<SongDetails>();

        songs.add(new SongDetails("East Side", "Halsey"));
        songs.add(new SongDetails("Venom", "Eminem"));
//        songs.add("East Side");
//        songs.add("Venom");
//        songs.add("Castle on the hill");
//        songs.add("Photograph");
//        songs.add("Mockingbird");
//        songs.add("Lose Yourself");
//        songs.add("So will I");
//        songs.add("Better");
//        songs.add("American Teen");
//        songs.add("Vertigo");

        //LinearLayout songsRootView = (LinearLayout)findViewById(R.id.list);


        //setting up while loop to display songs
       SongAdapter adapter = new SongAdapter  (this, R.layout.list_songs, songs);

        ListView listView = (ListView) findViewById(R.id.listSongs);

        listView.setAdapter(adapter);



    }
}
