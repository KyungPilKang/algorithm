import java.util.Scanner;

public class backjun_2_7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a;
		int b;
		int c;
		while(true) {
			int earn;
			try {
				System.out.println("첫번째 주사위를 입력하세요");
				a=Integer.parseInt(in.nextLine());
				if(a<1||a>6) {
					throw new Exception("오류 : 1~6사이의 숫자를 입력하세요");
				}
				System.out.println("두번째 주사위를 입력하세요");
				b=Integer.parseInt(in.nextLine());
				if(b<1||b>6) {
					throw new Exception("오류 : 1~6사이의 숫자를 입력하세요");
				}
				System.out.println("세번째 주사위를 입력하세요");
				c=Integer.parseInt(in.nextLine());
				if(c<1||c>6) {
					throw new Exception("오류 : 1~6사이의 숫자를 입력하세요");
				}
				if(a==b&&b==c) {
					earn=10000+(a*1000);
					System.out.println("상금은 "+earn+"원 입니다"); break;
				}
				if(a==b||a==c||b==c) {
					earn=1000+(a*100);
					System.out.println("상금은 "+earn+"원 입니다"); break;
				}
				if(a!=b&&b!=c) {
					if(a>b&&a>c) {
						earn=a*100;
						System.out.println("상금은 "+earn+"원 입니다"); break;
					}
					if(b>c&&b>a) {
						earn=b*100;
						System.out.println("상금은 "+earn+"원 입니다"); break;
					}
					if(c>a&&c>b) {
						earn=c*100;
						System.out.println("상금은 "+earn+"원 입니다"); break;
					}
				}
			}
			catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
