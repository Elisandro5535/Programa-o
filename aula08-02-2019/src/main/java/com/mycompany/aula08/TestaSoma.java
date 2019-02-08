/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula08;

/**
 *
 * @author aluno
 */
class Soma {
    public int umavariavelNormal;
    public static int umavariavelStatic;
    
    public int resultadoNormal(int num1, int num2) {
        return(num1 + num2);
    }
    
    public static int resultadoStatic(int num1, int num2)  {
        return (num1 + num2);
    }
}

public class TestaSoma {
    public static void main(String[] args) {
        
        System.out.println(new Soma().resultadoNormal(10, 50));
        System.out.println(Soma.resultadoStatic(10, 50));
    }
}
