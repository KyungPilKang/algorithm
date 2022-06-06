import java.util.HashMap;
import java.util.Scanner;

public class codeup_1430_3 {
	public static void main(String[] args) {
		System.out.println("입력 예시");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashMap<Integer, Integer> standard=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			standard.put(Integer.parseInt(sc.next()), 1);
		}
		int m = Integer.parseInt(sc.next());
		int[] question=new int[m];
		for(int i=0;i<m;i++) {
			question[i]=Integer.parseInt(sc.next());
		}
		System.out.println("출력 예시");
		for(int idx : question) {
			if(standard.get(idx)==null) {
				System.out.print(0+" ");
			} else {
				System.out.print(standard.get(idx)+" ");
			}
		}
	}
}
