package tp3;

import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	public String name = "Pizza ";
	protected String crust;
	protected String sauce;
	public ArrayList<String> garnitures = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparation of " + this.name);
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
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
		System.out.println("Put the tp3.Pizza in the official box");
	}

	public String getName(){
		return this.name;
	}
}
