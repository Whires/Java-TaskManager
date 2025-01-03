import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static javax.swing.JOptionPane.*;

public class SideBar extends MainPanel implements ActionListener {

    JButton createTask;
    JButton restoreTask;
    JButton clearTask;
    MainPanel mainPanel;

    SideBar (MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        this.setBackground(new Color(10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(200, 100));

        createTask = new JButton("Create Task");
        createTask.setFocusable(false);
        createTask.addActionListener(this);
        createTask.setBackground(new Color(33, 42, 55));
        createTask.setForeground(Color.WHITE);
        createTask.setFont(new Font("Roboto", Font.BOLD, 20));
        createTask.setBorderPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 0;

        this.add(createTask, gbc);

        clearTask = new JButton("Clear tasks");
        clearTask.setFocusable(false);
        clearTask.addActionListener(this);
        clearTask.setBackground(new Color(33, 42, 55));
        clearTask.setForeground(Color.WHITE);
        clearTask.setFont(new Font("Roboto", Font.BOLD, 20));
        clearTask.setBorderPainted(false);

        gbc.gridy = 1;

        this.add(clearTask, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == createTask) {
           String taskName = showInputDialog("Please enter the task name");

           try {
               mainPanel.addTask(taskName);
           } catch (IOException ex) {
               throw new RuntimeException(ex);
           } catch (InterruptedException ex) {
               throw new RuntimeException(ex);
           }
       }else if (e.getSource() == clearTask) {
           int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete everything?", null, JOptionPane.YES_NO_OPTION);
           if (a == JOptionPane.YES_OPTION) {
               mainPanel.removeAll();
               mainPanel.repaint();
               }
           }
       }
    }
