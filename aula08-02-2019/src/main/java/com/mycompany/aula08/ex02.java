/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula08;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ex02 {

    public static void main(String[] args) {
        String auxiliar = null;
        int quantidade;
        Double[] notas;
        
        auxiliar = JOptionPane.showInputDialog(" " + "Informe a quantidade de notas: ");
        quantidade = Integer.parseInt(auxiliar);
        notas = new Double[quantidade];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota " + i));
        }
        
        //quantidade de notas
        System.out.println(notas.length);
        //Somar as notas (Java 8)
        System.out.println(calcularMediaNotas(notas));
        
        //não ordenadas
        System.out.println(java.util);
    }
    
    public static Double somarNotas(Double notas[]) {
        return java.util.Arrays.stream(notas).mapToDouble(Double::doubleValue).sum();
    }
    
    public static Double calcularMediaNotas(Double[] notas) {
        return java.util.Arrays.stream(notas).mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
    }
    
}
