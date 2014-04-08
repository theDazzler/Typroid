package com.android.thedazzler.typroid.typography;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.android.thedazzler.typroid.R;
import com.android.thedazzler.typroid.utils.FontUtils;

/**
 * Created by Devon Guinane on 4/8/14.
 * Typroid
 */
public abstract class AbstractBaseTyproidTextView extends TextView
{
    private static final String FONT = "roboto-black";

    public abstract int getStyle();//R.style.TyproidHeading
    //R.attr.typroidHeadingStyle

    public AbstractBaseTyproidTextView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    public AbstractBaseTyproidTextView(Context context, AttributeSet attrs)
    {
        this(context, attrs, R.attr.typroidBaseTextViewStyle);
    }

    public AbstractBaseTyproidTextView(Context context)
    {
        this(context, null);
    }




    private void init(Context context, AttributeSet attrs, int defStyle)
    {
        //used in Designer view
        if (isInEditMode()) {
            return;
        }

        //get font
        //readFont(getContext());


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Typroid, defStyle, getStyle());
        String customFont;

        try {
            customFont = a.getString(R.styleable.Typroid_typ_font);
        }
        finally {
            a.recycle();
        }

        if(customFont == null)
        {
            customFont = FONT;
        }

        Typeface face = FontUtils.getFont(context, customFont);
        if(face != null)
        {
            this.setTypeface(face);
        }


        //this.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(this.getFontSize()));
        //this.setTextColor(this.getFontColor());


    }
}
