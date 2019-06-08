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
        albums.add("Khalid:American Teen");
        albums.add("Khalid:Suncity");
        albums.add("Amine:Good for You");
        albums.add("Amine:ONEPOINTFIVE");
        albums.add("J.Cole:4 your Eyes Only");
        albums.add("J.Cole:KOD");
        albums.add("Tyler the Creator:Flower Boy");
        albums.add("Tyler the Creator:IGOR");
        albums.add("ROC:Bcos U Will Never B Free");
        albums.add("ROC:Apricot Princess");
        albums.add("Cuco:Wannabewithu");
        albums.add("Cuco:Songs4u");
        albums.add("CTE:Tell Me I'm Pretty");
        albums.add("CTE:Melophobia");
        albums.add("Carla Morrison:Déjame Llorar");
        albums.add("Carla Morrison:Amor Siempre");
        albums.add("RC:Canciones que Amo");
        albums.add("RC:Amor Sin Límite");

        ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.american);
        image.add(R.drawable.suncity);
        image.add(R.drawable.good4u);
        image.add(R.drawable.one);
        image.add(R.drawable.four);
        image.add(R.drawable.kod);
        image.add(R.drawable.flowerboy);
        image.add(R.drawable.igor);
        image.add(R.drawable.rocap);
        image.add(R.drawable.rexbcos);
        image.add(R.drawable.wannabewithu);
        image.add(R.drawable.songs4u);
        image.add(R.drawable.tellme);
        image.add(R.drawable.melophobia);
        image.add(R.drawable.llorar);
        image.add(R.drawable.amor);
        image.add(R.drawable.rccanciones);
        image.add(R.drawable.rcamor);

        ArrayAdapter<String> itemsAdapter = new CategoryAdapter(this, albums, image);
        ListView listView = findViewById(R.id.albums_list);
        listView.setAdapter(itemsAdapter);
    }
}
