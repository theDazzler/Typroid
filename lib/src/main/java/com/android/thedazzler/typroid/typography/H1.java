package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;

import com.android.thedazzler.typroid.R;

/**
 * Created by Devon Guinane on 1/16/14.
 * Typroid
 */
public class H1 extends Heading
{
    public H1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public H1(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidH1Style);
    }

    public H1(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidH1;
    }


    /*
    @Override
    public int getFontSize()
    {
        return R.dimen.font_h1;
    }*/

    /*
    @Override
    public int getFontColor() {
        return android.R.attr.textColorSecondaryInverse;
    }*/
}
