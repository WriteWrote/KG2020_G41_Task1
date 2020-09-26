package com.company.drawable.util_drawunits;

import com.company.Drawable;

import java.awt.*;

public class TowerWindow implements Drawable {
    private int X, Y, diameter;

    public TowerWindow(int x, int y, int diameter) {
        X = x;
        Y = y;
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics g) {
        int thickness = diameter/10;
        g.setColor(Color.gray);
        g.fillOval(X - thickness, Y - thickness, diameter + thickness*2, diameter + thickness*2);
        g.setColor(Color.CYAN);
        g.fillOval(X, Y, diameter, diameter);

        g.setColor(Color.gray);
        g.fillRect(X, Y+diameter/2-thickness/2, diameter, thickness);
        g.fillRect(X+diameter/2-thickness/2, Y, thickness, diameter);
    }
}
