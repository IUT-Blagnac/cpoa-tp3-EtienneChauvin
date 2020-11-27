import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TestCreatePizzerias {
    @Test
    public void shallCreateAPizzeriaStrasbourg() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        assertThat(boutiqueStrasbourg, instanceOf(PizzeriaStrasbourg.class));
    }

    @Test
    public void shallCreateAPizzeriaBrest() {
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Brest");
        assertThat(boutiqueStrasbourg, instanceOf(PizzeriaBrest.class));
    }
}
