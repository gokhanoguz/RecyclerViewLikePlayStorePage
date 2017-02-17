package com.javatar.recyclerviewlikeplaystorepage.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.javatar.recyclerviewlikeplaystorepage.R;
import com.javatar.recyclerviewlikeplaystorepage.adapter.viewholder.RowHolder;
import com.javatar.recyclerviewlikeplaystorepage.model.GameGroupModel;
import com.javatar.recyclerviewlikeplaystorepage.model.GameModel;

import java.util.List;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class RecyclerViewGameGroupAdapter extends RecyclerView.Adapter<RowHolder> {

    private List<GameGroupModel> mGameGroupModelList;
    private Context mContext;

    public RecyclerViewGameGroupAdapter(Context context, List<GameGroupModel> gameGroupModelList) {
        this.mGameGroupModelList = gameGroupModelList;
        this.mContext = context;
    }

    @Override
    public RowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item_game_group, null);
        RowHolder holder = new RowHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RowHolder rowHolder, int i) {
        GameGroupModel groupModel = mGameGroupModelList.get(i);
        final String title = groupModel.getGroupTitle();
        rowHolder.title.setText(title);

        List<GameModel> gameModelList = groupModel.getGameModelList();
        RecyclerViewGameAdapter gameAdapter = new RecyclerViewGameAdapter(mContext, gameModelList);
        rowHolder.gameRecyclerView.setHasFixedSize(true);
        rowHolder.gameRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        rowHolder.gameRecyclerView.setAdapter(gameAdapter);
        rowHolder.gameRecyclerView.setNestedScrollingEnabled(false);
    }

    @Override
    public int getItemCount() {
        return (null != mGameGroupModelList ? mGameGroupModelList.size() : 0);
    }

}