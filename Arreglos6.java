package clase9;

import java.util.Scanner;

public class Arreglos6 {

    public static void main(String[] args) {
        //para pedir los datos por teclado
        Scanner s = new Scanner(System.in);
        //declarar e inicializar las variables
        int factorial=0;
        System.out.println("Ingrese el limite del arreglo");
        int limite = s.nextInt();
        int [] lista;
        lista = new int [limite];
        //para ingresar los datos en cada posicion del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = s.nextInt();
        }
        //operaciones necesarias para verificarsi es par o impar y sacar el facorial en caso de que sea impar
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0){
                System.out.println("Numero par");
            }else{
                System.out.println("Numero impar");
                if(lista[i]<=5){
                    System.out.println(lista[i]+"!");
                    while(lista[i]==0){
                        factorial=factorial*i;
                        i--;
                    }
//                    System.out.println("lista ["+i+"]="lista[i]+"su factorial es: "+factorial);
                }
                factorial=1;
            }
        }
        
    }
    
}
