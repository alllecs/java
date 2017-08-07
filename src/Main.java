import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.perimetr(tr.a, tr.b, tr.c);
	}
}

class Triangle {
	public int a;
	public int b;
	public int c;

	Triangle () {
		System.out.println("Enter first leght");
		a = scan();
		System.out.println("Enter second leght");
		b = scan();
		System.out.println("Enter third leght");
		c = scan();
	}

	public int scan() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public void perimetr(int a, int b, int c) {
		System.out.println("Периметр треугольника:" + (a + b + c));
	}
}

