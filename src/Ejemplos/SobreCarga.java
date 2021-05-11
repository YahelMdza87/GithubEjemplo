/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

public class SobreCarga {
    int num1;
    int num2;
    public SobreCarga(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public int numerosOperaciones(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
    public void numerosOperaciones(){
        System.out.println("La suma de los numeros es "+numerosOperaciones(num1,num2));
    }
}
