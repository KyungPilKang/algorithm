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
				System.out.println("ù��° �ֻ����� �Է��ϼ���");
				a=Integer.parseInt(in.nextLine());
				if(a<1||a>6) {
					throw new Exception("���� : 1~6������ ���ڸ� �Է��ϼ���");
				}
				System.out.println("�ι�° �ֻ����� �Է��ϼ���");
				b=Integer.parseInt(in.nextLine());
				if(b<1||b>6) {
					throw new Exception("���� : 1~6������ ���ڸ� �Է��ϼ���");
				}
				System.out.println("����° �ֻ����� �Է��ϼ���");
				c=Integer.parseInt(in.nextLine());
				if(c<1||c>6) {
					throw new Exception("���� : 1~6������ ���ڸ� �Է��ϼ���");
				}
				if(a==b&&b==c) {
					earn=10000+(a*1000);
					System.out.println("����� "+earn+"�� �Դϴ�"); break;
				}
				if(a==b||a==c||b==c) {
					earn=1000+(a*100);
					System.out.println("����� "+earn+"�� �Դϴ�"); break;
				}
				if(a!=b&&b!=c) {
					if(a>b&&a>c) {
						earn=a*100;
						System.out.println("����� "+earn+"�� �Դϴ�"); break;
					}
					if(b>c&&b>a) {
						earn=b*100;
						System.out.println("����� "+earn+"�� �Դϴ�"); break;
					}
					if(c>a&&c>b) {
						earn=c*100;
						System.out.println("����� "+earn+"�� �Դϴ�"); break;
					}
				}
			}
			catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
