package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        /*OneFloorHouse oneFloorHouse = new OneFloorHouse(getWidth()/8, 2*getHeight()/5, getWidth()/5, 2*getHeight()/5);
        oneFloorHouse.draw(g);
*/
        NFloorHouse ThreeFloorHouse = new NFloorHouse(350, 50, 70, 100, 3, Color.GREEN);
        ThreeFloorHouse.draw(g);

        NFloorHouse OneFloorHouse = new NFloorHouse(450, 50, 100, 100, 1, Color.MAGENTA);
        OneFloorHouse.draw(g);

        Capitol library = new Capitol(50, 200, 100, 150, "Library", Color.MAGENTA);
        library.draw(g);

    }
}
