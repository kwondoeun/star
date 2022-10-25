package fwer;


import java.util.Scanner;

public class Semin {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      scan.close();
      String s = scan.nextLine();
      
      int a = Integer.parseInt(s.split(" ")[0]);
      int b = Integer.parseInt(s.split(" ")[1]);
      int c = Integer.parseInt(s.split(" ")[2]);
      int d = Integer.parseInt(s.split(" ")[3]);
      int e = Integer.parseInt(s.split(" ")[4]);
      int f = Integer.parseInt(s.split(" ")[5]);
      int x = Integer.parseInt(s.split(" ")[6]);
      
      int q = x / (a + c);
      
      int w = x % (a + c);
      
      int t = x / (d + f);
      int r = x % (d + f);
      
      int taka = b * q;
      int aoki = e * t;
      
      if(w > a) {
         taka += b * a;
      } else {
         taka += b * w;
      }
      
      if(w > a) {
         aoki += e * d;
      } else {
         aoki += e * r;
      }
      
      if(taka > aoki) {
         System.out.println("Takahashi");
      } else if(taka < aoki) {
         System.out.println("Aoki");
      } else {
         System.out.println("Draw");
      }
      
      
      
   }

}