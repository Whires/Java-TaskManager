import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    MainPanel() {
        this.setBackground(new Color(33, 42, 55));
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(100, 100));

    }

    public static void addTask (String taskTest) {
        //JCheckBox checkBox = new JCheckBox();
        //checkBox.setText(taskTest);
    }
}
