import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    String str;
    
    System.out.print("Enter a word: ");
    str = sc1.nextLine();
    System.out.println(str.length());
  }
}
