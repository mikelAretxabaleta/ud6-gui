package com.mikel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VerAlumnos {
    private JTextArea textArea1;
    private JPanel panel;
    private JFrame frame;
    private int total = 1;


    public VerAlumnos() {

        frame = new JFrame("Gestion de alumnos");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(false);
        frame.setLocation(800, 300);
        textArea1.append("ALUMNOS\n-------\n");
        textArea1.setAutoscrolls(true);

    }

    public void setVisible() {
        frame.setVisible(true);
    }

    public void setInvisible() {
        frame.setVisible(false);
    }

    public void verLista(ListaAlumnos l) {

        textArea1.append(total + "    Nombre: " + l.obtenerListaAlumnos().get(0).getNombre() +
                ", Apellidos: " + l.obtenerListaAlumnos().get(0).getApellidos() +
                ", Teléfono: " + l.obtenerListaAlumnos().get(0).getTelefono() +
                ", email: " + l.obtenerListaAlumnos().get(0).getEmail() + "\n");
        total++;
    }


}
