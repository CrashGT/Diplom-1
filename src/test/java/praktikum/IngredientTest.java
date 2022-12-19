package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private IngredientType ingredientType_1 = IngredientType.SAUCE;

    @Test
    public void shouldGetName() {
        Ingredient ingredient = new Ingredient(ingredientType_1, "white bun", 200);
        String expectedName = "white bun";
        String actualName = ingredient.getName();
        assertEquals("Name ingredient is incorrect", expectedName, actualName);
    }

    @Test
    public void shouldGetPrice() {
        Ingredient ingredient = new Ingredient(ingredientType_1, "red bun", 300);
        float expectedPrice = 300;
        float actualPrice = ingredient.getPrice();
        assertEquals("Price ingredient is incorrect", expectedPrice, actualPrice, 0);
    }
}