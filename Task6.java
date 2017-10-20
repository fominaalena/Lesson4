import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int a = in.nextInt();
		System.out.println("Введите количество столбцов:");
		int b = in.nextInt();
		int[][] mas = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				mas[i][j] = (int) (Math.random() * 50 - 25);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Введите целое число, которое необходимо найти:");
		int c = in.nextInt();
		int cout = 0;
		for (int j = 0; j < mas[0].length; j++) {
			for (int i = 0; i < mas.length; i++) {
				if (mas[i][j] == c) {
					cout = cout + 1;
				}
			}
		}
		System.out.println("Количество повторений числа " + c + " равно " + cout);
	}

}
