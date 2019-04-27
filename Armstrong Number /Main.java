import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev,sum=0,m=n;
      do{
      	rev=n%10;
        sum+=(rev*rev*rev);
        n=n/10;
      }
      while(n > 0);
      if(sum == m)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}