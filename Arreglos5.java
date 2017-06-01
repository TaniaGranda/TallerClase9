package clase9;

import java.util.Scanner;

public class Arreglos5 {

    public static void main(String[] args) {
        //para pedir los datos por teclado
        Scanner s = new Scanner(System.in);
 
        System.out.println("Ingrese el limite del arreglo");
        //declarar e inicializar 
        int limite = s.nextInt();
        int [] lista;
        lista = new int [limite];
        //ingresar los valores en cada posicion del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = s.nextInt();
       }
       //realizar las operaziones para verificar si es par o impar 
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0){
                System.out.println("Numero par");
            }else{
                System.out.println("Numero impar");
            }
        }
    }
    
}
