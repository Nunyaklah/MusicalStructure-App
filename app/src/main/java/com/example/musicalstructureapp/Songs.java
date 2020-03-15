package com.example.musicalstructureapp;

import android.os.Bundle;
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
        songs.add(new SongDetails("Castle on the hill", "Ed Sheran"));
        songs.add(new SongDetails("Photograph", "Ed Sheran"));
        songs.add(new SongDetails("Mockingbird", "Eminem"));
        songs.add(new SongDetails("Lose Yourself", "Eminem"));
        songs.add(new SongDetails("So will I", "Hillsong"));
        songs.add(new SongDetails("Better", "Eminem"));
        songs.add(new SongDetails("Venom", "Khalid"));
        songs.add(new SongDetails("Vertigo", "Khalid"));



        //setting up while loop to display songs
       SongAdapter adapter = new SongAdapter  (this, songs);

        ListView listView = (ListView) findViewById(R.id.listSongs);

        listView.setAdapter(adapter);



    }
}
