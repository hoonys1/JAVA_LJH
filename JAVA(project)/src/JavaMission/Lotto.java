package JavaMission;

import java.util.Iterator;

public class Lotto {

	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxxx 사이의 임의 수를 반환
		
		// 1~45 사이의 랜덤 한 정수
		// Math.random()						:	0.xxxxx ~ 0.9xxxxx
		// Math.random() * 10				:	0.xxxxx ~ 0.9xxxxx
		// Math.random() * 10 + 1			:	0.xxxxx ~ 0.9xxxxx
		// (int) (Math.random() * 10 + 1)	:	1 ~ 10
		
		// Math.random() * 45				:	0.0xxxx ~ 44.xxxxx
		// Math.random() * 45 + 1			:	0.0xxxx ~ 45.xxxxx
		// (int) (Math.random() * 45 + 1)	:	1 ~ 45
		
		// (공식)
		// (int) (Math.random() * 10 + 1)	:	1 ~ 10
		// (int) (Math.random() * 45 + 1)	:	1 ~ 45
		
		// (int) (Math.random() * [개수] + [시작숫자])
		double random = Math.random();
		
		int 로또번호 = (int) (random * 10);
		
		System.out.println(random);
		System.out.println(로또번호);
		
		int result = (int) (random * 45 + 1);
		System.out.println("1~45 : " + result);
		
		int game[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			game[i] = rand;
		}
		
		for (int i = 0; i < game.length; i++) {
			System.out.print(game[i] + " ");
		}
		System.out.println();
	}
}
