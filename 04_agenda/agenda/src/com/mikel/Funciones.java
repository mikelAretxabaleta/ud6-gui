package com.mikel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Funciones {

    private static List<Persona> listaPersonas = new ArrayList<>();

    private static int i = -1;

    public static void guardar() {
        listaPersonas.add(new Persona(Inicio.agenda.getTextField1().getText(), Inicio.agenda.getTextField2().getText(), Inicio.agenda.getTextField3().getText()));
        JOptionPane.showMessageDialog(Inicio.agenda.getPanel1(), "Persona guardada....");
        i++;
        Inicio.agenda.getTextField1().setText("");
        Inicio.agenda.getTextField2().setText("");
        Inicio.agenda.getTextField3().setText("");
        Inicio.agenda.getTextField1().requestFocus();


    }

    public static void verAgenda() {

        if (listaPersonas.size() > 0) {
            Inicio.agenda.getNombre().setText(listaPersonas.get(i).getNombre());
            Inicio.agenda.getTelefono().setText(listaPersonas.get(i).getTelefono());
            Inicio.agenda.getEmail().setText(listaPersonas.get(i).getEmail());
            Inicio.agenda.getContador().setText(i+1 + " de " + listaPersonas.size());
        }
    }

    public static void adelante() {

        if (listaPersonas.size() > i + 1) {
            i++;
            Inicio.agenda.getNombre().setText(listaPersonas.get(i).getNombre());
            Inicio.agenda.getTelefono().setText(listaPersonas.get(i).getTelefono());
            Inicio.agenda.getEmail().setText(listaPersonas.get(i).getEmail());
            Inicio.agenda.getContador().setText(i+1 + " de " + listaPersonas.size());

        }


    }

    public static void atras() {
        if (i > 0) {
            i--;
            Inicio.agenda.getNombre().setText(listaPersonas.get(i).getNombre());
            Inicio.agenda.getTelefono().setText(listaPersonas.get(i).getTelefono());
            Inicio.agenda.getEmail().setText(listaPersonas.get(i).getEmail());
            Inicio.agenda.getContador().setText(i+1 + " de " + listaPersonas.size());

        }
    }

    public static void buscar() {

        String buscar=	Inicio.agenda.getTextField4().getText();
        if (Inicio.agenda.getComboBox1().getModel().getSelectedItem().equals(Inicio.agenda.getComboBox1().getModel().getElementAt(0))){
            for(int i=0;i<listaPersonas.size();i++){
                if (listaPersonas.get(i).getNombre().equalsIgnoreCase(buscar)){
                    Inicio.agenda.getNombre1().setText(listaPersonas.get(i).getNombre());
                    Inicio.agenda.getTelefono1().setText(listaPersonas.get(i).getTelefono());
                    Inicio.agenda.getEmail1().setText(listaPersonas.get(i).getEmail());

                    Inicio.agenda.getTextField4().setText("");
                    Inicio.agenda.getTextField4().requestFocus();
                }

            }
        }
        if (Inicio.agenda.getComboBox1().getModel().getSelectedItem().equals(Inicio.agenda.getComboBox1().getModel().getElementAt(1))){
            for(int i=0;i<listaPersonas.size();i++){
                if (listaPersonas.get(i).getTelefono().equalsIgnoreCase(buscar)){
                    Inicio.agenda.getNombre1().setText(listaPersonas.get(i).getNombre());
                    Inicio.agenda.getTelefono1().setText(listaPersonas.get(i).getTelefono());
                    Inicio.agenda.getEmail1().setText(listaPersonas.get(i).getEmail());

                    Inicio.agenda.getTextField4().setText("");
                    Inicio.agenda.getTextField4().requestFocus();
                }

            }
        }
        if (Inicio.agenda.getComboBox1().getModel().getSelectedItem().equals(Inicio.agenda.getComboBox1().getModel().getElementAt(2))){
            for(int i=0;i<listaPersonas.size();i++){
                if (listaPersonas.get(i).getEmail().equalsIgnoreCase(buscar)){
                    Inicio.agenda.getNombre1().setText(listaPersonas.get(i).getNombre());
                    Inicio.agenda.getTelefono1().setText(listaPersonas.get(i).getTelefono());
                    Inicio.agenda.getEmail1().setText(listaPersonas.get(i).getEmail());

                    Inicio.agenda.getTextField4().setText("");
                    Inicio.agenda.getTextField4().requestFocus();
                }

            }
        }
    }
}