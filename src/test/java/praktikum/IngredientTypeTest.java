package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IngredientTypeTest {
    private IngredientType ingredientType_1 = IngredientType.SAUCE;
    private IngredientType ingredientType_2 = IngredientType.FILLING;
    private IngredientType ingredientType_3 = null;

    @Test
    public void shouldGetTypeFirstIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType_1, "white bun", 200);
        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();
        assertEquals("Type ingredient is incorrect", expectedType, actualType);
    }

    @Test
    public void shouldGetTypeSecondIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType_2, "white bun", 200);
        IngredientType expectedType = IngredientType.FILLING;
        IngredientType actualType = ingredient.getType();
        assertEquals("Type ingredient is incorrect", expectedType, actualType);
    }

    @Test
    public void shouldGetTypeThirdIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType_3, "white bun", 200);
        IngredientType actualType = ingredient.getType();
        assertNull("Type ingredient is incorrect", actualType);
    }
}
