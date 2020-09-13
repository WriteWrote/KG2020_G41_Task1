package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        AbstractVerticalPicture absVPict = new AbstractVerticalPicture(50, 50, 200, 300);
        absVPict.draw(g);
    }
}
