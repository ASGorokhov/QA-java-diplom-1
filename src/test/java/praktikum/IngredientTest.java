package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IngredientTest {

    private IngredientType ingredientType;
    private String ingredientName;
    private float ingredientPrice;
    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredientType = IngredientType.SAUCE;
        ingredientName = "Соус традиционный галактический";
        ingredientPrice = 14.99f;
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals("Тип ингредиента не соответствует ожидаемому результату!",
                ingredientType, ingredient.getType());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Название ингредиента не соответствует ожидаемому результату!",
                ingredientName, ingredient.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals("Цена ингредиента не соответствует ожидаемому результату!",
                ingredientPrice, ingredient.getPrice(), 0);
    }
}