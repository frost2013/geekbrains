package michail.kovalishev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardAndMouseTester extends JFrame {
    private final String keyboardCaption = "Number pressed: ";
    private final String mouseClicked = "Mouse clicked: ";

    private JLabel jLabelKeyboard = null;
    private JLabel jLabelMouse = null;

    public KeyboardAndMouseTester() {
        setResizable(false);
        setTitle("Keyboard and Mouse Tester");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(null);

        jLabelKeyboard = new JLabel(keyboardCaption + "[]");
        jLabelKeyboard.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelKeyboard.setBounds(0, 0, 198, 30);
        jLabelKeyboard.setBorder(BorderFactory.createLineBorder(Color.gray));

        jLabelMouse = new JLabel(mouseClicked + "[X: ,Y: ]");
        jLabelMouse.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMouse.setBounds(197, 0, 197, 30);
        jLabelMouse.setBorder(BorderFactory.createLineBorder(Color.gray));

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 30, 395, 370);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                if (!e.isActionKey() && !e.isAltDown() && !e.isAltGraphDown() && !e.isControlDown() && !e.isMetaDown() && !e.isShiftDown()) {
                    if (key >= '0' && key <= '9') {
                        jLabelKeyboard.setText(keyboardCaption + "[" + key + "]");
                    }
                }
            }
        });

        jPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jLabelMouse.setText(mouseClicked + "[X: " + e.getX()+ ", Y: " + e.getY() + "]");
            }
        });

        add(jLabelKeyboard);
        add(jLabelMouse);
        add(jPanel);

        setVisible(true);
    }
}
