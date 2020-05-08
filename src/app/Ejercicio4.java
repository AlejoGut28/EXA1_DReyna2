package app;

public class Ejercicio4 extends Thread{
    
    String nombre;
    public Ejercicio4 (int prioridad,String nombre){
    this.nombre=nombre;
    setPriority(prioridad);


   }


 public void run(){
    for(int c=1;c<=10;c++){
    System.out.print(c+"mtrs");
    yield(); 
    }
    System.out.println("\n Llego a la meta " + nombre);
   }
    static Ejercicio4 per1;
    static Ejercicio4 per2;
    static Ejercicio4 per3;
    static Ejercicio4 per4;
    public static void main(String []args) throws InterruptedException {
    per1 = new Ejercicio4(1," Leopardo 1 ");
    per2 = new Ejercicio4(5," Leopardo 2 ");
    per3 = new Ejercicio4(8," Leopardo 3");
    per4 = new Ejercicio4(4," Leopardo 4 ");

    per2.start();
    per1.start();
    per3.start();
    per2.join();
    per1.join();
    per3.join();
    per4.join();
    per1.join();
 
    }
}