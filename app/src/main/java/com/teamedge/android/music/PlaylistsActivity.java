package com.teamedge.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ArrayList<String> playlists = new ArrayList<>();
        playlists.add("Upbeat Music");
        playlists.add("Study Music");
        playlists.add("Calm/sleep Music");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, playlists);
        ListView listView = findViewById(R.id.playlists_list);
        listView.setAdapter(itemsAdapter);
    }
}
