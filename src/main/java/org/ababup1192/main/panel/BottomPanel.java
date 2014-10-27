package org.ababup1192.main.panel;

import org.ababup1192.util.component.LabeledPanel;
import org.ababup1192.util.component.ScrolledListPane;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class BottomPanel extends JPanel implements ListSelectionListener {
    private String[] initData = {"s1150253", "m5161117", "d8161105", "s1150253", "m5161117", "d8161105"};
    private ScrolledListPane listPane;
    private TextAreaPanel textAreaPane;

    public BottomPanel() {
        super(new FlowLayout(FlowLayout.CENTER, 50, 0));

        listPane = new ScrolledListPane(initData, 150, 325);
        LabeledPanel listPanel = new LabeledPanel("学生リスト", listPane);
        textAreaPane = new TextAreaPanel();

        listPane.getJList().addListSelectionListener(this);

        add(listPanel);
        add(textAreaPane);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = listPane.getJList().getSelectedIndex();
        String selectedElement = initData[selectedIndex];
        textAreaPane.setResultAreaText("[" + selectedElement + "の実行結果]");
        textAreaPane.setSourceCodeAreaText("[" + selectedElement + "のソースコード]");
    }
}
