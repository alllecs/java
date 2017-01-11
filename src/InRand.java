import java.util.Scanner;
public class InRand {
   public static void main(String[] args) {
	// prog — число созданное программой
	// user — число введённое пользователем
	int prog, user;
	int i = 0;
	// Генерируем случайное целое число от 1 до 10
	prog = (int)(Math.random() * 21) - 10;
	System.out.println("Я загадала число от -10 до 10, отгадайте его.");
	System.out.print("Вводите ваше число: ");
	Scanner input = new Scanner(System.in);  
	// Проверяем, есть ли в потоке ввода целое число
	if( input.hasNextInt() ) {
		do {
			// Читаем с потока ввода целое число
			user = input.nextInt();
			i++;
			if(user == prog) {
				System.out.println("Вы угадали c " + i + " раза");
				break;
			} else {
				if ((user > 0 && prog < 0) || (user < 0 && prog > 0)) {
					System.out.println("Вы ошиблись в знаке!");
				// Проверяем, входит ли число в отрезок [10;10]
				} else if (user >= -10 && user <= 10) {
					System.out.print("Вы не угадали! ");
					// Если число загаданное программой меньше...
					if( prog < user ) {
						System.out.println("Моё число меньше.");
					} else {
						System.out.println("Моё число больше.");
					}
				} else {
					System.out.println("Ваше число вообще не из нужного отрезка!");
				}
			}
			System.out.print("Вводите ваше число: ");
		} while( user != prog );
	} else {
		System.out.println("Ошибка. Вы не ввели целое число!");
	}
	System.out.println("До свиданья!");
   }
}
