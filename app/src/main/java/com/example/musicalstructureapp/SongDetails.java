package com.example.musicalstructureapp;


public class SongDetails {
    private String mSongName;
    private String mArtistName;

    public SongDetails( String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }


    public String getSongName() {
        return mSongName;
    }


    public String getArtistName() {
        return mArtistName;
    }

}
