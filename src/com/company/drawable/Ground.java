package com.company.drawable;

import com.company.Drawable;
import com.company.drawable.drawunits.nature_units.Hill;

import java.awt.*;

public class Ground implements Drawable {
    private int N;
    private Color color = new Color(0x6A7C43);
    private int[][] hillPoints;

    public Ground(int n) {
        N = n;
    }

    public Ground(int n, Color color) {
        N = n;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 500, 1500, 400);
        int[][] hillPoints = new int[N][2];
        for (int i = 1; i <= N; i++) {
            int random = (int) (Math.random() * 100 + Math.random() * 1000 * i);
            int randomWidth = (int) (Math.random() * (370 - 100) + 100);
            int notSoRandomHeight = randomWidth*3/2;
            hillPoints[i - 1][0] = random + randomWidth/2;
            hillPoints[i - 1][1] = 500 - notSoRandomHeight/2;
            Hill hill = new Hill(random, 500 - notSoRandomHeight/2, randomWidth, notSoRandomHeight);
            hill.draw(g);
        }
        this.hillPoints = hillPoints;
    }

    public int[][] getHillPoints() {
        return this.hillPoints;
    }
}
