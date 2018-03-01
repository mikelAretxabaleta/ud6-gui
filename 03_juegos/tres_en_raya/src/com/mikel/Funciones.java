package com.mikel;

import javax.swing.*;

public class Funciones {

    private static int turno=0;
    private static int movimientos=0;

    private static boolean click1=false;
    private static boolean click2=false;
    private static boolean click3=false;
    private static boolean click4=false;
    private static boolean click5=false;
    private static boolean click6=false;
    private static boolean click7=false;
    private static boolean click8=false;
    private static boolean click9=false;

    private static int[][] array={{5,5,5},{5,5,5},{5,5,5}};
    

    public static void terminarJuego(){
        System.exit(0);
    }

    public static boolean comprobarEmpate(){
        if (movimientos>8 && !hayGanador(array)){
            JOptionPane.showMessageDialog(Inicio.tresEnRaya.getPanel(),"Empate!!!!", "3 en raya", JOptionPane.PLAIN_MESSAGE);

            return true;
        }else {return false;}}

    public static void ganaO(){
        JOptionPane.showMessageDialog(Inicio.tresEnRaya.getPanel(),"Gana el O!!!!", "3 en raya", JOptionPane.PLAIN_MESSAGE);
        terminarJuego();
    }

    public static void ganaX(){
        JOptionPane.showMessageDialog(Inicio.tresEnRaya.getPanel(),"Gana la X!!!!", "3 en raya", JOptionPane.PLAIN_MESSAGE);
        terminarJuego();
    }

    public static boolean hayGanador(int[][] t) {

        // Primero un jugador y luego el otro
        for (int i = 0; i < 2; i++) {

            // Filas
            if (t[0][0] == i && t[0][1] == i && t[0][2] == i) {
                return true;
            }
            if (t[1][0] == i && t[1][1] == i && t[1][2] == i) {
                return true;
            }
            if (t[2][0] == i && t[2][1] == i && t[2][2] == i) {
                return true;
            }

            // Columnas
            for (int j = 0; j < 3; j++ ) {
                if (t[0][j] == i && t[1][j] == i && t[2][j] == i) {
                    return true;
                }
            }

            // Diagonales
            if (t[0][0] == i && t[1][1] == i && t[2][2] == i) {
                return true;
            }
            if (t[0][2] == i && t[1][1] == i && t[2][0] == i) {
                return true;
            }
        }

        // No hay ganador
        return false;
    }

    //3 en raya 1

    public static void click1() {
        if (turno==0 && click1==false){
            Inicio.tresEnRaya.getButton1().setText("O");

            array[0][0]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click1==false){
            Inicio.tresEnRaya.getButton1().setText("X");
            array[0][0]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click1=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click2() {
        if (turno==0 && click2==false){
            Inicio.tresEnRaya.getButton2().setText("O");

            array[0][1]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click2==false){
            Inicio.tresEnRaya.getButton2().setText("X");
            array[0][1]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click2=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click3() {
        if (turno==0 && click3==false){
            Inicio.tresEnRaya.getButton3().setText("O");

            array[0][2]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click3==false){
            Inicio.tresEnRaya.getButton3().setText("X");
            array[0][2]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click3=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click4() {
        if (turno==0 && click4==false){
            Inicio.tresEnRaya.getButton4().setText("O");

            array[1][0]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click4==false){
            Inicio.tresEnRaya.getButton4().setText("X");
            array[1][0]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click4=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click5() {
        if (turno==0 && click5==false){
            Inicio.tresEnRaya.getButton5().setText("O");

            array[1][1]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click5==false){
            Inicio.tresEnRaya.getButton5().setText("X");
            array[1][1]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click5=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click6() {
        if (turno==0 && click6==false){
            Inicio.tresEnRaya.getButton6().setText("O");

            array[1][2]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click6==false){
            Inicio.tresEnRaya.getButton6().setText("X");
            array[1][2]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click6=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click7() {
        if (turno==0 && click7==false){
            Inicio.tresEnRaya.getButton7().setText("O");

            array[2][0]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click7==false){
            Inicio.tresEnRaya.getButton7().setText("X");
            array[2][0]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click7=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click8() {
        if (turno==0 && click8==false){
            Inicio.tresEnRaya.getButton8().setText("O");

            array[2][1]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click8==false){
            Inicio.tresEnRaya.getButton8().setText("X");
            array[2][1]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click8=true;

        if (comprobarEmpate()) terminarJuego();
    }

    public static void click9() {
        if (turno==0 && click9==false){
            Inicio.tresEnRaya.getButton9().setText("O");

            array[2][2]=0;
            if (hayGanador(array)){ganaO();}
            turno++;
            movimientos++;
        }else if (turno==1 && click9==false){
            Inicio.tresEnRaya.getButton9().setText("X");
            array[2][2]=1;
            if (Funciones.hayGanador(array)){Funciones.ganaX();}
            turno--;
            movimientos++;
        }

        click9=true;

        if (comprobarEmpate()) terminarJuego();
    }


}
