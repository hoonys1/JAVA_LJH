package JavaMission;

import java.util.Scanner;

public class _05 {

	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("######## 치킨 메뉴판 ########");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.println("######## 번호 : ");
	}

	public static void main(String[] args) {

		int menuNo;

		do {
			menu(); // 메뉴판 출력
			menuNo = sc.nextInt(); // 메뉴번호 입력
			sc.nextLine(); // 숫자입력후 엔터를 누르니 입력버퍼에서 엔터가 남아있어서 엔터의 입력버퍼에서 제거하기위한 용도.

			// 프로그램 종료
			if (menuNo == 0)
				break;

			// 메뉴 선택
			switch (menuNo) {
			case 1:
				list(); // 게시글 목록
				break;
			case 2:
				read(); // 게시글 읽기
				break;
			case 3:
				write(); // 게시글 쓰기
				break;
			case 0:
				update(); // 게시글 수정
				break;
			default:
				System.out.println("(o~5) 사이의 숫자를 입력해 주세요.");
				break;
			}
		} while (menuNo != 0);
	}
}
