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
public class Iniciales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        System.out.println("Cuál es tu nombre completo?");
        nombre = sc.nextLine();
        SepararIniciales(nombre);
        System.out.println("\n"+"Y su nombre completo es: "+"\n"+nombre);
    }
    public static void SepararIniciales(String name){
        String[] Iniciales =  name.split(" ");
        System.out.println("Las iniciales de su nombre son: ");
        for (int x = 0; x < Iniciales.length; x++) {
            System.out.print(Iniciales[x].charAt(0)+" ");
        }
        
    }
    
} 
