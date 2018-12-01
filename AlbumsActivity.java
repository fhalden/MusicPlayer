package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_albums.xml layout file
        setContentView(R.layout.activity_albums);

        // Moving Pictures Text View
        final TextView movingPictures = findViewById(R.id.moving_pictures);
        final MusicLibrary albumSongList = new MusicLibrary();
        // Set a click listener on that View
        movingPictures.setOnClickListener(new OnClickListener() {
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

        // 52nd Street Text View
        TextView fiftySecondStreet = findViewById(R.id.fifty_second_street);

        // Set a click listener on that View
        fiftySecondStreet.setOnClickListener(new OnClickListener() {
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

        // Garbage Text View
        TextView garbage = findViewById(R.id.garbage_id);

        // Set a click listener on that View
        garbage.setOnClickListener(new OnClickListener() {
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

        // Off The Wall Text View
        TextView offTheWall = findViewById(R.id.off_the_wall);

        // Set a click listener on that View
        offTheWall.setOnClickListener(new OnClickListener() {
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