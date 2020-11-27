package tp3.pizzas;

import tp3.Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - tp3.Pizza
 */
public class PizzaPoivronStyleStrasbourg extends Pizza {
    public PizzaPoivronStyleStrasbourg() {
        super("Strasbourg", "poivron");
        garnitures.add("Pepper");
        garnitures.add("Onion");
        garnitures.add("Beef");
        crust = "crispy";
        sauce = "bbq";
    }
}
