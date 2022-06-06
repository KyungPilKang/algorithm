import java.util.Scanner;

public class backjun_7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fc=Integer.parseInt(sc.next());
		int vc=Integer.parseInt(sc.next());
		int price=Integer.parseInt(sc.next());
		sc.close();
		if(vc>=price) {
			System.out.println(-1);
		} else {
			System.out.println((fc/(price-vc)+1));
		}
	}
}
