package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        PanelOfExhibition p = new PanelOfExhibition(0,0, this.getWidth(), this.getHeight());
        p.draw(g);

        Frame grayFrame = new Frame(50, 50, 250, 350, 25);
        grayFrame.draw(g);
        AbstractVerticalPicture absVPict = new AbstractVerticalPicture(50+25, 50+25, 200, 300);
        absVPict.draw(g);

    }
}
