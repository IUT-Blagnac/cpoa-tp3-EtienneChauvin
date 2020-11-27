import org.junit.Test;
import org.junit.jupiter.api.Tag;
import tp3.Pizza;
import tp3.Pizzeria;
import tp3.PizzeriaFactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        new PizzaTestDrive().shallCookPizzas();
    }

    @Test
    public void shallCookPizzas() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");

        Pizza pizza = boutiqueBrest.orderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = boutiqueStrasbourg.orderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");
    }
}