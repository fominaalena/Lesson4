import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		double [] arrayA = new double [] { -3.50, 4.11, 3.33, 1.55, -7.19, -8.64, -2.25, 6.34, 4.20, 11.34, -1.02, -3.09, 2.74, -9.58, -10.10, 6.84, 5.17, -9.37, -14.76, 21.03 };
		double [] arrayB = new double [arrayA.length];
		int j = 0;
		double sum = 0;
		for (int i = 2; i < arrayA.length; i += 2) {
			if (arrayA[i]>0) {
				j++;
				arrayB[j-1] = arrayA[i];
			}
		}
		System.out.println("Новый массив: " + Arrays.toString(arrayB));
		for ( int i = 0; i < j; i++) {
			sum += arrayB[i]*arrayB[i];
		}
		System.out.println("Сумма квадратов: " + sum);
	}

}
