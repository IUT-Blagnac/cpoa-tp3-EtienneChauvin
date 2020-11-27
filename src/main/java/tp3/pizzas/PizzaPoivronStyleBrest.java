package tp3.pizzas;

import tp3.Pizza;

public class PizzaPoivronStyleBrest extends Pizza {
    public PizzaPoivronStyleBrest() {
        super("Brest", "poivron");
        garnitures.add("Pepper");
        garnitures.add("Ham");
        garnitures.add("Emmenthal");
        crust = "thin";
        sauce = "ketchup";
    }
}
