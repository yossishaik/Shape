package com.coralbeauty.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Colombia on 9/3/2015.
 */
public class Rectangle extends OurShape{

    private int width;
    private int height;

    public Rectangle(Context context){
        super(context);

        width=1000;
        height=800;

        setX(600);
        setY(600);
        setColor(Color.BLUE);

    }

    public Rectangle(int x, int y, int color, int width, int height, Context context){
        super(context);

        setX(x);
        setY(y);
        setColor(color);
        this.width=width;
        this.height=height;


    }

    public int getwidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getheight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        paint.setColor(getColor());
        canvas.drawRect(getx(),gety(),getwidth(),getheight(),paint);
    }
}
