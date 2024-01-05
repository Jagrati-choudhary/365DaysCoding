import java.util.*;
class SortInSpecificOrder{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int k = 0;
		for (int i = size - 1; i >= 0; i--) {
			if (arr[i] % 2 != 0) {
				a[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				a[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}