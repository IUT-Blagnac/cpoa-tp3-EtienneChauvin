package tp3.pizzerias;

import tp3.Pizza;
import tp3.PizzaFactory;
import tp3.pizzas.PizzaCheeseStyleStrasbourg;
import tp3.pizzas.PizzaGrecqueStyleStrasbourg;
import tp3.pizzas.PizzaPoivronStyleStrasbourg;

public class PizzaFactoryStrasbourg extends PizzaFactory {

    private static PizzaFactoryStrasbourg uniqueInstance;

    private PizzaFactoryStrasbourg() {
    }

    public static PizzaFactoryStrasbourg getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactoryStrasbourg();
        }
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name) {
        Pizza pizza;
        switch (name) {
            case "cheese":
                pizza = new PizzaCheeseStyleStrasbourg();
                break;
            case "grecque":
                pizza = new PizzaGrecqueStyleStrasbourg();
                break;
            case "poivron":
                pizza = new PizzaPoivronStyleStrasbourg();
                break;
            default:
                throw new IllegalArgumentException("Sorry, this type of pizza doesn't exist: " + name);
        }
        pizza.name += "Style Strasbourg";
        pizza.garnitures.add("Mozzarella");
        return pizza;
    }
}
