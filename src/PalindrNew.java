import java.util.Scanner;

public class PalindrNew {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите слово из 5 букв: ");
		String s1 = sc.nextLine();

		int x = 0;
		x = check(s1);
		prin(x, s1);

	}

	public static int check(String s2) {
		int i, j, y = 0;
		for (i = 0, j = s2.length() - 1; i < j; i++, j-- ) {
			if(s2.charAt(i) == s2.charAt(j)) {
				y = 1;
			} else {
				y = 0;
				break;
			}	
		}
		return y;

	}

	public static void prin(int x, String s1) {
		if(x == 1) {
			System.out.println(s1 + " - палиндром");
		} else {
			System.out.println(s1 + " - не палиндром");
		}

	}
}
