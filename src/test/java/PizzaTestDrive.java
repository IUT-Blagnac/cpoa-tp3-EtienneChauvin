import org.junit.Test;

public class PizzaTestDrive {

    public static void main(String[] args) {
        new PizzaTestDrive().shallCookPizzas();
    }

    @Test
    public void shallCookPizzas() {
        new Main().cookPizzas();
    }
}