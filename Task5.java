import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество строк:");
		int a = in.nextInt();
		System.out.println("Введите количество столбцов:");
		int b = in.nextInt();
        int[][]mas = new int[a][b];
        for (int i = 0; i < a; i++) {
        	for (int j = 0; j < b; j++) {
        		mas[i][j] = (int)(Math.random() * 30 - 5);
        		System.out.print(mas[i][j] + " ");
        	}
    		System.out.println();
        }
        for (int j = 0; j < mas.length-1; j++) {
            int max = mas[0][j];
    	for (int i = 0; i < mas.length; i++) {
			if (mas[i][j] > max) {
				max = mas[i][j];
			}
		}
		System.out.println("Максимальный элемент " + j +"-го столбца: " + max);
        }
	}
}
