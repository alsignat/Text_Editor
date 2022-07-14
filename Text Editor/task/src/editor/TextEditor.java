package editor;

import javax.swing.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        setTitle("The first stage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {
        JTextArea textArea = new JTextArea();
        textArea.setName("TextArea");
        this.add(textArea);
    }
}
