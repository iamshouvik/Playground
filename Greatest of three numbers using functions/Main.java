import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        int n1= sc.nextInt();
      int n2 = sc.nextInt();
      int n3= sc.nextInt();
      ob.max(n1,n2,n3);
	}
  public void max(int a, int b, int c){
   if(a>b && a>c){
    System.out.println(a);
   }
    else if(b>a && b>c){
     System.out.println(b);
    }
    else{
     System.out.println(c);
    }
  }
}