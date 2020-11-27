import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures;

	public Pizza(String style, String type) {
		this.name = "Pizza Style " + style + " with " + type;
		this.garnitures = new ArrayList<>();
	}


	public void prepare() {
		System.out.println("Preparation of " + this.name);
		System.out.println("Spread the " + this.crust + " pizza dough...");
		System.out.println("Add the " + this.sauce + " sauce...");
		System.out.println("Add the garnitures:");
		for (String garniture : garnitures) {
			System.out.println(" " + garniture);
		}
	}

	public void bake() {
		System.out.println("Bake 25 minutes at 180 degrees");
	}

	public void cut() {
		System.out.println("Cut the pizza in triangles");
	}

	public void wrap() {
		System.out.println("Put the pizza in the official box");
	}

	public String getName(){
		return this.name;
	}
}
