package com.teamedge.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<String> artists = new ArrayList<>();
        artists.add("Khalid");
        artists.add("J Cole");
        artists.add("Amine");
        artists.add("Russ");
        artists.add("Travis Scott");
        artists.add("Carla Morrison");

        ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.khalid);
        image.add(R.drawable.cole);
        image.add(R.drawable.amine);
        image.add(R.drawable.russ);
        image.add(R.drawable.travis);
        image.add(R.drawable.morrison);

        ArrayAdapter<String> itemsAdapter = new CategoryAdapter(this, artists, image);
        ListView listView = findViewById(R.id.artists_list);
        listView.setAdapter(itemsAdapter);
    }

}
