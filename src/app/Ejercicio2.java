package app;

public class Ejercicio2  extends Thread {
   
    int suma = 0;
    int[] NumArray = { 2, 7, 5, 4, 9, 3, 6, 8, 1, 10 };

    public Ejercicio2() {
        System.out.println("**** TODAS LAS SUMAS ******");
    }

    @Override
    public void run() {
        for (int i : NumArray) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            this.suma = this.suma + (int) Math.pow(i, 3);
            System.out.println("Suma de los numeros en su cuadrado" + this.suma);
        }
        System.out.println("Suma total de los cuadrados de los numeros: " + this.suma);
    }

    public static void main(String[] args) throws Exception {
        Thread sum = new Ejercicio2();
        sum.start();
    }
}