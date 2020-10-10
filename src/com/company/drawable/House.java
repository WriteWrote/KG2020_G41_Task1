package com.company.drawable;

import com.company.Drawable;
import com.company.drawable.drawunits.Window;

import java.awt.*;

abstract public class House implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.GRAY;

    public House(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public House(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    protected void drawHouseUnit(Graphics g, int X, int Y, int width, int height, Color color){
        g.setColor(color);
        g.fillRect(X, Y, width, height);

        Window window = new Window(X + width / 8, Y + 2 * height / 4, width / 4, height / 3);
        window.draw(g);
    }
    protected void drawHouseUnit(Graphics g, int X, int Y, int width, int height){
        g.setColor(this.color);
        g.fillRect(X, Y, width, height);

        Window window = new Window(X + width / 8, Y + 2 * height / 4, width / 4, height / 3);
        window.draw(g);
    }
}
