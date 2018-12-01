package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml layout file.





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        MusicLibrary musicLibrary = new MusicLibrary();

        final ArrayList songs = musicLibrary.getSongList();



        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        final ListView listView = findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                // Create a new intent to open the {@link NowPlaying}
                Song nowPlayingSong = (Song) songs.get(position);
                Intent NowPlayingIntent = new Intent(SongsActivity.this, NowPlaying.class);
                NowPlayingIntent.putExtra("now_playing", nowPlayingSong);
                // Start the new activity
                startActivity(NowPlayingIntent);}
        });


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
