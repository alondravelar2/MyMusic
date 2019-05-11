package com.teamedge.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGenresActivity(View view) {
        Intent i = new Intent(this, GenresActivity.class);
        startActivity(i);
}

   public void openArtistsActivity(View view) {
      Intent i = new Intent(this, ArtistsActivity.class);
       startActivity(i);
   }

   public void openAlbumsActivity(View view) {
       Intent i = new Intent(this, AlbumsActivity.class);
       startActivity(i);
    }

    public void openPlaylistsActivity(View view) {
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }

}
