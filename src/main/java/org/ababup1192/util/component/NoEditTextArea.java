package org.ababup1192.util.component;

import javax.swing.*;

public class NoEditTextArea extends JScrollPane {

    JTextArea textArea;

    public NoEditTextArea(String text, int width, int height) {
        super();
        textArea = new JTextArea(text, width, height);
        textArea.setEditable(false);
        setViewportView(textArea);
    }

    public NoEditTextArea(int width, int height) {
        this("", width, height);
    }

    public JTextArea getJTextArea() {
        return textArea;
    }
}
