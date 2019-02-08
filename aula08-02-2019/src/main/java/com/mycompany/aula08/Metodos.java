/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula08;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Metodos {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        m.imprimirAlgo();

        System.out.println(Metodos.somar(10, 10));
        JOptionPane.showMessageDialog(null, Metodos.somar(1.0, 2D));
        JOptionPane.showMessageDialog(null, Metodos.somar(1, 2));

        String pares = Arrays.toString(m.getPares(3D, 5D, 6D, 7.8, 8.2));
        JOptionPane.showMessageDialog(null, Metodos.somar(0, 0));

        JOptionPane.showMessageDialog(null, Metodos.contarLetraA("A POO é um paradigma de programação"));

    }

    public void imprimirAlgo() {
        System.out.println("Olá Mundo!");
    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double somar(int n1, int n2) {
        return somar((double) n1, (double) n2);
    }

    public static double[]

    Metodos(double... numeros) {
        double pares[] = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            }
        }
        return pares;
    }

    public static int contarLetraA(String texto) {
        int contador = 0;

        texto = texto.toUpperCase();
        for (int i = 0; i < texto.length(); i++) {

        }
        return 0;
    }

    private long[] getPares(double d, double d0, double d1, double d2, double d3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
