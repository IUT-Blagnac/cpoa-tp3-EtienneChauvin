package tp3.pizzas;

import tp3.Pizza;

import java.util.ArrayList;

public class PizzaGrecqueStyleBrest extends Pizza {
    public PizzaGrecqueStyleBrest() {
        super("Brest", "grecque");
        garnitures.add("Black Olives");
        garnitures.add("Feta");
        garnitures.add("Tomatoes");
        crust = "crispy";
        sauce = "tzatzíki";
    }
}
