# ScrollView
View滑动有六种滑动的方法，分别是：layout()、offsetLeftAndRight()与offsetTopAndBottom()、LayoutParams、动画、scollTo与scollBy和Scroller
对手势的判断
```
@Override
    public boolean onTouchEvent(MotionEvent event) {
        //获取触摸点的坐标
        int x= (int) event.getX();
        int y= (int) event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN: //处理按下事件

                break;
            case MotionEvent.ACTION_MOVE: //处理滑动事件

                break;
            case MotionEvent.ACTION_UP:  //处理抬起事件

                break;
        }
        return true;
    }
    ```
