package clase9;

import java.util.Scanner;

public class Arreglos8 {

    public static void main(String[] args) {
        //para pedir los valores por teclado
        Scanner s = new Scanner(System.in);
        //declarar e inicializar las variables
        int factorial=0;
        int j=0, a=0, b=0;
       
        System.out.println("Ingrese el limite del arreglo");
        int limite = s.nextInt();
        int [] lista;
        int [] lista_A;
        int [] lista_B;
        lista = new int [limite];
        lista_A = new int [limite];
        lista_B = new int [limite];
        //para ingresar los valores en cada posicion del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = s.nextInt();
        }
        //operar e imprimir en la lista a las celdas impares mas la suma de sus numeros
        System.out.println("LISTA A");
        for (int i = 0; i < lista.length; i=i+2) {
            System.out.println(""+lista[i]);
            a=a+lista[i];
            lista_A[j]=lista[i];
            lista_A[j]=a;
            
//            System.out.println(""+lista_A[i]);
            
        }
        System.out.println(""+lista_A[j]);
        System.out.println("suma"+a);
        //operar e imprimir en la lista a las celdas pares mas la suma de sus numeros
        System.out.println("LISTA B");
        for (int i = 1; i < lista.length; i=i+2) {
            System.out.println(""+lista[i]);
            b=lista[i]+b;
            lista_B[j]=lista[i];
            lista_B[j]=b;
//            System.out.println(""+lista_A[i]);
            
        }
        System.out.println(""+lista_B[j]);
        System.out.println(""+b);
    }
}    
