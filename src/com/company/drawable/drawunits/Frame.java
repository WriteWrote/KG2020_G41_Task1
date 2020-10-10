package com.company.drawable.drawunits;

import com.company.Drawable;

import java.awt.*;

public class Frame implements Drawable {
    private int X, Y, width, length, thickness;
    private Color color = Color.GRAY;
    private String text = "Unknown painter";

    public Frame(int x, int y, int width, int length, int thickness, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.color = color;
    }

    public Frame(int x, int y, int width, int length, int thickness, String text, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.text = text;
        this.color = color;
    }

    public Frame(int x, int y, int width, int length, int thickness) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
    }

    public Frame(int x, int y, int width, int length, int thickness, String text) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);

        g.fillRect(X, Y, width, thickness);
        g.fillRect(X, Y, thickness, length);
        g.fillRect(X + width - thickness, Y, thickness, length);
        g.fillRect(X, Y + length - thickness, width, thickness);
    }
}
