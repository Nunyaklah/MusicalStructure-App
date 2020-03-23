package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);
        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });

        TextView recentlyPlayed = (TextView) findViewById(R.id.played);
        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playedIntent = new Intent(MainActivity.this, RecentlyPlayed.class);
                startActivity(playedIntent);
            }
        });
    }
}
