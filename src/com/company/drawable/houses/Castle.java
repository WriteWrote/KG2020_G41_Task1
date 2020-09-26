package com.company.drawable.houses;

import java.awt.*;

public class Castle extends House {
    private int X, Y, width, height, N_OfTowers;
    private Color color = Color.pink;

    public Castle(int x, int y, int width, int height) {
        super(x, y, width, height);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public Castle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {

    }
}
