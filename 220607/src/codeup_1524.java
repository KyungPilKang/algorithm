import java.util.Scanner;

public class codeup_1524 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [][] matrix=new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				matrix[i][j]=Integer.parseInt(sc.next());
			}
		}
		
		int n=Integer.parseInt(sc.next()); //1 > 0
		int m=Integer.parseInt(sc.next()); //2 > 1
		
		//����� �Է��� 1~9
		//2���� ��Ʈ������ �ε����� 0~8
		//���� -1 ������ �߰�
		n--; 
		m--;
		
		int count=0;
		
		if(matrix[n][m]==1) {
			System.out.println(-1);
		}else {
			if(n!=0&&n<8&&m==0) { //�𼭸� ���� �º�
				count+=matrix[n-1][m];
				count+=matrix[n+1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n==0&&m!=0&&m<8){ //�𼭸� ���� ����
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n+1][m];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n>0&&n!=8&&m==8) { //�𼭸� ���� �캯
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n-1][m];
				count+=matrix[n+1][m];
			}else if(n==8&&m!=8&&m>0) { //�𼭸� ���� �غ�
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n-1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
			}else if(n==0&&m==0) { //11�� �𼭸�
				count+=matrix[n+1][m];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n==0&&m==8){ //1�� �𼭸�
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n+1][m];
			}else if(n==8&&m==8) { //5�� �𼭸�
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n-1][m];
			}else if(n==8&&m==0){ //7�� �𼭸�
				count+=matrix[n-1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
			}else { //�׵θ� ���� ����
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n-1][m];
				count+=matrix[n+1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}
			System.out.println(count);
		}
	}
}
