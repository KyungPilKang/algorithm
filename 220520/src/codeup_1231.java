import java.util.Scanner;

public class codeup_1231 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String cal;
		while(true) {
			try {
				System.out.println("계산할 수를 입력하세요(단, 단순 사칙연산만 가능합니다)");
				cal=in.next();
				if(!cal.contains("+")&&!cal.contains("-")&&!cal.contains("*")&&!cal.contains("/")) {
					throw new Exception("오류 : 연산부호를 입력하세요");
				}
				if(cal.contains("+")) {
					String[] temp=cal.split("\\+");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("계산결과 : "+(a+b)); break;
				}
				if(cal.contains("-")) {
					String[] temp=cal.split("-");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("계산결과 : "+(a-b)); break;
				}
				if(cal.contains("*")) {
					String[] temp=cal.split("\\*");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					System.out.println("계산결과 : "+(a*b)); break;
				}
				if(cal.contains("/")) {
					String[] temp=cal.split("/");
					int a=Integer.parseInt(temp[0]);
					int b=Integer.parseInt(temp[1]);
					double result = (double)a/b;
				    String formattedResult = String.format("%.2f", result);
					System.out.println("계산결과 : "+formattedResult); break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
