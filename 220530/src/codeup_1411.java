import java.util.Arrays;
import java.util.Scanner;

public class codeup_1411 {

	public static void main(String[] args) {
		System.out.println("�Է� ����");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] arr=new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i]=Integer.parseInt(sc.next());
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		System.out.println("��� ����");
		int sum_arr=0;
		int sum_standard=0;
		for(int num:arr) {
			sum_arr=sum_arr+num;
		}
		for(int i=1;i<=n;i++) {
			sum_standard=sum_standard+i;
		}
		System.out.println(sum_standard-sum_arr);
	}

}
