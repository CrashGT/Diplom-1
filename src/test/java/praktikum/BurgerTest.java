package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    Burger burger = new Burger();

    @Mock
    Bun mockBunFirst;
    @Mock
    Bun getMockBunSecond;

    @Mock
    Ingredient mockIngredientFirst;
    @Mock
    Ingredient mockIngredientSecond;

    @Test
    public void shouldGetPriceFirstBurger() {
        Mockito.when(mockBunFirst.getPrice()).thenReturn(100F);
        burger.setBuns(mockBunFirst);

        Mockito.when(mockIngredientFirst.getPrice()).thenReturn(200F);
        // Mockito.when(mockIngredientFirst.getType()).thenReturn(IngredientType.SAUCE);
        burger.addIngredient(mockIngredientFirst);

        float expectedPrice = 400F;
        float actualPrice = burger.getPrice();

        assertEquals("Price first burger is incorrect", expectedPrice, actualPrice, 0);
    }

    @Test
    public void shouldGetPriceSecondBurger() {
        Mockito.when(getMockBunSecond.getPrice()).thenReturn(200F);
        burger.setBuns(getMockBunSecond);

        Mockito.when(mockIngredientFirst.getPrice()).thenReturn(200F);

        Mockito.when(mockIngredientSecond.getPrice()).thenReturn(300F);

        burger.addIngredient(mockIngredientFirst);
        burger.addIngredient(mockIngredientSecond);
        burger.moveIngredient(0, 1);
        burger.removeIngredient(1);
        burger.addIngredient(mockIngredientFirst); // добавил снова так как мокито ругается что я не использую ингридиент при получении цены - возникает ошибка при общем тестировании

        float expectedPrice = 900F;
        float actualPrice = burger.getPrice();

        assertEquals("Price second burger is incorrect", expectedPrice, actualPrice, 0);
    }
}