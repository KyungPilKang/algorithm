import java.util.Scanner;

public class codeup_1508 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int [][] matrix=new int[n][n];
		
		for(int i=0;i<n;i++) {
			matrix[i][0]=Integer.parseInt(sc.next());
			for(int j=0;j<i;j++) {
				matrix[i][j+1]=matrix[i][j]-matrix[i-1][j];
			}
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					System.out.print(" ");
				}else {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
