import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skaner = new Scanner(System.in);
    while(true){
    System.out.println("********** | SUMA A+B | **************");
    System.out.println("podaj liczbę a:");
    int a,b,wynik;
    a = skaner.nextInt();
    System.out.println("podaj liczbę b:");   
    b = skaner.nextInt();
    wynik = (a + b);
    System.out.println("Twój wynik to :" + wynik);
    }
  }
}