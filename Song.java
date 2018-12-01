package com.example.android.musicplayer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Song implements Serializable {

    //String value for song title
    String mTitle;

    //String value for song artist
    String mArtist;

    //String value for album title
    String mAlbumTitle;

    //int value for album track number
    int mTrackNumber;

    //int value for image resource id for album cover art
    int mImageResourceId;

    /*
     * Create a new Song object.
     *
     * @param  title is the title of the song.
     * @param artist is the artist of the song.
     * @param albumTitle is the title of the album the song is on.
     * @param trackNumber is the track number of the song on the album.
     * @param imageResourceId holds the cover art image resource id.
     * */

    public Song (String title, String artist, String albumTitle, int trackNumber, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mAlbumTitle = albumTitle;
        mTrackNumber = trackNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the title of the song.
     */

    public  String getTitle() { return mTitle;}

    /**
     * Get the artist of the song.
     */

    public String getArtist() { return mArtist;}

    /**
     * Get the album title for the song.
     */

    public String getAlbumTitle() { return mAlbumTitle;}

    /**
     * Get the name of the Android version
     */

    public int getImageResourceId() { return mImageResourceId;}



}

