package com.javatar.recyclerviewlikeplaystorepage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.javatar.recyclerviewlikeplaystorepage.adapter.RecyclerViewGameGroupAdapter;
import com.javatar.recyclerviewlikeplaystorepage.model.GameGroupModel;
import com.javatar.recyclerviewlikeplaystorepage.model.GameModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<GameGroupModel> mGameGroupModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        loadDummyData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerViewGameGroupAdapter adapter = new RecyclerViewGameGroupAdapter(this, mGameGroupModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

    public void loadDummyData() {
        mGameGroupModelList = new ArrayList<GameGroupModel>();

        for (int i = 1; i <= 10; i++) {
            GameGroupModel gameGroupModel = new GameGroupModel();
            gameGroupModel.setGroupTitle("Group " + i);
            List<GameModel> gameModelList = new ArrayList<GameModel>();
            for (int j = 0; j <= 10; j++) {
                gameModelList.add(new GameModel("Game " + j, "URL " + j, "DESC " + j));
            }

            gameGroupModel.setGameModelList(gameModelList);

            mGameGroupModelList.add(gameGroupModel);
        }
    }
}