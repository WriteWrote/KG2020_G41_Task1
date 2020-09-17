package com.company;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm() throws HeadlessException {
        Panel panel = new Panel();
        this.add(panel);

        JTextField textField = new JTextField();
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panel.repaint();
            }
        });

    }
}
