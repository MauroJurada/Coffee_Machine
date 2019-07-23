package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int water = 1200,
                milk = 540,
                beans = 120,
                cups = 9,
                money = 550;

        state(water, milk, beans, cups, money);

        System.out.println("Write action (buy, fill, take): ");
        String option = sc.nextLine();

        switch (option) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int x = sc.nextInt();

                switch (x) {
                    case 1:
                        water -= 250;
                        beans -= 16;
                        cups--;
                        money += 4;
                        break;
                    case 2:
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cups--;
                        money += 7;
                        break;
                    case 3:
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cups--;
                        money += 6;
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
        }

        state(water, milk, beans, cups, money);

        /*
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int n = sc.nextInt();

        water /= 200;
        milk /= 50;
        beans /= 15;

        int min = Math.min(water, milk);
        min = Math.min(beans, min);

        if (n == min){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(n < min){
            System.out.println("Yes, I can make that amount of coffee (and even " + (min - n) + " more than that)");
        }else {
            System.out.println("No, I can make only "+ min +" cup(s) of coffee");
        }

         */
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
