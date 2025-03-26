import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {


    int suma = 0;
  for(int i = 0; i < 100 ; i++){
    if(i % 2 != 0){
      suma = suma + i;
    }
    System.out.println(suma);
  }
    System.out.println("Suma liczb nieparzystych wynosi: " + suma);
  
  
  
  }
}