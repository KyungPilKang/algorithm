import java.util.Scanner;

public class codeup_1409 {
	public static void main(String[] args) {
		System.out.println("�Է� ����");
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(sc.next());
		}
		int n = Integer.parseInt(sc.next());
		System.out.println("��� ����");
		System.out.println(arr[n-1]);
	}
}
