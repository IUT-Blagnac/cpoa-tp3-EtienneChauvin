package tp3.pizzas;

import tp3.Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - tp3.Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
    @Override
    public void cut() {
        System.out.println("Découpage en carrés");
    }
}
