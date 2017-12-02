package com.project.test.samplerecyclerviewproject;

import java.io.Serializable;

/**
 * Created by Moon on 12/1/2017.
 */

public class SongModel implements Serializable {

    private int songId;
    private String songTitle;
    private String singerName;
    private String songTypes;


    public SongModel(){

    }

    public SongModel(String songTitle, String singerName, String songTypes) {
        this.songTitle = songTitle;
        this.singerName = singerName;
        this.songTypes = songTypes;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongTypes() {
        return songTypes;
    }

    public void setSongTypes(String songTypes) {
        this.songTypes = songTypes;
    }



}
