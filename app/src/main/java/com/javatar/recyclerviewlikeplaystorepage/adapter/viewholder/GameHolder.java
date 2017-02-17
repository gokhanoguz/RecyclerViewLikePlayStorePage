package com.javatar.recyclerviewlikeplaystorepage.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.javatar.recyclerviewlikeplaystorepage.R;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class GameHolder extends RecyclerView.ViewHolder {

    public TextView gameTitle;
    public ImageView gameImage;

    public GameHolder(View view) {
        super(view);
        this.gameTitle = (TextView) view.findViewById(R.id.gameTitle);
        this.gameImage = (ImageView) view.findViewById(R.id.gameImage);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), gameTitle.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
