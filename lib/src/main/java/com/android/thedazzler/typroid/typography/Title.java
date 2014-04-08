package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;

import com.android.thedazzler.typroid.R;

/**
 * Created by Devon Guinane on 4/8/14.
 * Typroid
 */
public class Title extends Heading
{

    public Title(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Title(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidTitleStyle);
    }

    public Title(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidTitle;
    }


    /*
    @Override
    public int getFontSize()
    {
        return R.dimen.font_title;
    }*/
}
