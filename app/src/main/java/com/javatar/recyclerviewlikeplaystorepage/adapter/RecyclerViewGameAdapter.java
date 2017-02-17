package com.javatar.recyclerviewlikeplaystorepage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javatar.recyclerviewlikeplaystorepage.R;
import com.javatar.recyclerviewlikeplaystorepage.adapter.viewholder.GameHolder;
import com.javatar.recyclerviewlikeplaystorepage.model.GameModel;

import java.util.List;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class RecyclerViewGameAdapter extends RecyclerView.Adapter<GameHolder> {

    private List<GameModel> mItemsList;
    private Context mContext;

    public RecyclerViewGameAdapter(Context context, List<GameModel> itemsList) {
        this.mItemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public GameHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_list_game, null);
        GameHolder holder = new GameHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(GameHolder holder, int i) {
        GameModel gameModel = mItemsList.get(i);
        holder.gameTitle.setText(gameModel.getGameName());
    }

    @Override
    public int getItemCount() {
        return (null != mItemsList ? mItemsList.size() : 0);
    }

}