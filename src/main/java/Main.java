import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    

    Random random = new Random();

    
    
    int rand1 = random.nextInt(50);
    int rand2 = random.nextInt(50);
    int rand3 = random.nextInt(50);
    int rand4 = random.nextInt(50);
    int rand5 = random.nextInt(50);
   
    

    int suma = (rand1*rand1) + (rand2*rand2) + (rand3*rand3)+(rand4*rand4)+(rand5*rand5);
    
 
    System.out.println("Wylosowane liczby to: " + rand1 + ", " + rand2 + ", " + rand3 + ", " + rand4 + ", " + rand5);
    System.out.println("Wynik sumy kwadratów to: " + suma);
  
  
  ///dsdasd
  
  
  
  }
}