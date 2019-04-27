import java.util.*;
public class Main{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  Main ob = new Main();
  int b = sc.nextInt();
  int e = sc.nextInt();
  System.out.println(ob.show(b,e));
 }
 public int show(int x, int y){
   int s=1;
  for(int i=1;i<=y;i++){
   s*=x;
  }
   return s;
 }
}