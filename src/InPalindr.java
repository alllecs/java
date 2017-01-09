import java.util.Scanner;
public class InPalindr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.print("Введите слово из 5 букв: ");
	s1 = sc.nextLine();
	if (s1.length() != 5) {
		System.out.println("Введенное слово не из 5 букв");
	}
	s1 = s1.toLowerCase();
	if (s1.charAt(0) == s1.charAt(4) && s1.charAt(1) == s1.charAt(3)) {
		System.out.println("Палиндром");
	} else {
		System.out.println("Не палиндром");
	}
    }
}
