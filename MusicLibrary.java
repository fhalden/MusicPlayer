package com.example.android.musicplayer;

import java.io.Serializable;
import java.util.ArrayList;
public class MusicLibrary implements Serializable {




    // Create a list of songs.
    ArrayList<Song> songs = new ArrayList<Song>();

    //Construct the object
    public MusicLibrary() {
        //initialize the ArrayList
        songs.add(new Song("Tom Sawyer", "Rush", "Moving Pictures", 1, R.drawable.moving_pictures));
        songs.add(new Song("Red Barchetta", "Rush", "Moving Pictures", 2, R.drawable.moving_pictures));
        songs.add(new Song("YYZ", "Rush", "Moving Pictures", 3, R.drawable.moving_pictures));
        songs.add(new Song("Limelight", "Rush", "Moving Pictures", 4, R.drawable.moving_pictures));
        songs.add(new Song("The Camera Eye", "Rush", "Moving Pictures", 5, R.drawable.moving_pictures));
        songs.add(new Song("Witch Hunt (Part III of 'Fear'", "Rush", "Moving Pictures", 6, R.drawable.moving_pictures));
        songs.add(new Song("Vital Signs", "Rush", "Moving Pictures", 7, R.drawable.moving_pictures));
        songs.add(new Song("Big Shot", "Billy Joel", "52nd Street", 1, R.drawable.fifty_second_street));
        songs.add(new Song("Honesty", "Billy Joel", "52nd Street", 2, R.drawable.fifty_second_street));
        songs.add(new Song("My Life", "Billy Joel", "52nd Street", 3, R.drawable.fifty_second_street));
        songs.add(new Song("Zanzibar", "Billy Joel", "52nd Street", 4, R.drawable.fifty_second_street));
        songs.add(new Song("Stiletto", "Billy Joel", "52nd Street", 5, R.drawable.fifty_second_street));
        songs.add(new Song("Rosalinda's Eyes", "Billy Joel", "52nd Street", 6, R.drawable.fifty_second_street));
        songs.add(new Song("Half A Mile Away", "Billy Joel", "52nd Street", 7, R.drawable.fifty_second_street));
        songs.add(new Song("Until The Night", "Billy Joel", "52nd Street", 8, R.drawable.fifty_second_street));
        songs.add(new Song("52nd Street", "Billy Joel", "52nd Street", 9, R.drawable.fifty_second_street));
        songs.add(new Song("Supervixen", "Garbage", "Garbage", 1, R.drawable.garbage));
        songs.add(new Song("Queer", "Garbage", "Garbage", 2, R.drawable.garbage));
        songs.add(new Song("Only Happy When It Rains", "Garbage", "Garbage", 3, R.drawable.garbage));
        songs.add(new Song("As Heaven Is Wide", "Garbage", "Garbage", 4, R.drawable.garbage));
        songs.add(new Song("Not My Idea", "Garbage", "Garbage", 5, R.drawable.garbage));
        songs.add(new Song("A Stroke Of Luck", "Garbage", "Garbage", 6, R.drawable.garbage));
        songs.add(new Song("Vow", "Garbage", "Garbage", 7, R.drawable.garbage));
        songs.add(new Song("Stupid Girl", "Garbage", "Garbage", 8, R.drawable.garbage));
        songs.add(new Song("Dog New Tricks", "Garbage", "Garbage", 9, R.drawable.garbage));
        songs.add(new Song("My Lover's Box", "Garbage", "Garbage", 10, R.drawable.garbage));
        songs.add(new Song("Fix Me Now", "Garbage", "Garbage", 11, R.drawable.garbage));
        songs.add(new Song("Milk", "Garbage", "Garbage", 12, R.drawable.garbage));
        songs.add(new Song("Don't Stop 'Til You Get Enough", "Michael Jackson", "Off The Wall", 1, R.drawable.off_the_wall));
        songs.add(new Song("Rock With You", "Michael Jackson", "Off The Wall", 2, R.drawable.off_the_wall));
        songs.add(new Song("Working Day And Night", "Michael Jackson", "Off The Wall", 3, R.drawable.off_the_wall));
        songs.add(new Song("Get On The Floor", "Michael Jackson", "Off The Wall", 4, R.drawable.off_the_wall));
        songs.add(new Song("Off The Wall", "Michael Jackson", "Off The Wall", 5, R.drawable.off_the_wall));
        songs.add(new Song("Girlfriend", "Michael Jackson", "Off The Wall", 6, R.drawable.off_the_wall));
        songs.add(new Song("She's Out Of My Life", "Michael Jackson", "Off The Wall", 7, R.drawable.off_the_wall));
        songs.add(new Song("I Can't Help It", "Michael Jackson", "Off The Wall", 8, R.drawable.off_the_wall));
        songs.add(new Song("It's The Falling In Love", "Michael Jackson", "Off The Wall", 9, R.drawable.off_the_wall));
        songs.add(new Song("Burn This Disco Out", "Michael Jackson", "Off The Wall", 10, R.drawable.off_the_wall));
    }

    // Get the songs
    public ArrayList getSongList() { return songs; }


    //Filter the ArrayList to create an ArrayList that holds only the songs from a particular album.
    public ArrayList getAlbumList(Song albumSong) {
        //Create an arraylist to hold the songs on a particular album
        ArrayList<Song> albumTrackListing = new ArrayList<>();

        ArrayList<Song> currentSong = new ArrayList<Song>();

        int index;
        int size = songs.size();
        //Iterate across the arraylist
        for ( index = 0;  index < size; index++) {
        //check to see if the Album Title in the current song equals the search term
            currentSong.add(songs.get(index));
            //If it does, add the song to the ArrayList of album songs
            if (currentSong.get(index).getAlbumTitle().contains(albumSong.getAlbumTitle())) {
                albumTrackListing.add(currentSong.get(index));

            }
        }
        //return the list of album tracks.
        return albumTrackListing;

    }


}


