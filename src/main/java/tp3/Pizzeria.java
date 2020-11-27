package tp3;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - tp3.Pizza
 */
public abstract class Pizzeria {

    public PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    /**
     * @param type type of the pizza
     * @return a tp3.Pizza object according to the type
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
        return pizza;
    }

    protected Pizza createPizza(String type) {
        Pizza pizza = pizzaFactory.create(type);
        pizza.name += " with " + type;
        return pizza;
    }
}