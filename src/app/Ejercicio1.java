package app;

public class Ejercicio1 {
    public static void Cont() {
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int cont = numeros.length;
        System.out.println("Cuento hacia arriba: [");
        for (int i = 0; i < cont; i++) {
            System.out.println(numeros[i] + ",");
        }
        System.out.println("]\n");
        System.out.println("Cuento hacia abajo: [");
        for (int j = cont - 1; j >= 0; j--) {
            System.out.println(numeros[j] + ",");
        }
        System.out.println("]");    
    }

    public static void main(String[] args) throws Exception {
        Thread.sleep(2000);
        Cont();
    }
}