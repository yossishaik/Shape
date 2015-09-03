package com.coralbeauty.shape;

import android.graphics.Color;

/**
 * Created by Colombia on 9/3/2015.
 */
public class Circle extends OurShape {

    private int radios;

    public Circle(){

        radios=150;

        setX(0);
        setY(0);
        setColor(Color.GREEN);

    }

    public Circle(int x,int y,int color,int radios){

        setX(x);
        setY(y);
        setColor(color);
        this.radios=radios;
    }

    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }
}
