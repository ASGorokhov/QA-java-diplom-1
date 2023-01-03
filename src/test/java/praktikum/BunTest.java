package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class BunTest {

     private final String name;
     private final float price;
     private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Before
    public void setUp() {
        bun = new Bun(name, price);
    }

    @Parameterized.Parameters(name = "Name = {0}, Price = {1}")
    public static Object[][] getDataBun() {
        return new Object[][] {
                {"Флюоресцентная булка R2-D3",988.99f},
                {"Краторная булка N-200i",1255.99f},
        };
    }

    @Test
    public void getNameTest() {
        assertEquals("Название булочки не соответствует ожидаемому значению!", name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        assertEquals("Цена булочки не соответствует ожидаемому значению!", price, bun.getPrice(),0);
    }
}
