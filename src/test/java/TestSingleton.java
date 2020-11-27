import static org.junit.Assert.*;
import org.junit.Test;

public class TestSingleton {
    @Test
    public void twoPizzeriaFactoriesShallBeTheSameInstance() {
        PizzeriaFactory pizzeriaFactory1 = PizzeriaFactory.getInstance();
        PizzeriaFactory pizzeriaFactory2 = PizzeriaFactory.getInstance();
        pizzeriaFactory1.create("Brest");
        pizzeriaFactory2.create("Strasbourg");
        assertSame(pizzeriaFactory1, pizzeriaFactory2);
    }

    @Test
    public void twoPizzaFactoriesBrestShallBeTheSameInstance() {
        PizzaFactoryBrest pizzaFactoryBrest1 = PizzaFactoryBrest.getInstance();
        PizzaFactoryBrest pizzaFactoryBrest2 = PizzaFactoryBrest.getInstance();
        pizzaFactoryBrest1.create("cheese");
        pizzaFactoryBrest2.create("poivron");
        assertSame(pizzaFactoryBrest1, pizzaFactoryBrest2);
    }

    @Test
    public void twoPizzaFactoriesStrasbourgShallBeTheSameInstance() {
        PizzaFactoryStrasbourg pizzaFactoryStrasbourg1 = PizzaFactoryStrasbourg.getInstance();
        PizzaFactoryStrasbourg pizzaFactoryStrasbourg2 = PizzaFactoryStrasbourg.getInstance();
        pizzaFactoryStrasbourg1.create("grecque");
        pizzaFactoryStrasbourg2.create("cheese");
        assertSame(pizzaFactoryStrasbourg1, pizzaFactoryStrasbourg2);
    }
}
