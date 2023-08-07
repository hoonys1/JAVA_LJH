package InsertionSort;

public class Ex0 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6, 1, 3};
		System.out.println("정렬 전 배열 : ");
		printArray(arr);
		insertionSort(arr);
		System.out.println("정렬 후 배열 : ");
		printArray(arr);
	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			// key보다 큰 요소들을 오른쪽으로 이동
			while (j >= 0 && arr[j] > key) {
				arr[j +1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
