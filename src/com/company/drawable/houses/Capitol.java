package com.company.drawable.houses;

import com.company.Drawable;
import java.awt.*;

public class Capitol implements Drawable {
    private int X, Y, width, height;
    private String name;
    private Color color = Color.GRAY;

    public Capitol(int x, int y, int width, int height, String name) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public Capitol(int x, int y, int width, int height, String name, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        OneFloorHouse oneFloorHouse = new OneFloorHouse(X, Y, width, height, color);
        oneFloorHouse.draw(g);

        g.setColor(Color.CYAN);

        int lengthOfText = 8 * name.length();
        g.fillRect(X + (width - lengthOfText) / 2, Y, lengthOfText, 25);
        g.setColor(Color.black);
        g.drawString(name, X + (width - lengthOfText+7) / 2 + lengthOfText / 8, Y + 3*25/5);

    }
}
