package com.example.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongDetails> {

    public SongAdapter(Activity context, ArrayList<SongDetails> songs) {
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_songs, parent, false);
        }
        SongDetails currentSong = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getSongName());
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        nameTextView.setText(currentSong.getArtistName());
        return listItemView;
    }
}
