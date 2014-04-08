package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.android.thedazzler.typroid.R;


public class Subtitle extends BaseTyproidTextView
{

    public Subtitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Subtitle(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.typroidSubtitleStyle);
    }

    public Subtitle(Context context) {
        this(context, null);
    }

    @Override
    public int getStyle()
    {
        return R.style.TyproidSubtitle;
    }

}
