package com.company.drawable.drawunits;

import com.company.Drawable;

import java.awt.*;

public class Window implements Drawable {
    private int X, Y, width, height;

    public Window(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(X, Y, width, height);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X, Y + height / 3, width, height / 15);
        g.fillRect(X + width / 2, Y, height / 15, height / 3);

        Frame frame = new Frame(X, Y, width, height, height / 15, Color.LIGHT_GRAY);
        frame.draw(g);
    }
}
