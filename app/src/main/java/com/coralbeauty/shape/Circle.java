package com.coralbeauty.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Colombia on 9/3/2015.
 */
public class Circle extends OurShape {

    private int radios;

    //בנאי שהמתכנת קובע את ערכי הקלאס
    public Circle(Context context) {
        super(context);

        radios = 150;

        setX(300);
        setY(300);
        setColor(Color.GREEN);

    }

    // בנאי שהמשתמש קובע את ערכי הקלאס בסוגרין יש ערכים של המשתמש
    public Circle(int x, int y, int color, int radios, Context context) {
        super(context);

        setX(x);
        setY(y);
        setColor(color);
        this.radios = radios;
    }
//מטודות של הקלאס לקביעת הרדיוס וקבלת הרדיוס מהמשתמש
    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        paint.setColor(getColor());
        canvas.drawCircle(getx(),gety(),getRadios(),paint);
    }
}
