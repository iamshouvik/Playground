import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		Main ob = new Main();
		int s = ob.sum(num);
		System.out.println(s);
	}
	
	public int sum(int n){
		if(n==1){
			return 1;
		}
		else{
			return n+sum(n-1);
		}
	}

}
