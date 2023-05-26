package dhanush;

import java.util.Scanner;

public class pizza {
    String type = "regular";
    String topping1;
    String topping2;
    boolean cheese;
    int price = 150;

    public pizza(boolean cheese) {
        this.cheese = cheese;
        if (cheese) {
            this.price += 60;
        }
    }

    public pizza(String topping1, boolean cheese) {
        this.topping1 = topping1;
        this.cheese = cheese;
        if (cheese) {
            this.price += 60 + 40;
        } else {
            this.price += 40;
        }
    }

    public pizza(String topping1, String topping2, boolean cheese) {
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.cheese = cheese;
        if (cheese) {
            this.price += 60 + 80;
        } else {
            this.price += 80;
        }
    }

    public void bill() {
        System.out.println("Type: " + this.type);
        System.out.println("Topping 1: " + this.topping1);
        System.out.println("Topping 2: " + this.topping2);
        double totalprice = this.price + ((18 * this.price) / 100);
        System.out.println("Total Price: " + totalprice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of pizza: ");
        String type = scanner.nextLine();

        System.out.print("Enter the first topping: ");
        String topping1 = scanner.nextLine();

        System.out.print("Enter the second topping (optional): ");
        String topping2 = scanner.nextLine();

        System.out.print("Do you want cheese (true/false): ");
        boolean cheese = scanner.nextBoolean();

        scanner.close();

        if (topping2.isEmpty()) {
            pizza p1 = new pizza(topping1, cheese);
            p1.bill();
        } else {
            pizza p1 = new pizza(topping1, topping2, cheese);
            p1.bill();
        }
    }
}
