import java.util.Scanner;

public class backjun_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n=Integer.parseInt(sc.next());
		int count=1; // 같은 범위(최초 범위=1)
		int range=2; // 다음 범위 최소값
 
		sc.close();
		
		if (n==1) {
			System.out.print(1);
		} else {
			while (range<=n) { //입력한 수와 해당 범위의 최소값과 비교 >> true 이면 아래 구현부 수행
				range=range+(6*count); // 다음 범위 최소값으로 초기화
				count++; //범위 1증가
			}
			System.out.print(count);
		}
	}

}
