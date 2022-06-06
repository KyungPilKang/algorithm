import java.util.Scanner;

public class backjun_7_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.next());
		int b=Integer.parseInt(sc.next());
		int v=Integer.parseInt(sc.next());
		int d=0;
		int v_mor=0;
		int v_nig=0;
		while(true) {
			d++;
			v_mor=v_nig+a;
			if(v_mor>=v) {
				System.out.println(d);
				break;
			}
			v_nig=v_mor-b;
			if(v_nig>=v) {
				System.out.println(d);
				break;
			}
		}
		
	}
}
