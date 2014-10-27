package org.ababup1192.main.panel;

import org.ababup1192.util.component.LabeledPanel;
import org.ababup1192.util.component.NoEditTextArea;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {

    private NoEditTextArea resultArea;
    private NoEditTextArea sourceCodeArea;

    public TextAreaPanel() {
        super(new FlowLayout(FlowLayout.CENTER, 20, 0));

        resultArea = new NoEditTextArea(20, 20);
        sourceCodeArea = new NoEditTextArea(20, 20);

        JPanel resultAreaPane = new LabeledPanel("実行結果", resultArea);
        JPanel sourceCodeAreaPane = new LabeledPanel("ソースコード", sourceCodeArea);

        add(resultAreaPane);
        add(sourceCodeAreaPane);
    }

    public void setResultAreaText(String text) {
        resultArea.getJTextArea().setText(text);
    }

    public void setSourceCodeAreaText(String text) {
        sourceCodeArea.getJTextArea().setText(text);
    }

}
