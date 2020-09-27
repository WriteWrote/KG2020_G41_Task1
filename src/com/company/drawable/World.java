package com.company.drawable;

import com.company.Drawable;
import com.company.Panel;
import com.company.drawable.drawunits.nature_units.Hill;

import java.awt.*;

public class World implements Drawable {
    private Color groundColor = new Color(0x6A7C43);
    private Color skyColor = new Color(0x6FC6D0);
    private boolean isCloudy = true;
    private boolean isSunny = true;

    public World() {

    }

    public World(Color groundColor, Color skyColor, boolean isCloudy, boolean isSunny) {
        this.groundColor = groundColor;
        this.skyColor = skyColor;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    @Override
    public void draw(Graphics g) {
        Sky sky = new Sky(3);
        sky.draw(g);

        /*Hill[] hills = new Hill[(int) Math.random() * 3];
        g.setColor(groundColor);*/


    }
}
