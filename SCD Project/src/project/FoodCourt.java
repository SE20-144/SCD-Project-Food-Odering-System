package project;

class FoodCourt extends Order {

    String foodlist[];
    Array object;
    FoodCourt(String[] dishes){
        this.foodlist = dishes;
        object = new Array(dishes.length - 1);
    }

    @Override
    void add() {
        for (int i = 0; i < foodlist.length; i++) {
            object.insert(foodlist[i].toUpperCase());
        }
    }

    void display () {

        System.out.println("Dishes: ");
        object.print();
    }

    void order_dish (String dish){

        int i = object.indexof(dish);
        if (i == -1) {
            System.out.println("Sorry Restaurant is closed");
            System.exit(0);
        } else {
            System.out.println("Thank you for ordering " + dish + "\n\n");
        }

    }



}

