import java.util.Scanner;

public class backjun_7_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.next()); //아침에 올라가는 거리 2
		int b=Integer.parseInt(sc.next()); //저녁에 떨어지는 거리
		int v=Integer.parseInt(sc.next()); //총 높이
		int d=0; //날짜
		int v_mor=0; //아침에 올라가고 난 높이
		int v_nig=0; //저녁에 떨어지고 난 높이
		sc.close();
		while(true) {
			d++; //날짜를 +1
			//왜냐 뭔가르 했다는 소리는 날짜가 최소 하루 걸렸다는 소리
			//뭔가를 할 수 밖에 없는 이유는
			//올라가는 거리의 최소값이 1이고, 총 높이도 최소값이 1이기때문에
			//즉, 모든 최소값이 1이기때문에 날짜의 최소값도 1
			v_mor=v_nig+a; //0+2=2(d=1)
			//1+2=3(d=2)
			//2+2=4(d=3)
			//3+2=5(d=4)
			
			//아침에 올라가고난 높이
			//저녁에 올라간 후 높이 + 아침에 올라가는 거리 = 아침에 올라간 후 높이
			if(v_mor>=v) { //아침에 올라가고 난 후의 높이가 총 높이보다 같거나 크면
				//더이상 올라갈 필요가없죠 즉, 다 올라갔다는 소리
				//break
				System.out.println(d); //그 날짜를 찍어주면 됨
				break;
			}
			//해당하지않으면 달팽이는 떨어진다.
			
			v_nig=v_mor-b; 
			//저녁에 떨어진 후 높이 //2-1=1(d=1)
			//3-1=2(d=2)
			//4-1=3(d=3)
			
			//아침에 올라간 후 높이 + 저녁에 떨어지는 거리 = 저녁에 떨어진 후 높이
			
//			if(v_nig>=v) {
//				System.out.println(d);
//				break;
//			}
		}
		
	}
}
