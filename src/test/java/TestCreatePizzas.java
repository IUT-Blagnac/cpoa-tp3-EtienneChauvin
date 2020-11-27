import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;


public class TestCreatePizzas {
    @Test
    public void shallCreateAPizzaCheeseStyleStrasbourg() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza pizza = boutiqueStrasbourg.orderPizza("cheese");
        assertThat(pizza, instanceOf(PizzaCheeseStyleStrasbourg.class));
    }

    @Test
    public void shallCreateAPizzaGrecqueStyleStrasbourg() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza pizza = boutiqueStrasbourg.orderPizza("grecque");
        assertThat(pizza, instanceOf(PizzaGrecqueStyleStrasbourg.class));
    }

    @Test
    public void shallCreateAPizzaPoivronStyleStrasbourg() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza pizza = boutiqueStrasbourg.orderPizza("poivron");
        assertThat(pizza, instanceOf(PizzaPoivronStyleStrasbourg.class));
    }

    @Test
    public void shallCreateAPizzaCheeseStyleBrest() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza pizza = boutiqueBrest.orderPizza("cheese");
        assertThat(pizza, instanceOf(PizzaCheeseStyleBrest.class));
    }

    @Test
    public void shallCreateAPizzaGrecqueStyleBrest() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza pizza = boutiqueBrest.orderPizza("grecque");
        assertThat(pizza, instanceOf(PizzaGrecqueStyleBrest.class));
    }

    @Test
    public void shallCreateAPizzaPoivronStyleBrest() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza pizza = boutiqueBrest.orderPizza("poivron");
        assertThat(pizza, instanceOf(PizzaPoivronStyleBrest.class));
    }
}
