package app;

import java.util.Scanner;

public class CalcView {

    Scanner sc = new Scanner(System.in);



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
