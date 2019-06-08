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
        playlists.add("8TEEN by Khalid");
        playlists.add("Foldin Clothes by J. Cole");
        playlists.add("Our Time by Russ");
        playlists.add("Together by Amine");
        playlists.add("Boredom by Tyler the Creator");
        playlists.add("Lo que Siento by Cuco");
        playlists.add("Corduroy Dreams by Rex Orange County");
        playlists.add("Cigarette Daydreams by Cage the Elephant");
        playlists.add("Hasta la Piel by Carla Morrison");
        playlists.add("Detalles by Roberto Carlos");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, playlists);
        ListView listView = findViewById(R.id.playlists_list);
        listView.setAdapter(itemsAdapter);
    }
}
