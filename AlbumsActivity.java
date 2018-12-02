package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_albums.xml layout file
        setContentView(R.layout.activity_albums);

        // Moving Pictures Button
        final Button movingPicturesButton = findViewById(R.id.moving_pictures_button);
        movingPicturesButton.setText("Queue");
        final MusicLibrary albumSongList = new MusicLibrary();
        // Set a click listener on that View
        movingPicturesButton.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent albumSongListIntent = new Intent(AlbumsActivity.this, AlbumSongsActivity.class);
                albumSongListIntent.putExtra("song_list", albumSongList.getAlbumList(albumSongList.songs.get(0)));
                // Start the new activity
                startActivity(albumSongListIntent);
            }
        });

        // 52nd Street Button
        Button fiftySecondStreetButton = findViewById(R.id.fifty_second_street_button);
        fiftySecondStreetButton.setText("Queue");
        // Set a click listener on that View
        fiftySecondStreetButton.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent albumSongListIntent = new Intent(AlbumsActivity.this, AlbumSongsActivity.class);
                albumSongListIntent.putExtra("song_list", albumSongList.getAlbumList(albumSongList.songs.get(7)));
                // Start the new activity
                startActivity(albumSongListIntent);
            }
        });

        // Garbage Button
        Button garbageButton = findViewById(R.id.garbage_button);
        garbageButton.setText("Queue");
        // Set a click listener on that View
        garbageButton.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumSongsActivity}
                Intent albumSongListIntent = new Intent(AlbumsActivity.this, AlbumSongsActivity.class);
                albumSongListIntent.putExtra("song_list", albumSongList.getAlbumList(albumSongList.songs.get(16)));
                // Start the new activity
                startActivity(albumSongListIntent);
            }
        });

        // Off The Wall Button
        Button offTheWallButton = findViewById(R.id.off_the_wall_button);
        offTheWallButton.setText("Queue");
        // Set a click listener on that View
        offTheWallButton.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link albumSongList Activity}
                Intent albumSongListIntent = new Intent(AlbumsActivity.this, AlbumSongsActivity.class);
                albumSongListIntent.putExtra("song_list", albumSongList.getAlbumList(albumSongList.songs.get(28)));
                // Start the new activity
                startActivity(albumSongListIntent);
            }
        });

    }
}