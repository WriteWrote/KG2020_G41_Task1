package com.company.drawable.houses;

import com.company.Drawable;
import com.company.drawable.util_units.*;
import com.company.drawable.util_units.Window;

import java.awt.*;

public class OneFloorHouse extends House {
    private int X, Y, width, height;
    private Color color = Color.PINK;

    public OneFloorHouse(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public OneFloorHouse(int x, int y, int width, int height) {
        super(x, y, width, height);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        drawHouseUnit(g);
    }
}
