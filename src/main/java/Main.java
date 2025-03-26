import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj 1 liczbe:");
    int a = scanner.nextInt();
    System.out.println("Podaj 2 liczbe:");
    int b = scanner.nextInt();
    System.out.println("Podaj 2 liczbe:");
    int c = scanner.nextInt();

    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));

    System.out.println("Największa liczba: " + max);
    System.out.println("Najmniejsza liczba: " + min);
  
  
  
  
  
  
  
  }
}