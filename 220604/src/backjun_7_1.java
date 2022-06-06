import java.util.Scanner;

public class backjun_7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fc=Integer.parseInt(sc.next());
		int vc=Integer.parseInt(sc.next());
		int price=Integer.parseInt(sc.next());
		sc.close();
		//손익분기점
		//고정비용 <= (물품의 가격 - 가변비용 = 순이익) * 물품의 개수
		//순익분기점이 존재하지 않는다
		//팔수록 손해를 본다
		//가격 < 가변비용 
		
		if(vc>=price) {
			System.out.println(-1);
		} else { //이익
			//고정비용/(물품가격-가변비용) = 물품의 개수 + 1
			//문제에서 말하는 손익분기점
			System.out.println((fc/(price-vc)+1));
		}
	}
}
