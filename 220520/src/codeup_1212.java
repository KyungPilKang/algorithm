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
				System.out.println("�ﰢ���� ���� ���� �м��� �����մϴ�");
				System.out.println("ù��° ���� ���̴� ���Դϱ�?");
				a=Integer.parseInt(in.nextLine());
				System.out.println("�ι�° ���� ���̴� ���Դϱ�?");
				b=Integer.parseInt(in.nextLine());
				System.out.println("����° ���� ���̴� ���Դϱ�?");
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
				System.out.println("�м� ��� : "+result); break;
			}
			catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
		long end = System.currentTimeMillis();
		System.out.println( "���� �ð� : " + ( end - start )/1000.00 +"��");
	}
}
