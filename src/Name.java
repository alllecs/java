import java.util.*;
import java.io.*;

public class Name {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
       
	System.out.println(name1 +  name2);
        if (name1 == name2) {
            System.out.println("Имена идентичны");
        } else if(name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
