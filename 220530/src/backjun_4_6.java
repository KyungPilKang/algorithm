import java.util.Scanner;

public class backjun_4_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int [] score=new int[input1];
		for(int i=0;i<input1;i++) {
			String quiz=sc.next();
			String[] temp_quiz=quiz.split("");
			int temp_score=0;
			int judge=0;
			for(int j=0;j<temp_quiz.length;j++) {
//				System.out.println(temp_quiz[j]);
				if(j==0&&temp_quiz[j].equals("O")) {
					temp_score=temp_score+1;
					judge=judge+1;
//					System.out.println("1회차 정답");
				} else if(temp_quiz[j].equals("O")) {
					if(judge==0) {
						temp_score=temp_score+1;
						judge=judge+1;
//						System.out.println("단일 정답");
					} else {
						temp_score=temp_score+(judge+1);
						judge=judge+1;
//						System.out.println("연속 정답");
					}
				} else {
					judge=0;
//					System.out.println("오답");
				}
			}
			score[i]=temp_score;
		}
		for(int k=0;k<input1;k++) {
			System.out.println(score[k]);
		}
	}

}
