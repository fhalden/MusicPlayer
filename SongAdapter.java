package com.example.android.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {


    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = (Song) getItem(position);

        // Find the TextView in the song_list_item.xml layout with the ID title.
        TextView titleTextView = listItemView.findViewById(R.id.title);
        // Get the Miwok translation from the currentSong object and set this text on
        // the Miwok TextView.
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the song_list_item.xml layout with the ID default_text_view.
        TextView artistTextView = listItemView.findViewById(R.id.artist);
        // Get the default translation from the currentSong object and set this text on
        // the default TextView.
        artistTextView.setText(currentSong.getArtist());

        //Find The Album Art for the song
        ImageView coverArtView = listItemView.findViewById((R.id.cover_art_icon));
        //Get the cover art from the currentSong object and set it in the  coverArt ImageView.
        coverArtView.setImageResource(currentSong.getImageResourceId());

        //Find The Play Button.
        Button playButton = listItemView.findViewById(R.id.play_button);
                playButton.setText("Play");




        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }








}
