package com.alexilyin.android.a3a_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    int[] data = {
            R.drawable.chip, R.drawable.chip2, R.drawable.donald, R.drawable.donald2,
            R.drawable.goofy, R.drawable.karlson, R.drawable.kesha, R.drawable.leopold,
            R.drawable.mickey_mouse, R.drawable.pumba, R.drawable.vinny, R.drawable.vinny2,
            R.drawable.volk, R.drawable.vovka, R.drawable.vovka2, R.drawable.vzhik
    };

    String[] descr = {
            "Dale", "Chip", "Donald Duck", "Donald",
            "Goofy", "Карлсон", "Попугай Кеша", "Кот Леопольд",
            "Mickey Mouse", "Pumba", "Винни Пух", "Пух",
            "Волк", "Вовка", "Вовка", "Вжик"
    };

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(this, null, 0, 0));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new RecycleViewAdapter(this, data, descr));
    }
}
