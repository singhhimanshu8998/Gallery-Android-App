package com.example.myapplication;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;

public class editText extends AppCompatEditText {

    Drawable clearButton,clearButton1;

    public editText(Context context) {
        super(context);
        init();
    }

    public editText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init()
    {
        clearButton = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_black_24dp,null);
        clearButton1 = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_ligth_blue_24dp,null);

        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    showButton();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        setOnTouchListener(new OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float clearBtnstart;

                boolean isClicked = false;
                clearBtnstart = getWidth()-getPaddingEnd()-clearButton.getIntrinsicWidth();
                if (motionEvent.getX()>clearBtnstart)
                {
                    isClicked = true;
                }
                if(isClicked)
                {
                    switch (motionEvent.getAction())
                    {
                        case MotionEvent.ACTION_DOWN:
                            getText().clear();
                            break;
                        case MotionEvent.ACTION_UP:
                            hideButton();
                            break;
                    }
                }
                return false;
            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    void hideButton()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,
                clearButton1,null);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    void showButton()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,
                clearButton,null);
    }
}
