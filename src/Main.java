//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("CS5800 HW7 PT1"));
    PizzaBuilder builder = new PizzaBuilder();

    Pizza myPizza = builder.setSize("Small").setChain("Pizza Hut").setRandomToppings(3).makePizza();
    myPizza.eat();
    myPizza = builder.setSize("Medium").setRandomToppings(6).makePizza();
    myPizza.eat();
    myPizza =builder.setSize("Large").setRandomToppings(9).makePizza();
    myPizza.eat();

    System.out.println("Part 1 complete.");

    myPizza = builder.setSize("Large").setRandomToppings(3).makePizza();
    myPizza.eat();
    myPizza = builder.setSize("Small").setRandomToppings(2).makePizza();
    myPizza.eat();
    myPizza = builder.setChain("Little Caesar's").setRandomToppings(8).setSize("Medium").makePizza();
    myPizza.eat();
    myPizza = builder.setSize("Small").setRandomToppings(6).makePizza();
    myPizza.eat();
    myPizza = builder.setChain("Dominos").setSize("Small").setRandomToppings(1).makePizza();
    myPizza.eat();
    myPizza = builder.setSize("Large").setRandomToppings(3).makePizza();
    myPizza.eat();





    System.out.println("Program complete.");
}
