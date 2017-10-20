import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int numbers[] = new int[] { 5, 7, 2, 8, 11, 14, 3, 6, 9 };

		int max = numbers[0];
		int imax = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				imax = i;
			}
		}

		int min = numbers[0];
		int imin = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}
	}
		int tmp = numbers[imin];
		numbers[imin] = numbers[imax];
		numbers[imax] = tmp;
		
		System.out.println("Максимальный элемент: " + max);
		System.out.println("Минимальный элемент: " + min);
		System.out.print("Полученный массив: ");
		System.out.println(Arrays.toString(numbers));
}
}
