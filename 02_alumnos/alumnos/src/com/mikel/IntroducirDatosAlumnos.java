package com.mikel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IntroducirDatosAlumnos {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel panel3;
    private JButton verListaButton;
    private JButton guardarButton;

    private VerAlumnos verAlumnos = new VerAlumnos();
    private ListaAlumnos listaAlumnos;
    private boolean visible=false;


    public IntroducirDatosAlumnos() {
        guardarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String nombre = textField1.getText();
                String apellidos = textField2.getText();
                String telefono = textField3.getText();
                String email = textField4.getText();


                Alumno a = new Alumno(nombre, apellidos, telefono, email);
                listaAlumnos = new ListaAlumnos();
                listaAlumnos.añadirAlumno(a);
                verAlumnos.verLista(listaAlumnos);
                JOptionPane.showMessageDialog(guardarButton,"OK");


            }
        });

        verListaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (visible==true) {verAlumnos.setInvisible(); visible=false;}
                else if (visible==false) {verAlumnos.setVisible(); visible=true;}

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestion de alumnos");
        frame.setContentPane(new IntroducirDatosAlumnos().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(300, 300);


    }


}



