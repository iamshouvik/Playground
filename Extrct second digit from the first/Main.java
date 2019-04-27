import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      int dig=0;
      int count=0;
      	while(n>=10){
          
          dig=n%10;
          n=n/10;
        }
      System.out.println(dig);
	}
}