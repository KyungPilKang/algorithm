import java.util.Scanner;

public class codeup_1369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print(" * ");
				}else if(k == 1) {
					System.out.print(" * ");
				}
				//ÇàÀÌ +1µÉ ¼ö·Ï ºø±Ý(*)Àº ÁÂÃøÀ¸·Î 1Ä­¾¿ ÀÌµ¿
				 else if((i+j) % k == 1) {
					System.out.print(" * ");
				}else System.out.print("   ");
			}
			System.out.println();
		}
	}

}
