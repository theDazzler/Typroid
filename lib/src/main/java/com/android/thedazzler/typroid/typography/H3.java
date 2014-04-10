package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;

import com.android.thedazzler.typroid.R;

/**
 * Created by Devon Guinane on 4/10/14.
 * Typroid
 */
public class H3 extends Heading
{
    public H3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public H3(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidH3Style);
    }

    public H3(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidH3;
    }
}
