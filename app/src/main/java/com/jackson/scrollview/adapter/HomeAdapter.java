package com.jackson.scrollview.adapter; /**
 * HomeAdapter  2017-11-06
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jackson.scrollview.R;

import java.util.List;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2017 11 06
 */
public class HomeAdapter extends BaseQuickAdapter<String,BaseViewHolder>{


    public HomeAdapter(@LayoutRes int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.item,item);
    }
}

