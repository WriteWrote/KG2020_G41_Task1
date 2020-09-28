package com.company.drawable;

import com.company.Drawable;
import com.company.drawable.drawunits.nature_units.Cloud;

import java.awt.*;

public class Sky implements Drawable {
    private Color skyColor = new Color(0x6FC6D0);
    private int N;

    public Sky(int n) {
        N = n;
    }

    public Sky(Color skyColor, int n) {
        this.skyColor = skyColor;
        N = n;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(skyColor);
        g.fillRect(0, 0, 1500, 500);

        for (int i=0; i<N; i++){
            int random = (int) (Math.random() * 100 + Math.random() * 1000 * i);
            Cloud cloud = new Cloud(random, 200-50*i, 100*i, 80*i);
            cloud.draw(g);
        }
    }
}
