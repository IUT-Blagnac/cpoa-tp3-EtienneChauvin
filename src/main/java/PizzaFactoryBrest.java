public class PizzaFactoryBrest extends PizzaFactory {

    private static PizzaFactoryBrest uniqueInstance;

    private PizzaFactoryBrest() {
    }

    public static PizzaFactoryBrest getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactoryBrest();
        }
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name) {
        Pizza pizza;
        switch (name) {
            case "cheese":
                pizza = new PizzaCheeseStyleBrest();
                break;
            case "grecque":
                pizza = new PizzaGrecqueStyleBrest();
                break;
            case "poivron":
                pizza = new PizzaPoivronStyleBrest();
                break;
            default:
                throw new IllegalArgumentException("Sorry, this type of pizza doesn't exist: " + name);
        }
        return pizza;
    }
}
