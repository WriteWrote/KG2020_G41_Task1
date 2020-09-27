package com.company.drawable.drawunits.nature_units;

import com.company.Drawable;

import java.awt.*;

public class Cloud implements Drawable {
    private int X, Y, width, height;
    private Color color = new Color(0xD9F0F0);

    public Cloud(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public Cloud(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(X, Y, width, height);

    }
}
