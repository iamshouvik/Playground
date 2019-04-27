import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      Main ob = new Main();
      int n = sc.nextInt();
      ob.prime(n);
}
  public void prime(int x){
   
    for(int i=2;i<x;i++)
{
int p=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
p=1;
}
if(p==0){
System.out.println(i);
}
    }}
  
}