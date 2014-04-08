package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;

import com.android.thedazzler.typroid.R;

/**
 * Created by Devon Guinane on 1/16/14.
 * Typroid
 */
public class H2 extends Heading
{

    public H2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public H2(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidH2Style);
    }

    public H2(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidH2;
    }

}
