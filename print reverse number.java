// in this program goal is to revers number
// for example if input be 123 output be 321
// this will work for any number

package javaapplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
        System.out.print("F NUMBER: ");
        int num = Integer.parseInt(keyboard.next());
        int ten = 10;

        while (num !=0){
            System.out.print(num % ten);
            num = num - (num%ten);

            num = num/10;
        }
    }
}