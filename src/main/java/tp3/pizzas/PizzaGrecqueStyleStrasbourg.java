package tp3.pizzas;

import tp3.Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - tp3.Pizza
 */
public class PizzaGrecqueStyleStrasbourg extends Pizza {
    public PizzaGrecqueStyleStrasbourg() {
        super("Strasbourg", "grecque");
        garnitures.add("Aubergine");
        garnitures.add("Lamb");
        crust = "thin";
        sauce = "tzatzíki";
    }
}
