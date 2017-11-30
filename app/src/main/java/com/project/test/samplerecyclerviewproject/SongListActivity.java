package com.project.test.samplerecyclerviewproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends AppCompatActivity {

    private int itemType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        itemType= getIntent().getIntExtra("itemType",0);


        Log.i("check_item", ""+itemType);
    }







    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }




    public List<SongModel> fill_with_data() {

        List<SongModel> data = new ArrayList<>();

        SongModel songModel = new SongModel();

//        data.add(new SongModel("Batman vs Superman", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman "));
//        data.add(new SongModel("X-Men: Apocalypse", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics "));
//        data.add(new SongModel("Captain America: Civil War", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  "));
//        data.add(new SongModel("Kung Fu Panda 3", "After reuniting with his long-lost father, Po  must train a village of pandas"));
//        data.add(new SongModel("Warcraft", "Fleeing their dying home to colonize another, fearsome orc warriors invade the peaceful realm of Azeroth. "));
//        data.add(new SongModel("Alice in Wonderland", "Alice in Wonderland: Through the Looking Glass "));
//

        songModel.setSongTitle("Batman vs Superman");
        songModel.setSingerName("");
        songModel.setSongTypes("");

        data.add(songModel);

        return data;
    }
}
