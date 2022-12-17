package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {

    Bun bun_1 = new Bun("black bun", 100);
    Bun bun_2 = new Bun("", 0);
    Bun bun_3 = new Bun(null, -1);
    Bun bun_4 = new Bun("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3.4e+38f);
    Bun bun_5 = new Bun("!@#$%", 3.4e-38f);

    @Test
    public void shouldGetNameFirstBun() {
        String expected = "black bun";
        String actual = bun_1.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPriceFirstBun() {
        float expected = 100;
        float actual = bun_1.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }

    @Test
    public void shouldGetNameSecondBun() {
        String expected = "";
        String actual = bun_2.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPriceSecondBun() {
        float expected = 0;
        float actual = bun_2.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }

    @Test
    public void shouldGetNameThirdBun() {
        String actual = bun_3.getName();
        assertNull("Name bun is incorrect", actual);
    }

    @Test
    public void getPriceThirdBun() {
        float expected = -1;
        float actual = bun_3.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }

    @Test
    public void shouldGetNameFourthBun() {
        String expected ="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String actual = bun_4.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPriceFourthBun() {
        float expected = 3.4e+38f;
        float actual = bun_4.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }

    @Test
    public void shouldGetNameFifthBun() {
        String expected ="!@#$%";
        String actual = bun_5.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPriceFifthBun() {
        float expected = 3.4e-38f;
        float actual = bun_5.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }
}