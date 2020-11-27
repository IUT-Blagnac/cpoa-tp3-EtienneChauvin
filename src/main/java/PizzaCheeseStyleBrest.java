/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
    public PizzaCheeseStyleBrest() {
        super("Brest", "cheese");
        garnitures.add("Mozzarella");
        garnitures.add("Goat Cheese");
        garnitures.add("Edam");
        crust = "thick";
        sauce = "cream";
    }
}
