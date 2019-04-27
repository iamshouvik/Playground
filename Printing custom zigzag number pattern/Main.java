import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a=0;
      for(int r=1;r<=n;r++){
      	if(r%2 == 0){
          	System.out.print(++a);
          	--a;
          	for(int c=1;c<n;c++){
            	System.out.print(a);
            }
          	
        }
        else{
          	++a;
          	for(int c=1;c<n;c++){
            	System.out.print(a);
            }
        	System.out.print(++a);
        }
        System.out.println();
      }
	}
}