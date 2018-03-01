package com.mikel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agenda {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel nuevo;
    private JPanel ver;
    private JPanel buscar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JButton button1;
    private JButton button2;
    private JLabel nombre;
    private JLabel telefono;
    private JLabel email;
    private JLabel contador;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JButton buscarButton;
    private JLabel nombre1;
    private JLabel telefono1;
    private JLabel email1;


    public Agenda() {
        JFrame frame = new JFrame("Agenda");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(300, 300);
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Nombre", "Telefono", "Email"}));


        guardarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Funciones.guardar();
                Funciones.verAgenda();

            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Funciones.adelante();
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Funciones.atras();
            }
        });

        buscarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Funciones.buscar();


            }
        });
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public JLabel getTelefono() {
        return telefono;
    }

    public JLabel getEmail() {
        return email;
    }

    public JLabel getContador() {
        return contador;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public JLabel getNombre1() {
        return nombre1;
    }

    public JLabel getTelefono1() {
        return telefono1;
    }

    public JLabel getEmail1() {
        return email1;
    }
}
