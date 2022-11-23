// in this project goal is to print all minutes between 2 diffrent times.
// it is good for undrstanding how clocks work
// in real life you probably have good enough library so you don't need to code all of this.
// but after all being a programmer is not just using library you should undrstand what you are doing 


package javaapplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
// for just starting following code in comment is good.
// in this we just print hours between 02:00 and 03:30

      
//        for(int i = 120; i <= 210; i++){
//            System.out.println(i/60 + ":" + (i - 60*(i/60)));
//        }
      
      
// a bit more advance
      
//        for(int i = 120; i <= 210; i++){
//            String minStr = "";
//            String hStr = "";
//            if(i/60 <= 10){
//                hStr = "0";
//            }
//            if(i%60 < 10){
//                minStr = "0";
//            }
//            System.out.println(hStr + (i/60) + ":" + minStr + (i - 60*(i/60)));
//        }
      
      
// and the final version
      
      
        Scanner keyboard = new Scanner(System.in);
        System.out.print("which hour you want to start: ");
        int h1 = keyboard.nextInt();
        System.out.print("which min you want to start: ");
        int min1 = keyboard.nextInt();
        System.out.print("which hour you want to end: ");
        int h2 = keyboard.nextInt();
        System.out.print("which min you want to end: ");
        int min2 = keyboard.nextInt();

        if(h1 < 0 || h2 < 0 || min1 < 0 || min2 < 0 || min1 >= 60 || min2 >= 60){
            System.err.println("you really should go back to elementary school and learn about hours system!!!1!");
        } else if (h2 < h1 || (h1 == h2 && min1 > min2)) {
            System.err.println("you really should know starting point should be before ending point!!!!!");
        } else {
            minH(h1, min1, h2, min2);
        }
    }

    public static void minH(int h1, int min1, int h2, int min2) {
        int num1 = (h1 * 60) + min1;
        int num2 = (h2 * 60) + min2;
        for (int j = num1; j <= num2; j++) {
            int i = j;
            String minStr = "";
            String hStr = "";
            String days = "";
            if (i > 1440){
                days = "Day " + i/1440 +" ";
                 i = i - 1440*(i/1440);
            }
            if (i / 60 < 10) {
                hStr = "0";}
            if (i % 60 < 10) {
                minStr = "0";}
            System.out.println(days + hStr + (i / 60) + ":" + minStr + (i - 60 * (i / 60)));
        }
    }
}
