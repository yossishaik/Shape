package com.coralbeauty.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/**
 * Created by Colombia on 9/3/2015.
 */
public class OurShape extends View{
    //הגדרת משתנים בקלאס
    private int x;
    private int y;
    private int color;

    // הגדרת בנאי ברירת מחדל
    public OurShape(Context context) {
        super(context);

        x = 0;
        y = 0;
        color = Color.BLUE;

    }

    //הגדרת בנאי לפי בחירת המשתמש
    public OurShape(int x, int y, int color, Context context) {
        super(context);

        this.x = x;
        this.y = y;
        this.color = color;
    }

    // הגדרה אוטומטית של הג'אוה של קבלת משתנה מהקלאס והגדרת משתנים בקלאס
    public int getx() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
