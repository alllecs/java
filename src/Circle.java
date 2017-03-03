class Circle2 {
	public void leghtCircle(int a) {
		double r = 2 * 3.14 * a;
		System.out.println("Длина окружности = " + r);
	}
}

public class Circle {
	public static void main(String[] args) {
		int i = (int)((Math.random() * 7) + 1);
		Circle2 o1 = new Circle2();
		o1.leghtCircle(i);
	}
}
