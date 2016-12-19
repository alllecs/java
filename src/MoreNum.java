public class MoreNum {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 900 + 100);
		int a = i % 10;
		int b = (i / 10) % 10;
		int c = (i / 100) % 10;
		if (a >= b && a >= c)
			System.out.println("В числе " + i + " наибольшая цифра " + a);
		else if (b >= a && b >= c)
			System.out.println("В числе " + i + " наибольшая цифра " + b);
		else
			System.out.println("В числе " + i + " наибольшая цифра " + c);
	}
}
