import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int c = 0;
		for(int i=arr.length-1;i>=0;i--){
			b[c] = arr[i];
			c++;
		}
		int counter = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != b[i]){
				counter++;
				break;
			}
		}
		if(counter == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
    }
}