package tp3.pizzas;

import tp3.Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - tp3.Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
    public PizzaCheeseStyleBrest() {
        super("Brest", "cheese");
        garnitures.add("Mozzarella");
        garnitures.add("Goat Cheese");
        garnitures.add("Edam");
        crust = "thick";
        sauce = "cream";
    }
}
