package com.company.drawable.drawunits.nature_units;

import com.company.Drawable;

import java.awt.*;

public class TwoFloorTree implements Drawable {
    private int X, Y, width, height;
    private Color leafColor = new Color(0x4AA14E);
    private Color barkColor = new Color(0x874D46);

    public TwoFloorTree(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public TwoFloorTree(int x, int y, int width, int height, Color leafColor, Color barkColor) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.leafColor = leafColor;
        this.barkColor = barkColor;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(leafColor);
        g.fillOval(X, Y + height / 2 - height / 3, width, height / 2);
        g.fillArc(X+width/2 - 3*width/10, Y, 6*width/10, height / 2, -45, 270);
        g.setColor(barkColor);
        g.fillRoundRect(X + width / 2 - width / 10, Y + height / 2, width / 5, height / 2, width / 10, width / 10);
    }
}
