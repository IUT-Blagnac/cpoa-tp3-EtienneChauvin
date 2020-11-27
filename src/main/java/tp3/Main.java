package tp3;

public class Main {
    public static void main(String[] args) {
        new Main().cookPizzas();
    }

    public void cookPizzas() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");

        Pizza pizza = boutiqueBrest.orderPizza("cheese");
        System.out.println("JMB has ordered a " + pizza.getName() + "\n");

        pizza = boutiqueStrasbourg.orderPizza("cheese");
        System.out.println("JMI has ordered a " + pizza.getName() + "\n");
    }
}
