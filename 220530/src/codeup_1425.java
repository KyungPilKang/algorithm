import java.util.Arrays;
import java.util.Scanner;

public class codeup_1425 {

	public static void main(String[] args) {
		System.out.println("입력 예시");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(sc.next());
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			if(c==1) {
				System.out.println();
			} else {
				if(i==c-1) {
					System.out.println();
				}
			}
		}
	}

}
