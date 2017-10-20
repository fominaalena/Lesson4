import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
            int i, j;
            int[][]mas = new int[5][5];
            for (i = 0; i < 5; i++) {
            	for (j = 0; j < 5; j++) {
            		mas[i][j] = (int)(Math.random() * 25 - 5);
            		System.out.print(mas[i][j] + " ");
            	}
        		System.out.println();
            }
            System.out.println("----------");
            Scanner in = new Scanner(System.in);
    		System.out.println("¬ведите номера строк, которые необходимо помен€ть:");
    		int a = in.nextInt();
    		int b = in.nextInt();
            for (i = 0; i < 5; ++i) {
            	for (j = 0; j < 5; ++j) {
            		int tmp = mas[a][j];
            		mas[a][j] = mas[b][j];
            		mas[b][j] = tmp; 
                    }
			}
            for (i = 0; i < 5; ++i) {
            	for (j = 0; j < 5; ++j) {
            		System.out.print(mas[i][j] + " ");
            	}
        		System.out.println();
            }
	}
}