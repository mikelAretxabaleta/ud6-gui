package com.mikel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
    private JTextField textField1;
    private JPanel panel;
    private JPasswordField passwordField1;
    private JButton entrarButton;

    public Login() {
        entrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (textField1.getText().equalsIgnoreCase("mikel") && passwordField1.getText().equalsIgnoreCase("mikel"))
                JOptionPane.showMessageDialog(entrarButton, "Acceso concedido", "hola", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(entrarButton, "Acceso denegado", "adios", JOptionPane.ERROR_MESSAGE);


                background();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(400,400);
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void background(){





    }
}
