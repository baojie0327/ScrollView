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
  
![](https://github.com/baojie0327/ScrollView/blob/master/image/1111.gif)



ViewDragHelper的使用，大体可以分为以下三个步骤

创建并初始化ViewDragHelper实例
触摸相关的方法的调用
ViewDragHelper.Callback实例的编写

```
private ViewDragHelper.Callback mCallback = new ViewDragHelper.Callback() {
        @Override
        public boolean tryCaptureView(View child, int pointerId) {
            return true;
        }

        @Override
        public int clampViewPositionHorizontal(View child, int left, int dx) {
            return left;
        }

        @Override
        public int clampViewPositionVertical(View child, int top, int dy) {
            return top;
        }

    };
   ```
    
  ![](https://github.com/baojie0327/ScrollView/blob/master/image/2222.gif)
  
   ![](https://github.com/baojie0327/ScrollView/blob/master/image/3333.gif)
    
    

 
