package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySort {

	public static void main(String[] args) {
		int arr[] = {10, 5, 2, 3, 4};
		
		// Arrays.sort(arr);		arr 배열에 정렬을 적용 O
								// Arrays.stream으로 받아와 sorted로 Integer타입으로 받아서 정렬한 후 int타입으로 반환한다
		int sortedArr[] = Arrays.stream(arr).sorted().toArray();
		
		System.out.println("기본 배열에 정렬을 적욕 X");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("- 오름차순 정렬");
		System.out.println("복사된 배열에 정렬을 적욕 O");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("- 내림차순 정렬");
										//
		Object reversedArr[] = Arrays.stream(arr).boxed().sorted( (a,b) -> b-a ).toArray();
		for (Object obj : reversedArr) {
			System.out.print( (Integer) obj + " ");
		}
		System.out.println();
		
		// sorted + forEach
		System.out.println("정렬과 반복을 동시에");
		Arrays.stream(arr).sorted().forEach( (n) -> System.out.println(n + " ") );
	}
}
