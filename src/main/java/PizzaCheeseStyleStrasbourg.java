public class PizzaCheeseStyleStrasbourg extends Pizza {
    public PizzaCheeseStyleStrasbourg() {
        super("Strasbourg", "cheese");
        garnitures.add("Mozzarella");
        garnitures.add("Gorgonzola");
        garnitures.add("Emmenthal");
        crust = "stuffed";
        sauce = "cream";
    }
    @Override
    public void cut() {
        System.out.println("Cut in square portions");
    }
}
