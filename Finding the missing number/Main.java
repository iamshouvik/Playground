import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int b[] = new int[n];
		int c = 0;
		for(int i=0;i<b.length;i++){
			b[i] = c;
			c++;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<b.length;j++){
				if(arr[i] == b[j]){
					b[j]=0;
				}
			}
		}
		
		for(int i=0;i<b.length;i++){
			if(b[i] != 0){
				System.out.println(b[i]);
			}
		}
    }
}