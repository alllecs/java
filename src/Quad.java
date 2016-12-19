public class Quad {
	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		int c = 4;
		int D = (int)(Math.pow(b, 2)) - (4 * a * c);
		if (D > 0) {
			double x1 = ((-1) * b + Math.sqrt(D)) / (2 * a);
			double x2 = ((-1) * b - Math.sqrt(D)) / (2 * a);
			System.out.println(x1);
			System.out.println(x2);
		} else if (D == 0) {
			double x = (-1) * (b / (2 * a));
			System.out.println(x);
		}else {
			System.out.println("Нет корней");

		}

	}
}
