package clase9;

import java.util.Scanner;

public class Arreglso7 {

    public static void main(String[] args) {
        //para pedir los valores por teclado
        Scanner s = new Scanner(System.in);
        int factorial=0;
        System.out.println("Ingrese el limite del arreglo");
        //inicializar y declarar las variables
        int limite = s.nextInt();
        int [] lista;
        lista = new int [limite];
        //par ingresar os valores en cada posicion del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = s.nextInt();
        }
        //imprimir las celdas impares
        for (int i = 0; i < lista.length; i=i+2) {
//            lista[i]=lista[i+2];
            System.out.println(""+lista[i]);
            
        }
    }
    
}
