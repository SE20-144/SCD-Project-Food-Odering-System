package project;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] dishes={"Biryani","Karhai","Sajji","Chargha","Handi",
                "Daal","B.B.Q","Singaporean Rice","Rolls","Pizza"};
        Data detail = new Data();


        FoodCourt food = new FoodCourt(dishes);
        food.add();

        System.out.println("Welcome to Library ");
        int i=0;
        while (i<1){
            synchronized (food) {
                System.out.print("Please choose an option:\n" +
                        "        1. List of all the Dishes\n" +
                        "        2. Order Food\n" +
                        "        3. View Order\n" +
                        "        4. Exit\n");
                try {
                    Scanner choice = new Scanner(System.in);
                    System.out.print("\nPress number: ");
                    int number = choice.nextInt();

                    if (number == 1) {
                        food.display();
                    } else if (number == 2) {
                        try {
                            Scanner obj1 = new Scanner(System.in);
                            System.out.println("Enter a  name: ");
                            String name = obj1.nextLine();
                            Scanner obj2 = new Scanner(System.in);
                            System.out.println("Enter a dish: ");
                            String dish_name = obj2.nextLine();
                            food.order_dish(dish_name.toUpperCase());
                            detail.details(name, dish_name);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    else if (number == 3) {
                        System.out.println("Waiting....Order List");
                        detail.print();
                    }
                    else if (number == 4) {
                        System.out.println("Thanks for Ordering");
                        System.exit(1);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }
    }
}
