package com.jackson.scrollview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jackson.scrollview.R;
import com.jackson.scrollview.view.CustomView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScrollerActivity extends AppCompatActivity {

    @BindView(R.id.customView)
    CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);
        ButterKnife.bind(this);
        mCustomView.smoothScrollTo(-400,-400);
    }
}
