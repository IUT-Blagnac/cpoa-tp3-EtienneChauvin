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
        return pizza;
    }
}
