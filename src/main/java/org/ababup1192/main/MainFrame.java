package org.ababup1192.main;

import org.ababup1192.main.panel.BottomPanel;
import org.ababup1192.main.panel.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static void main(String args[]) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setTitle("採点");
        mainFrame.setSize(900, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainFrame() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel topPanel = new TopPanel();
        JPanel bottomPanel = new BottomPanel();

        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

        add(mainPanel, BorderLayout.CENTER);
    }

}