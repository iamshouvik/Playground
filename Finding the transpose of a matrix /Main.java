import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int matrix1 [][] = new int[r][c];
		int matrix2 [][] = new int[c][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix2[j][i] = matrix1[i][j];
			}
		}
		for(int i=0;i<c;i++){
			for(int j=0;j<r;j++){
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
