package org.ababup1192.util.component;

import javax.swing.*;
import java.awt.*;

public class ScrolledListPane extends JScrollPane {

    JList<String> jList;

    public ScrolledListPane(String[] list, int width, int height) {
        super(new JList<String>(list));
        setPreferredSize(new Dimension(width, height));

        JViewport viewport = this.getViewport();
        jList = (JList<String>) viewport.getView();
    }

    public JList<String> getJList(){
        return jList;
    }
}
