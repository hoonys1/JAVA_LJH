package Day05.Review;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		int input;				// 입력금액
		int count;				// 화폐매수
		int money = 50000;
		int list[] = {50000, 100000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int index = 0;
		boolean sw = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		while( money >= 1) {
			// (화폐매수) = (입력금액) / (화폐단위)
			count = input / money;
			System.out.println(money + "\t : " + count + " 개 ");
			input = input % money;
			if( sw ) {
				money = money / 5;
			}
			else {
				money = money / 2;
			}
		}
	}
}
