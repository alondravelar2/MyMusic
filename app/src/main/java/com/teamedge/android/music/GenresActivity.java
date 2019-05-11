package com.teamedge.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        ArrayList<String> genres = new ArrayList<>();
        genres.add("Hip-hop");
        genres.add("R&B");
        genres.add("Rap");
        genres.add("Indie alternative");
        genres.add("Latin Music");

        ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.hiphop);
        image.add(R.drawable.rb);
        image.add(R.drawable.rap);
        image.add(R.drawable.alternative);
        image.add(R.drawable.latin);

        ArrayAdapter<String> itemsAdapter = new CategoryAdapter(this, genres, image);
        ListView listView = findViewById(R.id.genres_list);
        listView.setAdapter(itemsAdapter);

    }

}
