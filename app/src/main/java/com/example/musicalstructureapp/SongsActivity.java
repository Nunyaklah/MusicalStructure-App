package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class SongsActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.songs:
                startActivity(new Intent(this, SongsActivity.class));
                return true;
            case R.id.albums:
                startActivity(new Intent(this, Albums.class));
                return true;
            case R.id.playlists:
                startActivity(new Intent(this, Playlists.class));
                return true;
            case R.id.played:
                startActivity(new Intent(this, RecentlyPlayed.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
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
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.listSongs);
        listView.setAdapter(adapter);
    }
}
