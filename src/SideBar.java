import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideBar extends MainPanel implements ActionListener {

    JButton createTask;
    JButton exportTask;
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

        exportTask = new JButton("Export tasks");
        exportTask.setFocusable(false);
        exportTask.addActionListener(this);
        exportTask.setBackground(new Color(33, 42, 55));
        exportTask.setForeground(Color.WHITE);
        exportTask.setFont(new Font("Roboto", Font.BOLD, 20));
        exportTask.setBorderPainted(false);

        gbc.gridy = 1;

        this.add(exportTask, gbc);

        clearTask = new JButton("Clear tasks");
        clearTask.setFocusable(false);
        clearTask.addActionListener(this);
        clearTask.setBackground(new Color(33, 42, 55));
        clearTask.setForeground(Color.WHITE);
        clearTask.setFont(new Font("Roboto", Font.BOLD, 20));
        clearTask.setBorderPainted(false);

        gbc.gridy = 2;

        this.add(clearTask, gbc);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == createTask) {
           String taskName = JOptionPane.showInputDialog("Please enter the task name");
           mainPanel.addTask(taskName);
       }else if (e.getSource() == exportTask) {
           System.out.println("Tasks exported!");
       }else if (e.getSource() == clearTask) {
           mainPanel.removeAll();
           mainPanel.repaint();
       }
    }
}
