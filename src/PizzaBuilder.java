import java.util.Random;

public class PizzaBuilder {
    private String size;
    private String chain;
    private String[] toppings;
    private static final String[] availableToppings = {
            "Pepperoni",
            "Sausage",
            "Mushrooms",
            "Bacon",
            "Onions",
            "Extra Cheese",
            "Peppers",
            "Chicken",
            "Olives",
            "Spinach",
            "Tomato and Basil",
            "Beef",
            "Ham",
            "Pesto",
            "Spicy Pork",
            "Ham and Pineapple"
    };
    private static final String[] pizzaSizes = {
            "Small",
            "Medium",
            "Large"
    };

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }
    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }
    public PizzaBuilder setToppings(String[] toppings){
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setRandomSize(){
        int rnd = new Random().nextInt(pizzaSizes.length);
        this.size = pizzaSizes[rnd];
        return this;
    }
    public PizzaBuilder setRandomToppings(int i){
        Random rnd = new Random();
        String[] newToppings = new String[i];
        for(int j=0; j<i;j++){
            newToppings[j]=availableToppings[rnd.nextInt(availableToppings.length)];
        }
        this.toppings = newToppings;
        return this;
    }

    public Pizza makePizza(){
        return new Pizza(chain, size, toppings);
    }

}
