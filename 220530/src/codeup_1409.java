import java.util.Scanner;

public class codeup_1409 {
	public static void main(String[] args) {
		System.out.println("입력 예시");
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(sc.next());
		}
		int n = Integer.parseInt(sc.next());
		System.out.println("출력 예시");
		System.out.println(arr[n-1]);
	}
}
