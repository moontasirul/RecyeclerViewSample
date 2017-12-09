package com.project.test.samplerecyclerviewproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends AppCompatActivity {

    private String itemType;

    private List<SongModel> songList, sortedList;
    private RecyclerView recyclerView;
    private ViewAdapter mAdapter;

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

        itemType= getIntent().getStringExtra("itemType");

        Log.i("check_item", ""+itemType);


        songList = new ArrayList<>();
        sortedList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new ViewAdapter(this);
        recyclerView.setAdapter(mAdapter);





        Log.i("checkList", ""+songList.toString());
        prepareMovieData();

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




//    public List<SongModel> fill_with_data() {
//
//        List<SongModel> data = new ArrayList<>();
//
//        SongModel songModel = new SongModel();
//
////        data.add(new SongModel("Batman vs Superman", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman "));
////        data.add(new SongModel("X-Men: Apocalypse", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics "));
////        data.add(new SongModel("Captain America: Civil War", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  "));
////        data.add(new SongModel("Kung Fu Panda 3", "After reuniting with his long-lost father, Po  must train a village of pandas"));
////        data.add(new SongModel("Warcraft", "Fleeing their dying home to colonize another, fearsome orc warriors invade the peaceful realm of Azeroth. "));
////        data.add(new SongModel("Alice in Wonderland", "Alice in Wonderland: Through the Looking Glass "));
////
//
//        songModel.setSongTitle("Batman vs Superman");
//        songModel.setSingerName("");
//        songModel.setSongTypes("");
//
//        data.add(songModel);
//
//        return data;
//    }



    private void prepareMovieData() {
        SongModel songModel = new SongModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        songList.add(songModel);

        songModel = new SongModel("Inside Out", "Animation, Kids & Family", "2015");
        songList.add(songModel);

        songModel = new SongModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        songList.add(songModel);

        songModel = new SongModel("Shaun the Sheep", "Animation", "2015");
        songList.add(songModel);

        songModel = new SongModel("The Martian", "Science Fiction & Fantasy", "2015");
        songList.add(songModel);

        songModel = new SongModel("Mission: Impossible Rogue Nation", "Action", "2015");
        songList.add(songModel);

        songModel = new SongModel("Up", "Animation", "2009");
        songList.add(songModel);

        songModel = new SongModel("Star Trek", "Science Fiction", "2009");
        songList.add(songModel);

        songModel = new SongModel("The LEGO Movie", "Animation", "2014");
        songList.add(songModel);

        songModel = new SongModel("Iron Man", "Action & Adventure", "2008");
        songList.add(songModel);

        songModel = new SongModel("Aliens", "Science Fiction", "1986");
        songList.add(songModel);

        songModel = new SongModel("Chicken Run", "Animation", "2000");
        songList.add(songModel);

        songModel = new SongModel("Back to the Future", "Science Fiction", "1985");
        songList.add(songModel);

        songModel = new SongModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        songList.add(songModel);

        songModel = new SongModel("Goldfinger", "Action & Adventure", "1965");
        songList.add(songModel);

        songModel = new SongModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        songList.add(songModel);


        Log.i("checkList1", ""+songList.toString());
        for(SongModel song:songList){
          //  Log.i("checkList2", ""+song.getSongTypes());

            if(song.getSongTypes().equalsIgnoreCase("2015")){
                Log.i("checkList3", ""+ song.getSongTypes());
                mAdapter.addItems(songList);
            }
        }



      //  mAdapter.addItems(songList);
        mAdapter.notifyDataSetChanged();
    }
}
