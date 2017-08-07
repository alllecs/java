/*
Сортировка трех чисел
*/
import java.util.*;
import java.io.*;

public class Sort {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid, min, max;
       
        if (a <= b) {
            if (a <= c) {
                min = a;
                if (b <= c) {
                    mid = b;
                    max = c;
                } else {
                    mid = c;
                    max = b;
                }
            } else {
                min = c;
                mid = a;
                max = b;
            }
        } else {
            if (b <= c) {
                min = b;
                if (a <= c) {
                    mid = a;
                    max = c;
                } else {
                    mid = c;
                    max = a;
                }
            } else {
                min = c;
                mid = b;
                max = a;
            }
        }
        System.out.println(max + " " + mid + " " + min);
    }
}
