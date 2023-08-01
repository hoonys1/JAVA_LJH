package Day04.Ex06_PassingArgumnet;

public class CallByValue {

	public static int sum(int a, int b) {
		// 2번 계산
		a = 100;
		b = 200;
		System.out.println("***** sum 메소드 *****");
		System.out.println("(a,b) : " + a + "," + b);
		int sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 1번 계산
		System.out.println("***** main 메소드 *****");
		System.out.println("(a,b) : " + a + "," + b);
		
		int sum = sum(a, b);
		System.out.println("sum : " + sum);
		// 3번 계산
		System.out.println("***** sum 메소드 호출 후 *****");
		System.out.println("(a,b) : " + a + "," + b);
	}
}
