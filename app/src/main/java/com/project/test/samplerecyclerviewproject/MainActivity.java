package com.project.test.samplerecyclerviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnTypeOne, btnTypeTwo, btnTypeThree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();
        setOnClickListener();
    }


    private  void initialView(){

        btnTypeOne = findViewById(R.id.btn_song_type1);
        btnTypeTwo = findViewById(R.id.btn_song_type2);
        btnTypeThree = findViewById(R.id.btn_song_type3);


    }


    private void setOnClickListener(){

        btnTypeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongListActivity.class);
                intent.putExtra("itemType", "2015");
                startActivity(intent);
            }
        });

        btnTypeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongListActivity.class);
                intent.putExtra("itemType", "2009");
                startActivity(intent);
            }
        });

        btnTypeThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongListActivity.class);
                intent.putExtra("itemType", "1965");
                startActivity(intent);
            }
        });


    }






}
