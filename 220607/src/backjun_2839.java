import java.util.Scanner;

public class backjun_2839 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		
		sc.close();
		
		int x=n/5;
		int y=0;	
		while(true) {
			int n2=n-(x*5);
			if(n2%3==0) {
				y=n2/3;
				break;
			}
			if(x==0&&y==0) {
				break;
			}
			if(x!=0) {
				x--;
			}
		}
		if((x+y)!=0) {
			System.out.println(x+y);
		} else {
			System.out.println(-1);
		}
	}
}
