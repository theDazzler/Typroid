package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;

import com.android.thedazzler.typroid.R;

/**
 * Created by Devon Guinane on 4/10/14.
 * Typroid
 */
public class P extends BaseTyproidTextView
{

    public P(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public P(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidPStyle);
    }

    public P(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidP;
    }
}
