import java.util.Scanner;

public class codeup_1212 {
	public static void main(String[] args) {
		long start=0;
		Scanner in=new Scanner(System.in);
		int a;
		int b;
		int c;
		String result="no";
		while(true) {
			try {
				System.out.println("삼각형의 성립 여부 분석을 시작합니다");
				System.out.println("첫번째 변의 길이는 몇입니까?");
				a=Integer.parseInt(in.nextLine());
				System.out.println("두번째 변의 길이는 몇입니까?");
				b=Integer.parseInt(in.nextLine());
				System.out.println("세번째 변의 길이는 몇입니까?");
				c=Integer.parseInt(in.nextLine());
				if(a>b&&a>c) {
					if(a<(b+c)) {
						result="yes";
					}
				}
				if(b>a&&b>c) {
					if(b<(a+c)) {
						result="yes";
					}
				}
				if(c>b&&c>a) {
					if(c<(a+b)) {
						result="yes";
					}
				}
				System.out.println("분석 결과 : "+result); break;
			}
			catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.00 +"초");
	}
}
