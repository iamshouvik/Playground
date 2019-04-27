import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      Main ob = new Main();
      int n = sc.nextInt();
      int sum = ob.calSum(n);
      System.out.println(sum);
	}
  
  	public int calSum(int num){
      	int s=0;
    	for(int i=1;i<=num;i++){
        	s += i;
        }
      	return s;
    }
}