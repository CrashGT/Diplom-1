package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BurgerParameterizedTest {
    @Mock
    private int bunIndex;
    @Mock
    private int ingredientFirstIndexIndex;
    @Mock
    private String receipt;
    @Mock
    private int ingredientSecondIndex;

    public BurgerParameterizedTest(int bunIndex, int ingredientFirstIndexIndex, int ingredientSecondIndex, String receipt) {
        this.bunIndex = bunIndex;
        this.ingredientFirstIndexIndex = ingredientFirstIndexIndex;
        this.ingredientSecondIndex = ingredientSecondIndex;
        this.receipt = receipt;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0, 3, "(==== black bun ====)\r\n" + "= sauce hot sauce =\r\n" + "= filling cutlet =\r\n" + "(==== black bun ====)\r\n" + "\r\n" + "Price: 400,000000\r\n"},
                {1, 1, 4, "(==== white bun ====)\r\n" + "= sauce sour cream =\r\n" + "= filling dinosaur =\r\n" + "(==== white bun ====)\r\n" + "\r\n" + "Price: 800,000000\r\n"},
                {2, 2, 5, "(==== red bun ====)\r\n" + "= sauce chili sauce =\r\n" + "= filling sausage =\r\n" + "(==== red bun ====)\r\n" + "\r\n" + "Price: 1200,000000\r\n"},
        };
    }

    @Test
    public void shouldGetReceipt() {
        Database database = new Database();
        List<Bun> buns = database.availableBuns();
        List<Ingredient> ingredients = database.availableIngredients();
        Burger burger = new Burger();
        burger.setBuns(buns.get(bunIndex));
        burger.addIngredient(ingredients.get(ingredientFirstIndexIndex));
        burger.addIngredient(ingredients.get(ingredientSecondIndex));
        String actualReceipt = burger.getReceipt();
        String expectedReceipt = receipt;
        assertEquals("Receipt food is incorrect", expectedReceipt, actualReceipt);
    }
}