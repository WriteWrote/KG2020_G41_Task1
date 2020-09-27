package com.company.drawable.drawunits.nature_units;

import com.company.Drawable;

import java.awt.*;

public class BushTree implements Drawable {
    private int X, Y, width, height;
    private Color leafColor = new Color(0x4AA14E);
    private Color barkColor = new Color(0x874D46);

    public BushTree(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public BushTree(int x, int y, int width, int height, Color leafColor, Color barkColor) {
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
        g.fillOval(X, Y, width, 9 * height / 10);
        g.setColor(barkColor);
        g.fillRoundRect(X + width / 2 - width / 10, Y + 8 * height / 10, width / 5, height / 5, width / 10, width / 10);
    }
}
