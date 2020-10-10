package com.company.drawable;

import com.company.Drawable;
import com.company.drawable.drawunits.nature_units.Cloud;
import com.company.drawable.drawunits.nature_units.Sun;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Sky implements Drawable {
    private Color skyColor = new Color(0x6FC6D0);
    private int N;
    private boolean isSunny;

    public Sky(int n, boolean isSunny) {
        N = n;
        this.isSunny = isSunny;
    }

    public Sky(Color skyColor, int n, boolean isSunny) {
        this.skyColor = skyColor;
        N = n;
        this.isSunny = isSunny;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(skyColor);
        g.fillRect(0, 0, 1500, 500);
        if (isSunny){
            int random = (int) (Math.random() * 100 + Math.random() * 1000);
            Sun sun = new Sun(random, 100, 100, 50, 13);
            sun.draw(g);
        }
        for (int i=0; i<N; i++){
            int random = (int) (Math.random() * 100 + Math.random() * 1000 * i);
            Cloud cloud = new Cloud(random, 200-50*i, 100*i, 80*i);
            cloud.draw(g);
        }
    }
}
