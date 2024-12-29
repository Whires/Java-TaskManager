import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements ActionListener{
        JButton createTask;

    Frame(String title) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setLayout(new BorderLayout());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setMinimumSize(new Dimension(800, 600));
        ImageIcon icon = new ImageIcon("icon.jpeg");
        this.setIconImage(icon.getImage());

        MainPanel mainPanel = new MainPanel();
        SideBar sideBar = new SideBar(mainPanel);

        this.add(sideBar, BorderLayout.WEST);
        this.add(mainPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
