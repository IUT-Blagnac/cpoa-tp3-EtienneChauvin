package tp3;

import tp3.pizzas.PizzaCheeseStyleStrasbourg;
import tp3.pizzas.PizzaGrecqueStyleStrasbourg;
import tp3.pizzas.PizzaPoivronStyleStrasbourg;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PizzaFactoryStrasbourg extends tp3.PizzaFactory {

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
        return pizza;
    }
}
