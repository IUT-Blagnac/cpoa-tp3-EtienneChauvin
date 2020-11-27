/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaPoivronStyleStrasbourg extends Pizza {
    public PizzaPoivronStyleStrasbourg() {
        super("Strasbourg", "poivron");
        garnitures.add("Pepper");
        garnitures.add("Onion");
        garnitures.add("Beef");
        crust = "crispy";
        sauce = "bbq";
    }
}
