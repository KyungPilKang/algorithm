import java.util.Scanner;

public class backjun_7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fc=Integer.parseInt(sc.next());
		int vc=Integer.parseInt(sc.next());
		int price=Integer.parseInt(sc.next());
		sc.close();
		if(vc>price) {
			System.out.println(-1);
		} else {
			int x=1;
			while(true) { //���ͺб����̶�? ������� = (���� - �������)
				if(fc<((price-vc)*x)) {
					System.out.println(x);
					break;
				}
				x++;
			}
		}
	}
}
