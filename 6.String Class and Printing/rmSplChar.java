import java.util.Scanner;

public class rmSplChar {
   public static void main(String[] args) {
      String str;
      Scanner sc= new Scanner(System.in);

      str= sc.nextLine();
      
      System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
   }
}
