package com.project.test.samplerecyclerviewproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moon on 12/1/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {


    private List<SongModel> songModelList;


    public ViewAdapter(List<SongModel> songModelList) {
        this.songModelList = songModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewAdapter.ViewHolder holder, int position) {

        final SongModel songModel = songModelList.get(position);

        holder.tvTitle.setText(songModel.getSongTitle());
        holder.tvSingerName.setText(songModel.getSingerName());
        holder.tvSongType.setText(songModel.getSongTypes());

        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



    /**
     * This method is responsible for add item in recyclerView adapter
     * @param mItemsList
     */
    public void addItems(@NonNull ArrayList<SongModel> mItemsList) {
        if (mItemsList == null || mItemsList.isEmpty()) {
            return;
        }
        mItemsList.clear();
        songModelList.clear();
        mItemsList.addAll(mItemsList);
        songModelList.addAll(mItemsList);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return songModelList.size();
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
