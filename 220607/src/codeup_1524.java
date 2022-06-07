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
		
		//사용자 입력은 1~9
		//2차원 매트릭스의 인덱스는 0~8
		//따라서 -1 연산을 추가
		n--; 
		m--;
		
		int count=0;
		
		if(matrix[n][m]==1) {
			System.out.println(-1);
		}else {
			if(n!=0&&n<8&&m==0) { //모서리 제외 좌변
				count+=matrix[n-1][m];
				count+=matrix[n+1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n==0&&m!=0&&m<8){ //모서리 제외 윗변
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n+1][m];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n>0&&n!=8&&m==8) { //모서리 제외 우변
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n-1][m];
				count+=matrix[n+1][m];
			}else if(n==8&&m!=8&&m>0) { //모서리 제외 밑변
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n-1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
			}else if(n==0&&m==0) { //11시 모서리
				count+=matrix[n+1][m];
				count+=matrix[n][m+1];
				count+=matrix[n+1][m+1];
			}else if(n==0&&m==8){ //1시 모서리
				count+=matrix[n][m-1];
				count+=matrix[n+1][m-1];
				count+=matrix[n+1][m];
			}else if(n==8&&m==8) { //5시 모서리
				count+=matrix[n-1][m-1];
				count+=matrix[n][m-1];
				count+=matrix[n-1][m];
			}else if(n==8&&m==0){ //7시 모서리
				count+=matrix[n-1][m];
				count+=matrix[n-1][m+1];
				count+=matrix[n][m+1];
			}else { //테두리 제외 내부
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
