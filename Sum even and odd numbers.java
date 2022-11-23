// in this program goal is to take 10 number and print sum of ood and sum of even numbers
// for example if we give input of fowloing numbers
// 2 5 8 6 9 125 12 8 1 0
// program should add 
// odds = 5 + 9 + 125 + 1 = 140
// evens = 2 + 8 + 6 + 12 + 8 + 0 = 36
// output will be

// odd numbers: 140
// even numbers: 36

package javaapplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ODDS = 0;
        int EVENS = 0;

        for(int i = 1; i < 11; i++){
            System.out.print("Give me a number for " + i + ": ");
            int input = keyboard.nextInt();
            if (input % 2 == 0){
                EVENS = EVENS + input;
            }else{
                ODDS = ODDS + input;
            }}
        System.out.println("odd numbers: " + ODDS);
        System.out.print("even numbers: " + EVENS);
    }
}