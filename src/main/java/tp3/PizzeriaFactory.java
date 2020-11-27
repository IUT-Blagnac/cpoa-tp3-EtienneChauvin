package tp3;

import tp3.pizzerias.PizzaFactoryBrest;
import tp3.pizzerias.PizzaFactoryStrasbourg;
import tp3.pizzerias.PizzeriaBrest;
import tp3.pizzerias.PizzeriaStrasbourg;

public class PizzeriaFactory {

    private static PizzeriaFactory uniqueInstance;

    private PizzeriaFactory() { };


    public Pizzeria create(String type){
        Pizzeria pizzeria = null;
        switch (type) {
            case "Brest":
                pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
                break;
        }
        return pizzeria;
    }

    public static synchronized PizzeriaFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzeriaFactory();
        }
        return uniqueInstance;
    }
}