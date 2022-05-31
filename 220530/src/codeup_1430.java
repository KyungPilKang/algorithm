import java.util.Scanner;

public class codeup_1430 {
	public static void main(String[] args) {
		System.out.println("입력 예시");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] standard=new int[n];
		for(int i=0;i<standard.length;i++) {
			standard[i]=Integer.parseInt(sc.next());
		}
		int m = Integer.parseInt(sc.next());
		int[] question=new int[m];
		for(int i=0;i<question.length;i++) {
			question[i]=Integer.parseInt(sc.next());
		}
		int[] answer=new int[m];
		for(int i=0;i<question.length;i++) {
			for(int j=0;j<standard.length;j++) {
				if(question[i]==standard[j]) {
					answer[i]=1;
					break;
				} else {
					answer[i]=0;
				}
			}
		}
		System.out.println("출력 예시");
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
}
