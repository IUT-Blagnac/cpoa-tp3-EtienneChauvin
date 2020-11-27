import org.junit.Test;
import tp3.Main;

public class PizzaTestDrive {

    public static void main(String[] args) {
        new PizzaTestDrive().shallCookPizzas();
    }

    @Test
    public void shallCookPizzas() {
        new Main().cookPizzas();
    }
}