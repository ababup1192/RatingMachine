package org.ababup1192.util.component;

import javax.swing.*;
import java.awt.*;

public class LabeledPanel extends JPanel {

    public LabeledPanel(String labelText, Component component) {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(labelText);

        // ラベル, 空白, コンポーネント
        add(label);
        add(Box.createRigidArea(new Dimension(10, 10)));
        add(component);
    }

    public Component getComponent() {
        return getComponent();
    }

}
