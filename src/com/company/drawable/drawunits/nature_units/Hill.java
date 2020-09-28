package com.company.drawable.drawunits.nature_units;

import com.company.Drawable;

import java.awt.*;

public class Hill implements Drawable {
    private int X, Y, width, height;
    private Color groundColor = new Color(0x6A7C43);

    public Hill(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public Hill(int x, int y, int width, int height, Color groundColor) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.groundColor = groundColor;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(groundColor);
        g.fillArc(X, Y, width,height, 0, 180);
    }
}
