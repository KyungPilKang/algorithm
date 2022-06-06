import java.util.Scanner;

public class codeup_1484 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //세로
		int b = sc.nextInt(); //가로
		int[][] c = new int[a][b];
		int i=0, j=-1, n=0 ,t=1;
		int a2=a, b2=b;

		while(true) { //사이클은 1.우 2.하 + 3.좌 4.상
			for (int l=0;l<b;l++) { //가로 한 줄
				n+=1;
				j+=t;
				c[i][j] = n;
			}
			a--; //가로 한줄 채웠기때문에 세로 1개 덜 채움 -1
			
			for (int l=0;l<a;l++) { //세로 한 줄
				n++;
				i+=t;
				c[i][j] = n;
			}
			b--; //세로 한줄 채웠기 때문에 가로 1개 덜 채움 -1
			
			t*=-1; //방향 전환
			
			if(a<=0||b<=0) { //더 이상 채울게 없는 가로 또는 세로 나오면 탈출
				break; 
			}
		}
			
		for (int l=0;l<a2;l++) {
			for (int k=0;k<b2;k++) {
				System.out.print(c[l][k] +" ");
			}
			System.out.println();
		}
	}
}
