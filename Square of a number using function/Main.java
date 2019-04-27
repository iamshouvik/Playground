import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      Main ob = new Main();
      int n = sc.nextInt();
      int x = ob.calSquare(n);
      System.out.println(x);
	} 
  	
  	public int calSquare(int num){
    	return num*num;
    }
}