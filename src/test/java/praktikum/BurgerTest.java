package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    Burger burger = new Burger();

    @Mock
    private Bun mockBunFirst;
    @Mock
    private Bun getMockBunSecond;
    @Mock
    private Ingredient mockIngredientFirst;
    @Mock
    private Ingredient mockIngredientSecond;

    @Test
    public void shouldGetPriceFirstBurger() {
        Mockito.when(mockBunFirst.getPrice()).thenReturn(100F);
        burger.setBuns(mockBunFirst);
        Mockito.when(mockIngredientFirst.getPrice()).thenReturn(200F);
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