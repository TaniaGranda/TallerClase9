package clase9;

public class Arreglos3 {

    public static void main(String[] args) {
        //declarar lista
        int [] lista;
        lista = new int [6];
        //sar valores a la lista
        lista[0] = 2;
        lista[1] = 3;
        lista[2] = 21;
        lista[3] = 7;
        lista[4] = 82;
        lista[5] = 90;
        //imprimir la lista con un for
        for (int i = 0; i < lista.length; i++) {   //lenght para que lea automaticamente de cuanto es el arreglo
              System.out.println("Lista "+lista[i]);
        }
    }
    
}
