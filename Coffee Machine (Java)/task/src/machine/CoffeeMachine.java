package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int water = 400,
                milk = 540,
                beans = 120,
                cups = 9,
                money = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String option = sc.nextLine();

            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String x = sc.next();

                    switch (x) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            cups--;
                            money += 4;
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups--;
                            money += 7;
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups--;
                            money += 6;
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += sc.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "remaining":
                    state(water, milk, beans, cups, money);
                    break;
                case "exit":
                    return;
            }
        }
    }

    private static void state(int water, int milk, int beans, int cups, int money) {
        System.out.println("At the moment, the coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");
    }
}
