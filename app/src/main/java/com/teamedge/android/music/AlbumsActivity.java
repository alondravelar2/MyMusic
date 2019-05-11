package com.teamedge.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<String> albums = new ArrayList<>();
        albums.add("Khalid: American Teen");
        albums.add("Khalid: Suncity");
        albums.add("Amine: Good for You");
        albums.add("Amine: ONEPOINTFIVE");
        albums.add("J.Cole: 4 your Eyes Only");
        albums.add("J.Cole: KOD");
        albums.add("Travis Scott: Travis la Flame");
        albums.add("Travis Scott: Astroworld");

        ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.american);
        image.add(R.drawable.suncity);
        image.add(R.drawable.good4u);
        image.add(R.drawable.one);
        image.add(R.drawable.four);
        image.add(R.drawable.kod);
        image.add(R.drawable.flame);
        image.add(R.drawable.astro);

        ArrayAdapter<String> itemsAdapter = new CategoryAdapter(this, albums, image);
        ListView listView = findViewById(R.id.albums_list);
        listView.setAdapter(itemsAdapter);
    }
}
