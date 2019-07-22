package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");

        int x = sc.nextInt();

        System.out.println("For " + x + "cups of coffee you will need:\n" +
                200*x + "ml of water\n" + 50*x + "ml of milk\n" + 15*x + "g of coffee beans");

    }
}
