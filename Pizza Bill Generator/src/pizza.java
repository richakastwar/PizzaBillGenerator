public class pizza {
    private int price;
    private int veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice =20;
    private  int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean  isOptedForTake = false;


    public pizza(int veg) {
        this.veg=veg;
        if(this.veg==1)
        {
            this.price=300;
        }
        else if(this.veg==2) {
            this.price=400;
        }
        basePizzaPrice = this.price;

    }
    public void addExtraCheese()
    {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;

    }
    public void takeAway()
    {
        isOptedForTake = true;
        this.price +=backPackPrice;
    }
    public void  getBill()
    {
        String bill = "";
        System.out.println("Pizza:"+basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill += "Extra cheese  added:"+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded)
        {
            bill +="Extra toppings added:"+extraToppingsPrice+ "\n";
        }
        if(isOptedForTake)
        {
            bill +="Take away :"+backPackPrice+ "\n";
        }

        bill +="Bill :"+ this.price+ "\n";
        System.out.println(bill);
    }
}


