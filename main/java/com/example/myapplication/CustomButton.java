package com.example.myapplication;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public  void init()
    {
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                boolean isClicked = false;

                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        setWidth((int) (getWidth()+500));
                        break;
                    case MotionEvent.ACTION_UP:
                        setWidth(getWidth()-500);
                        break;
                }
                return false;
            }
        });
    }
}
