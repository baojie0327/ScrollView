package com.jackson.scrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jackson.scrollview.activity.DragActivity;
import com.jackson.scrollview.activity.ScrollerActivity;
import com.jackson.scrollview.adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;

    private HomeAdapter mHomeAdapter;

    private List<String> mDatas=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        mRecycleView.setLayoutManager(layoutManager);

        mDatas.add("layout/off/scroll");
        mDatas.add("Scroller");

        mHomeAdapter=new HomeAdapter(R.layout.item_home_layout,mDatas);
        mRecycleView.setAdapter(mHomeAdapter);

        mHomeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this, DragActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ScrollerActivity.class));
                        break;
                }

            }
        });




    }
}
