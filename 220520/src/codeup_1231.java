import java.util.Scanner;

public class codeup_1231 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String cal;
		while(true) {
			try {
				System.out.println("����� ���� �Է��ϼ���(��, �ܼ� ��Ģ���길 �����մϴ�)");
				cal=in.next();
				if(!cal.contains("+")&&!cal.contains("-")&&!cal.contains("*")&&!cal.contains("/")) {
					throw new Exception("���� : �����ȣ�� �Է��ϼ���");
				}
				if(cal.contains("+")) {
					String[] temp=cal.split("\\+");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("����� : "+(a+b)); break;
				}
				if(cal.contains("-")) {
					String[] temp=cal.split("-");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("����� : "+(a-b)); break;
				}
				if(cal.contains("*")) {
					String[] temp=cal.split("\\*");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("����� : "+(a*b)); break;
				}
				if(cal.contains("/")) {
					String[] temp=cal.split("/");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					double result = (double)a/b;
				    String formattedResult = String.format("%.2f", result);
					System.out.println("����� : "+formattedResult); break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
