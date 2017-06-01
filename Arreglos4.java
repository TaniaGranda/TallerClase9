package clase9;

import java.util.Scanner;

public class Arreglos4 {

    public static void main(String[] args) {
        //para pedir datos por teclado
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese el limite del arreglo");
        //declarar e inicializar
        int limite = s.nextInt();
        int [] lista;
        lista = new int [limite];
        //pedir los datos para cada pisicion del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = s.nextInt();
        }
        
        System.out.println("CRECIENTE: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(""+lista[i]);
        }
        
        System.out.println("DECRECIENTE: ");
        for (int i = lista.length-1; i >= 0; i--) {
            System.out.println(""+lista[i]);
        }
    }
    
}
