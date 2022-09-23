import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        Color dark = new Color(0xFF1F1F1F), light = new Color(-1);

        setTitle("Theme Switcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(light);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);

        JCheckBox checkbox = new JCheckBox("Dark Theme");
        checkbox.setBounds(10, 10, 135, 25);
        checkbox.setFocusable(false);

        JButton button = new JButton("Apply");
        button.setBounds(10, 40, 135, 25);
        button.setBackground(light);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createLineBorder(light.darker(), 1));
        button.addActionListener(e -> {
                getContentPane().setBackground(checkbox.isSelected() ? dark : light);

                checkbox.setBackground(checkbox.isSelected() ? dark : light);
                checkbox.setForeground(checkbox.isSelected() ? light : dark);

                button.setBackground(checkbox.isSelected() ? dark.brighter() : light);
                button.setForeground(checkbox.isSelected() ? light : dark);
                button.setBorder(BorderFactory.createLineBorder(checkbox.isSelected() ? dark.darker() : light.darker(), 1));
        });

        add(checkbox);
        add(button);
        repaint();
    }

    public static void main(String[] args) { new Main(); }

}
