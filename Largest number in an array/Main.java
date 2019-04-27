import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      	int max=0;
      	int n=sc.nextInt();
      	int arr[] = new int[n];
      	for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
      	for(int i=0;i<n;i++){
        	if(max<=arr[i]){
            	max = arr[i];
            }
        }
      	System.out.println(max);
    }
}