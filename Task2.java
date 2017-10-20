import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int numbers[] = new int[] { 22, 33, 10, 40, 27, 15, 35, 18, 17, 24};
		int max = numbers[0];
		double result[] = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			result[i] = (double) numbers[i] / max;
		}

		System.out.println("Исходный массив: " + Arrays.toString(numbers));
		System.out.println("Максимальный элемент: " + max);
		System.out.print("Частное: [ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%.2f ", result[i]);
		}
		System.out.print("]");
	}
}
