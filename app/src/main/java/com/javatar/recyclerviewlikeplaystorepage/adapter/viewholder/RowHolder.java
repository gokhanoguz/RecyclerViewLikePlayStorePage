package com.javatar.recyclerviewlikeplaystorepage.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.javatar.recyclerviewlikeplaystorepage.R;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class RowHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public RecyclerView gameRecyclerView;
    public Button morebButton;

    public RowHolder(final View view) {
        super(view);

        this.title = (TextView) view.findViewById(R.id.titleTextView);
        this.gameRecyclerView = (RecyclerView) view.findViewById(R.id.gameRecyclerView);
        this.morebButton = (Button) view.findViewById(R.id.moreButton);

        this.morebButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), title.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
