import java.util.Scanner;
import java.util.Stack;

public class codeup_1094 {
	public static void main(String[] args) {
		System.out.println("입력 예시");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Stack<Integer> attend_no=new Stack<Integer>();
		attend_no.setSize(n);
		for(int i=0;i<n;i++) {
			int temp=(int)(Math.random()*23)+1;
			attend_no.push(temp);
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("출력 예시");
		for(int j=0;j<attend_no.size();j++) {
			System.out.print(attend_no.pop()+" ");
		}
	}
}
