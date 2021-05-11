/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Yahel M
 */
public class SobreCargaPrincipal {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //Aqui vemos que usamos el constructor numero 1 (donde solo mandamos dos numeros)
         SobreCarga Sobrecarga = new SobreCarga(7,5);
         //Aqui vemos que usamos el constructor numero 2 (donde solo mandamos cuatro numeros)
         SobreCarga sobrecarga = new SobreCarga(7,5,3,2);
         //Metodo donde se muestra la suma de los numeros que mandamos en la linea de arriba
         Sobrecarga.numerosOperaciones();
         //Metodo donde puedes hacer una suma con los numeros que quieras
         System.out.println(Sobrecarga.numerosOperaciones(5, 10));
    }
     
}
