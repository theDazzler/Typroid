package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.android.thedazzler.typroid.utils.FontUtils;
import com.android.thedazzler.typroid.R;

public abstract class Heading extends TextView
{
    private static final String FONT = "roboto-black";

    public Heading(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    public Heading(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context, attrs);
    }

    public Heading(Context context)
    {
        super(context, null);
        init(context, null);
    }

    public abstract int getFontSize();
    public abstract int getFontColor();

    private void init(Context context, AttributeSet attrs)
    {
        //used in Designer view
        if (isInEditMode()) {
            return;
        }

        //get font
        //readFont(getContext());


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TyproidHeading);

        try {
            boolean test = a.getBoolean(R.styleable.TyproidHeading_typ_test, false);
        }
        finally {
            a.recycle();
        }

        Typeface face = FontUtils.getFont(context, FONT);
        if(face != null)
        {
            this.setTypeface(face);
        }


        this.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(this.getFontSize()));
        this.setTextColor(this.getFontColor());


    }
}
