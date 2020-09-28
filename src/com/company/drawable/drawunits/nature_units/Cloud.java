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
        g.fillOval(X, Y, width*6/10, height*6/10);
        g.fillOval(X - 2*width/10, Y + 2*height/10, width*4/10, height*4/10);
        g.fillOval(X + width*4/10, X + height/10, width*4/10, height*4/10);
        g.fillOval(X, Y + height/4, width*6/10, height*6/10);
        g.fillOval(X - width/4, Y + height/3, width/2, height/2);
        g.fillOval(X + width/3, Y + height/3, width/2, height/2);
        g.fillOval(X - width/3, Y + height/5, width/3, height/3);
        g.fillOval(X + 6*width/10, Y + height/5, width/3, height/3);
    }
}
