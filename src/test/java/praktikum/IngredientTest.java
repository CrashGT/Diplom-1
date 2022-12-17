package praktikum;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IngredientTest {

    IngredientType ingredientType_1 = IngredientType.SAUCE;
    IngredientType ingredientType_2 = IngredientType.FILLING;
    IngredientType ingredientType_3 = null;

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