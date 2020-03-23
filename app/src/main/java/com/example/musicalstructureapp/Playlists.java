package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Playlists extends AppCompatActivity {

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
        setContentView(R.layout.activity_playlists);
    }
}
