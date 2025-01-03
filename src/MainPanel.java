import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class MainPanel extends JPanel {

    MainPanel() {
        this.setBackground(new Color(33, 42, 55));
        this.setLayout(new GridLayout(3, 2));
        this.setPreferredSize(new Dimension(100, 100));
    }

    public void addTask (String taskName) throws IOException, InterruptedException {
        JCheckBox checkBox = new JCheckBox(taskName);
        checkBox.setBackground(new Color(33, 42, 55));
        checkBox.setForeground(new Color(255, 255, 255));
        checkBox.setFont(new Font("Roboto", Font.PLAIN, 20));

        this.add(checkBox);
        this.revalidate();
        this.repaint();

        checkBox.addActionListener((e -> {
            int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this task?", null, JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                this.remove(checkBox);
                this.repaint();
            }
        }));

        if (taskName == null || taskName.equals("")) {
            this.remove(checkBox);
            this.repaint();
        }
    }
        }
