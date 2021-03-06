package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.android.thedazzler.typroid.utils.FontUtils;
import com.android.thedazzler.typroid.R;

public class Heading extends BaseTyproidTextView
{
    public Heading(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    public Heading(Context context, AttributeSet attrs)
    {
        this(context, attrs, R.attr.typroidHeadingStyle);
    }

    public Heading(Context context)
    {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidHeading;
    }

}
