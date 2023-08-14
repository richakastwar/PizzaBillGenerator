import java.util.*;
public class Main {
    public static void main(String[]args) {

        System.out.println("which pizza do you want to order ?");
        System.out.println("1.veg Pizza");
        System.out.println("2.Non veg Pizza");
        int choice;
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        choice =sc.nextInt();
        pizza pz=new pizza(choice);
        System.out.println("Do you want to add some  extra toppings   (1/0)?");
        choice =sc.nextInt();
        if(choice==1)
        {
           pz.addExtraToppings();
        }
        System.out.println("Do you want to add some  extra cheeses   (1/0)?");
        choice =sc.nextInt();
        if(choice==1)
        {
            pz.addExtraCheese();
        }
        System.out.println("Do you want to  take away  (1/0)?");
        choice =sc.nextInt();
        if(choice==1)
        {
            pz.takeAway();
        }

        pz.getBill();
    }
    }
