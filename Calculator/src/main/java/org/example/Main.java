package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How much weight per kg is your shipment?");
            var weight = scanner.nextDouble();
            if (weight == 0)
                break;
            System.out.println("What is the cost of shipment per UAH/kg?");
            var cost = scanner.nextDouble();
            if (cost == 0)
                break;
            var result = weight * cost;
            System.out.println("The cost of you shipment is " + result + " UAH");
        }
    }
}