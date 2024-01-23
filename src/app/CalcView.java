package app;

import java.util.Scanner;

public class CalcView {

    Scanner sc = new Scanner(System.in);

    public int getOpt() {

        System.out.println(
                """
                        Choose your option:
                        1 - miles to kilometers.
                        2 - kilometers to miles.
                                                
                        """
        );
        return sc.nextInt();
    }

    public double getData() {
        System.out.println("To convert into kilometers, please, " +
                "enter your miles");
        return sc.nextDouble();
    }

    public void getOutput(String output) {
        sc.close();
        System.out.println("Your result is " + output);
    }

}
