/*
 * Quiz_1
 */
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number :");
        int a = input.nextInt();
        System.out.println("Enter Second number :");
        int b = input.nextInt();
        System.out.println("Enter Third number :");
        int c = input.nextInt();
        if (a <= b && a <= c) {
            if (b < c) {
                System.out.println(a + " - " + b + " - " + c);
            } else {
                System.out.println(a + " - " + c + " - " + b);
            }
        } else if (a <= b && a >= c) {
            if (b < c) {
                System.out.println(b + " - " + a + " - " + c);
            } else {
                System.out.println(c + " - " + a + " - " + b);
            }
        } else if (a >= b && a >= c) {
            if (b < c) {
                System.out.println(b + " - " + c + " - " + a);
            } else {
                System.out.println(c + " - " + b + " - " + a);
            }
        }
    }

}
