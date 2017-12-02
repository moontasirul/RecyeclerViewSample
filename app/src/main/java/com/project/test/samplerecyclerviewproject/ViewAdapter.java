package com.project.test.samplerecyclerviewproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Moon on 12/1/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {


    private List<SongModel> songModelList;

    private List<SongModel> sortedSongListNew;
    private String itemType;

    private Context mContext;

    public ViewAdapter(List<SongModel> songModelList, String itemType) {
        this.songModelList = songModelList;
        this.itemType = itemType;
        sortedSongListNew = new ArrayList<>();
    }


    public ViewAdapter(Context mContext) {
        this.mContext = mContext;
        sortedSongListNew = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);




        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewAdapter.ViewHolder holder, int position) {

        final SongModel songModel = sortedSongListNew.get(position);
        holder.tvTitle.setText(songModel.getSongTitle());
        holder.tvSingerName.setText(songModel.getSingerName());
        holder.tvSongType.setText(songModel.getSongTypes());


        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }









    public void addItem(List<SongModel> sortedSongList){
        for (SongModel model : sortedSongList) {
            SongModel newModel = new SongModel();
            if (model.getSongTypes().equalsIgnoreCase(itemType)) {
                newModel=model;
            }

            sortedSongListNew.add(newModel);
            Log.i("Newcheck1", String.valueOf(sortedSongList.size()));
        }
    }


    @Override
    public int getItemCount() {
        return sortedSongListNew.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvSingerName;
        TextView tvSongType;
        LinearLayout rootLayout;

        public ViewHolder(View itemView) {
            super(itemView);


            tvTitle = itemView.findViewById(R.id.tv_song_title);
            tvSingerName = itemView.findViewById(R.id.tv_singer_name);
            tvSongType = itemView.findViewById(R.id.tv_song_type);
            rootLayout = itemView.findViewById(R.id.root);
        }
    }
}
