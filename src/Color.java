import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = sc.nextDouble();

		if (min % 5 < 3) {
			System.out.println("Зеленый");
		} else if (min % 5 < 4 && min % 5 >= 3) {
			System.out.println("Желтый");
		} else if (min % 5 <= 5) {
			System.out.println("Красный");
		}
	}
}
