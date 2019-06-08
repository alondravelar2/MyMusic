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
        artists.add("Tyler the Creator");
        artists.add("Rex Orange County");
        artists.add("Cuco");
        artists.add("Cage the Elephant");
        artists.add("Carla Morrison");
        artists.add("Jesse y Joy");
        artists.add("Roberto Carlos");

        ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.khalid);
        image.add(R.drawable.cole);
        image.add(R.drawable.amine);
        image.add(R.drawable.russ);
        image.add(R.drawable.tylerthecreator);
        image.add(R.drawable.rexorangecounty);
        image.add(R.drawable.cuco);
        image.add(R.drawable.cagetheelephant);
        image.add(R.drawable.morrison);
        image.add(R.drawable.jesseyjoy);
        image.add(R.drawable.robertocarlos);

        ArrayAdapter<String> itemsAdapter = new CategoryAdapter(this, artists, image);
        ListView listView = findViewById(R.id.artists_list);
        listView.setAdapter(itemsAdapter);
    }

}
