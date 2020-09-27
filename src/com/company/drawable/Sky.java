package com.company.drawable;

import com.company.Drawable;
import com.company.MainForm;
import com.company.Panel;
import com.company.drawable.drawunits.Frame;
import com.company.drawable.drawunits.nature_units.Cloud;

import java.awt.*;
import java.util.Random;

public class Sky implements Drawable {
    private Color skyColor = new Color(0x6FC6D0);
    private int N = 3;

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

        /*Random random = new Random();
        for (int i=0; i<N; i++){
            int rY = random.nextInt((Panel.HEIGHT/5 - 100) + 1);
            rY += 100;
            int rX = random.nextInt((Panel.WIDTH - 200) + 1);
            rX += 100;
            Cloud cloud = new Cloud(rX, rY, rX/i, rY/i);
            cloud.draw(g);
        }*/
    }
}
