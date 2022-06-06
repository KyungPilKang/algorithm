import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeup_1472 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int m=Integer.parseInt(sc.next());
		
		Integer temp[]=new Integer[n*m]; //두 수 곱한만큼 하나의 배열에 넣고(오름차순으로 넣고)
		for(int i=0;i<temp.length;i++) { //4,4 >> 1 2 3 4 5 6 ... 16
			temp[i]=i+1;
		}
		Arrays.sort(temp, Collections.reverseOrder()); //배열에 넣은걸 내림차순으로 정렬(내림차순 정렬)
		// 12 11 10 9 8 ... 1
		int idx=0;
		if(n%2==1) { //나타내야하는 행의 갯수가 홀수 >> 콘솔창에 찍는 기준으로
			//역순 > 정순 > 역순 > 정순 이런식
			for(int i=0;i<n;i++) {
//				if(n==1) { //예외처리 n이 1인 경우 >> 즉, 콘솔에 나타내는 행의 갯수가 1개일때
//					Arrays.sort(temp, Collections.reverseOrder());
//					for(int j=0;j<temp.length;j++) {
//						System.out.print(temp[j]+" ");
//					}
//					break;
//				}
				//지금 현재 여기 라인에서 입력된 숫자는 내림차순으로 정렬되어있는 상태
				//temp = 12 11 10 9 8 7 6 5 4 3 2 1
				if(i!=0&&i%2!=0) { //나타내야하는 행의 갯수가 홀수일때 + 행의 인덱스가 홀수 >> 오름차순
					//i=1
					//temp의 4부터 4개만큼 복사한걸 temp2
					//temp2 = 8 7 6 5
					//temp2 = 5 6 7 8
					//반복돌려서 찍고 줄바꿈
					//idx==8
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					Arrays.sort(temp2); //오름차순으로 정렬을 바꾼상태
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}else { //나타내야하는 행의 갯수가 홀수일때 + 행의 인덱스가 홀수이거나 0 일때 >> 내림차순
					//i=0, i=2 (m=4)
					//i=0일때
					//temp의 0부터 4개만큼 복사한걸 temp2
					//temp2 = 12 11 10 9
					//i=2일때
					//temp의 8부터 4개만큼 복사한걸 temp2
					//temp2 = 4 3 2 1
					//4 3 2 1
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m); //temp라는 배열을 idx라는 인덱스 번호부터 idx+m만큼 복사
					idx=idx+m; //idx==4
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}
			}
		} else {
			for(int i=0;i<n;i++) {
				if(i==0||i%2==0) {
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					Arrays.sort(temp2);
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}else {
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}
