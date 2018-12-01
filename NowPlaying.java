package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        //Set up the views that hold the song values
        TextView songTitle = findViewById(R.id.title);
        TextView songArtist = findViewById(R.id.artist);
        ImageView songCover = findViewById(R.id.cover_art_icon);
        ImageView largeCover = findViewById(R.id.large_cover);

        //catch the now playing Song from the Intent thrower.
        Intent i = getIntent();
        Song nowPlayingSong = (Song)i.getSerializableExtra("now_playing");
        //Build the display
        songTitle.setText(nowPlayingSong.getTitle());
        songArtist.setText(nowPlayingSong.getArtist());
        songCover.setImageResource(nowPlayingSong.getImageResourceId());
        largeCover.setImageResource(nowPlayingSong.getImageResourceId());



            }
}

