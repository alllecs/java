import java.util.Scanner; // импортируем класс
public class InChet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
	  if (i % 2 == 0) {
            System.out.println("Число " + i + " четное");
          } else {
            System.out.println("Число " + i + " нечетное");
	  }
	} else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
