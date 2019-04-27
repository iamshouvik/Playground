import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int arr[] = new int[n];
      	int pos1=0,pos2=0;
      	for(int i=0;i<n;i++){
      		arr[i] = sc.nextInt();
        }
      	int s1 = sc.nextInt();
      	int s2 = sc.nextInt();
      	for(int i=0;i<n;i++){
        	if(s1==arr[i]){
            	pos1 = i;
            }
          	if(s2==arr[i]){
            	pos2 = i;
          }
        }
      if(pos1!=0 && pos2!=0){
      	System.out.println(pos1);
      	System.out.println(pos2);
      }
      else if(pos1==0){
      	System.out.println(-1);
        System.out.println(pos2);
      }
      else if(pos2==0){
        System.out.println(pos1);
      	System.out.println(-1);
      }
    }
}