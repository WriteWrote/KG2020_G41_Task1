package com.company.drawable.houses;

import com.company.drawable.House;

import java.awt.*;

public class Capitol extends House {
    private int X, Y, width, height;
    private String name;
    private Color color = Color.GRAY;

    public Capitol(int x, int y, int width, int height, String name) {
        super(x, y, width, height);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public Capitol(int x, int y, int width, int height, String name, Color color) {
        super(x, y, width, height, color);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        /*OneFloorHouse oneFloorHouse = new OneFloorHouse(X, Y, width, height, color);
        oneFloorHouse.draw(g);
*/
        drawHouseUnit(g,X, Y, width, height, color);
        g.setColor(Color.CYAN);

        int lengthOfText = 8 * name.length();
        g.fillRect(X + (width - lengthOfText) / 2, Y, lengthOfText, 25);
        g.setColor(Color.black);
        g.drawString(name, X + (width - lengthOfText + 7) / 2 + lengthOfText / 8, Y + 3 * 25 / 5);

    }
}
