package com.company;

import com.company.drawable.houses.*;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        /*OneFloorHouse oneFloorHouse = new OneFloorHouse(getWidth()/8, 2*getHeight()/5, getWidth()/5, 2*getHeight()/5);
        oneFloorHouse.draw(g);

        NFloorHouse ThreeFloorHouse = new NFloorHouse(350, 50, 70, 100, 3, Color.GREEN);
        ThreeFloorHouse.draw(g);

        NFloorHouse OneFloorHouse = new NFloorHouse(450, 50, 100, 100, 1, Color.MAGENTA);
        OneFloorHouse.draw(g);

        Capitol library = new Capitol(50, 200, 120, 100, "Library", Color.MAGENTA);
        Capitol school = new Capitol(50, 350, 170, 100, "School #7", Color.ORANGE);
        school.draw(g);
        library.draw(g);
*/
        OneFloorHouse f = new OneFloorHouse(50, 50, 100, 100, Color.ORANGE);
        f.draw(g);
    }
}
