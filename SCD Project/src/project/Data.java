package project;

public class Data {
    Array name_of_customers = new Array(100);
    Array dishes = new Array(100);

    void details(String names, String dish){
        name_of_customers.insert(names);
        dishes.insert(dish);
    }

    void print(){
        System.out.println("Names of Customers");
        System.out.println("===================================");
        name_of_customers.print();
        System.out.print("\n\n");

        System.out.println("Dishes Ordered");
        System.out.println("===================================");
        dishes.print();
        System.out.print("\n\n");
    }
}