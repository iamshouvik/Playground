import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		Main ob = new Main();
		int n = ob.factorial(num);
		System.out.println(n);
	}
	
	public int factorial(int n){
		if(n == 0){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}

}