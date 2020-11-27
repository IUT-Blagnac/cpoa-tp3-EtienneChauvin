/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecqueStyleStrasbourg extends Pizza {
    public PizzaGrecqueStyleStrasbourg() {
        super("Strasbourg", "grecque");
        garnitures.add("Aubergine");
        garnitures.add("Lamb");
        crust = "thin";
        sauce = "tzatzíki";
    }
}
