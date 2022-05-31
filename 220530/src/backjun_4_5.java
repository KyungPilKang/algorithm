import java.util.Arrays;
import java.util.Scanner;

public class backjun_4_5 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int input1=Integer.parseInt(sc.next());
		int[] score=new int[input1];
		double[] new_score=new double[input1];
		for(int i=0;i<input1;i++) {
			score[i]=Integer.parseInt(sc.next());
		}
		for(int i=0;i<input1;i++) {
			new_score[i]=((double)score[i]/Arrays.stream(score).max().getAsInt())*100;
		}
		System.out.println(Arrays.stream(new_score).sum()/new_score.length);
	}
}
