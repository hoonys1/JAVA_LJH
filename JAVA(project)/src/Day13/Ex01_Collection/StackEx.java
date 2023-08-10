package Day13.Ex01_Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("empty : " + stack.isEmpty());
		
		// push(요소) : 요소를 TOP 위에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1 포함 여부 : " + stack.contains(1));
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		// peek()		 : TOP 의 데이터를 반환
		System.out.println("TOP : " + stack.peek());
		System.out.println("size : " + stack.size());
		
		// pop() 		 : TOP 의 요소를 삭제
		stack.pop();
		stack.remove(1);					// index 로 삭제
		stack.remove( (Integer) 3 );		// 객체를 지정하여 삭제 (위처럼 숫자를 입력하면 3번째 index를 삭제하지만 객체를 지정해주면 객체값을 삭제한다)
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		
		stack.clear();						// 전체 요소 삭제
		System.out.println("empty : " + stack.isEmpty());
		
		
	}
}
