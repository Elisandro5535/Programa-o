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
public class exercício1 {
    public static void main(String[] args) {
        Integer numeros[] = {2, 8, 6, 4, 9};
        Integer soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }
        System.out.println(soma);
        
    }
}
