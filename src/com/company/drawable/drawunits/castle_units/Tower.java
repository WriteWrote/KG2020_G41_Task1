package com.company.drawable.drawunits.castle_units;

import com.company.Drawable;

import java.awt.*;

public class Tower implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.PINK;

    public Tower(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public Tower(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        CouncilSpike councilSpike = new CouncilSpike(X, Y, width, height / 4);
        councilSpike.draw(g);
        g.fillRect(X + width / 5, Y + height / 4, 3 * width / 5, 3 * height / 4);
        TowerWindow window = new TowerWindow(X + width / 2 - 3 * width / 20, Y + height / 3, 3 * width / 10);
        window.draw(g);
    }
}
