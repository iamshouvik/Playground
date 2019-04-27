import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int counter=1;
  		for(int r=1;r<=n;r++){
        	for(int c=1;c<=r;c++){
            	if(counter%2==0){
                	System.out.print("#");
                  	counter++;
                }
              	else{
                	System.out.print("*");
                  	counter++;
                }
            }
          	System.out.println();
        }
    }
}