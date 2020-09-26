package com.company.drawable.util_drawunits;

import com.company.Drawable;

import java.awt.*;

public class Door implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.GRAY;

    public Door(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Door(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(X, Y, width, height);
        for (int i = width / 10; i < width - width / 10; i += 5 * width / 10) {
            g.setColor(Color.darkGray);
            g.fillRect(X + i, Y + height / 15, 3 * width / 10, 4 * height / 10);
        }
        for (int i = width / 10; i < width - width / 10; i += 5 * width / 10) {
            g.setColor(Color.darkGray);
            g.fillRect(X + i, Y + 8 * height / 15, 3 * width / 10, 4 * height / 10);
        }
    }
}
