package com.coralbeauty.shape;

import android.graphics.Color;

/**
 * Created by Colombia on 9/3/2015.
 */
public class Rectangle extends OurShape{

    private int width;
    private int height;

    public Rectangle(){

        width=100;
        height=50;

        setX(0);
        setY(0);
        setColor(Color.BLACK);

    }

    public Rectangle(int x, int y, int color, int width, int height){

        setX(x);
        setY(y);
        setColor(color);
        this.width=width;
        this.height=height;


    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
