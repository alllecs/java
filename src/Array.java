import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число больше 3: ");
	int i;
	int arr1[];	
	int arr2[];	
	int j = 0;
	int k;
	while (true) {
	        if (sc.hasNextInt()) {
       		  i = sc.nextInt();
		  arr1 = new int[i];
		  arr2 = new int[i];
		  if (i < 3) {
       		     System.out.println("Число " + i + " не подходящее число");
		     System.out.print("Введите натуральное число больше 3: ");
		  } else {
		     for (k = 0; k < i; k++) {
			arr1[k] = (int)(Math.random() * i);
			if (arr1[k] % 2 == 0) {
			   arr2[j] = arr1[k];
		     	   System.out.print(arr2[j] + " ");
			   ++j;
			}
		     }
		     System.out.println();
		     break;
		  }
		} else {
	            System.out.println("Вы ввели не целое число");
		    System.out.print("Введите натуральное число больше 3: ");
		}
	}
    }
}
