import java.util.Scanner;

public class codeup_1495 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d[][]=new int[1001][1001];
		int i, j, n, m, k, sum=0;
		int x1, x2, y1, y2, u;
		
		n=Integer.parseInt(sc.next());
		m=Integer.parseInt(sc.next());
		k=Integer.parseInt(sc.next());
		
		for(i=1;i<=k;i++) { //데이터에 의해 생성된 배열
			x1=Integer.parseInt(sc.next());
			y1=Integer.parseInt(sc.next());
			x2=Integer.parseInt(sc.next());
			y2=Integer.parseInt(sc.next());
			u=Integer.parseInt(sc.next());
			d[x1][y1]=d[x1][y1]+u;
			d[x2+1][y2+1]=d[x2+1][y2+1]+u;
			d[x1][y2+1]=d[x1][y2+1]-u;
			d[x2+1][y1]=d[x2+1][y1]-u;
		}
		
		sc.close();
		
		for(i=0;i<n;i++) { //위에서 생성된 배열 출력
			for(j=0;j<m;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//생성된 배열을 기준으로 누적합 배열을 생성
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				sum+=d[i][j];
				d[i][j]=sum;
			}
			sum=0;
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				sum+=d[j][i];
				d[j][i]=sum;
			}
			sum=0;
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
