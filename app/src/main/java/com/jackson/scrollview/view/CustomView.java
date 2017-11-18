package com.jackson.scrollview.view; /**
 * CustomView  2017-11-15
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2017 11 15
 */
public class CustomView extends View {


    private Scroller mScroller;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    /**
     * init
     */
    private void initView() {
        //初始化Scroller
        mScroller = new Scroller(getContext());
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        //判断Scroller是否执行完毕
        if (mScroller.computeScrollOffset()) {
            ((View) getParent()).scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            //通过重绘不断调用computeScroll()
            invalidate();
        }
    }




    /**
     * 调用此方法，平滑滑动到指定位置
     *
     * @param
     * @param
     */
    public void smoothScrollTo(int x,int y) {
        int dx = x - mScroller.getFinalX();
        int dy = y - mScroller.getFinalY();
        mScroller.startScroll(mScroller.getFinalX(),mScroller.getFinalY(),dx,dy,3000);
        invalidate();
    }


}

