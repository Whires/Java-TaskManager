import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MainPanel extends JPanel {

    MainPanel() {
        this.setBackground(new Color(33, 42, 55));
        this.setLayout(new GridLayout(3, 2));
        this.setPreferredSize(new Dimension(100, 100));
    }

    public void addTask (String taskName) throws IOException {
        JCheckBox checkBox = new JCheckBox(taskName);
        checkBox.setBackground(new Color(33, 42, 55));
        checkBox.setForeground(new Color(255, 255, 255));
        checkBox.setFont(new Font("Roboto", Font.PLAIN, 20));
        checkBox.addActionListener(e -> {

        });
        this.add(checkBox);
        this.revalidate();
        this.repaint();

        FileWriter fileWriter = new FileWriter("config.txt", true);
        fileWriter.write(taskName + "\n");
        fileWriter.close();
    }
}
