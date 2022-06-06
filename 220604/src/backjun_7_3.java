import java.util.Scanner;

public class backjun_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(); //찾고자 하는 분수 번호
		int cnt=0; //분수의 누적 개수
		int n=0; //행 번호
		sc.close();
		while (true) {
			n++;
			cnt+=n;
			if(cnt>=a) {
				if(n%2==0) {
					System.out.println(a-cnt+n+"/"+(cnt+1-a));
					//분자 : 해당 라인 갯수 + 인덱스 - 해당 라인 최대값 // 1부터 해당 라인 갯수까지 +1 되는 로직
					//분모 : 해당 라인 최대값 + 1 - 인덱스 //해당 라인 갯수부터 1까지 -1되는 로직
				}else {
					System.out.println((cnt+1-a)+"/"+(a-cnt+n));
				}
				break;
			}
		}
	}
}
