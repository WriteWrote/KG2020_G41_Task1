package com.company.drawable.drawunits.castle_units;

import com.company.Drawable;

import java.awt.*;

public class CouncilSpike implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.PINK;

    public CouncilSpike(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public CouncilSpike(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = new int[20];
        int[] yPoints = new int[20];
        int deltaY = height / 5, deltaX = width / 8;
        xPoints[0] = X;
        xPoints[1] = X + deltaX / 2;
        xPoints[2] = X + deltaX / 2;
        xPoints[3] = X + deltaX / 2 + deltaX;
        xPoints[4] = X + deltaX / 2 + deltaX;
        xPoints[5] = X + deltaX / 2 + 2 * deltaX;
        xPoints[6] = X + deltaX / 2 + 2 * deltaX;
        xPoints[7] = X + deltaX / 2 + 3 * deltaX;
        xPoints[8] = X + deltaX / 2 + 3 * deltaX;
        xPoints[9] = X + deltaX / 2 + 4 * deltaX;
        xPoints[10] = X + deltaX / 2 + 4 * deltaX;
        xPoints[11] = X + deltaX / 2 + 5 * deltaX;
        xPoints[12] = X + deltaX / 2 + 5 * deltaX;
        xPoints[13] = X + deltaX / 2 + 6 * deltaX;
        xPoints[14] = X + deltaX / 2 + 6 * deltaX;
        xPoints[15] = X + deltaX / 2 + 7 * deltaX;
        xPoints[16] = X + deltaX / 2 + 7 * deltaX;
        xPoints[17] = X + width;

        xPoints[18] = X + width;
        xPoints[19] = X;

        yPoints[0] = Y;
        yPoints[1] = Y;
        yPoints[2] = Y + deltaY;
        yPoints[3] = Y + deltaY;
        yPoints[4] = Y;
        yPoints[5] = Y;
        yPoints[6] = Y+deltaY;
        yPoints[7] = Y+deltaY;
        yPoints[8] = Y;
        yPoints[9] = Y;
        yPoints[10] =Y+deltaY;
        yPoints[11] = Y+deltaY;
        yPoints[12] = Y;
        yPoints[13] = Y;
        yPoints[14] = Y+deltaY;
        yPoints[15] = Y+deltaY;
        yPoints[16] = Y;
        yPoints[17] = Y;

        yPoints[18] = Y + height;
        yPoints[19] = Y + height;

        Polygon p = new Polygon(xPoints, yPoints, xPoints.length);
        g.setColor(color);
        g.fillPolygon(p);
    }
}
