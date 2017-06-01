package clase9;

public class Arreglos2 {

    public static void main(String[] args) {
        //declarar lista
        int [] lista;
        lista = new int [5];
        //dar valores a las posciones de la lista
        lista[0] = 2;
        lista[1] = 3;
        lista[2] = 21;
        lista[3] = 7;
        lista[4] = 82;
        //imprimir lista
        System.out.println("Lista "+lista[3]);
        for (int i = 0; i <= 4; i++) {
              System.out.println("Lista "+lista[i]);
        }
    }
    
}
