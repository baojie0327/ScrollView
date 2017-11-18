package com.jackson.scrollview.view; /**
 * DragView  2017-11-08
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2017 11 08
 */
public class DragView extends View {

    //记录上次触摸的坐标
    private int lastX;
    private int lastY;

    public DragView(Context context) {
        super(context);
    }

    public DragView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DragView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //获取触摸点的坐标
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: //处理按下事件
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE: //处理滑动事件
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                //layout()方法
                //  layout(getLeft()+offsetX,getTop()+offsetY,getRight()+offsetX,getBottom()+offsetY);

                // offsetLeftAndRight（）和 offsetTopAndBottom（）方法
               /* offsetLeftAndRight(offsetX);
                offsetTopAndBottom(offsetY);*/

               //LayoutParams方法
               /* LinearLayout.LayoutParams layoutParams= (LinearLayout.LayoutParams) getLayoutParams();
                layoutParams.leftMargin=getLeft()+offsetX;
                layoutParams.topMargin=getTop()+offsetY;
                setLayoutParams(layoutParams);*/

               //scrollTo 和 scrollBy 方法
                ((View) getParent()).scrollBy(-offsetX, -offsetY);
                break;
            case MotionEvent.ACTION_UP:  //处理抬起事件

                break;
        }
        return true;
    }
}

