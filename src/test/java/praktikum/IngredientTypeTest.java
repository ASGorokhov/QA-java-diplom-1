package praktikum;

        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final String type;
    private final boolean expectedResult;

    public IngredientTypeTest(String type, boolean expectedResult) {
        this.type = type;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getDataIngredientType() {
        return new Object[][]{
                {"SAUCE", true},
                {"FILLING", true},
                {"BUN", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void ingredientTypeTest() {
        boolean actualResult = true;
        try {
            String actualType = IngredientType.valueOf(type).toString();
            Assert.assertEquals("Тип ингредиента не соответствует ожидаемому результату!", type, actualType);
        } catch (IllegalArgumentException | NullPointerException exception) {
            actualResult = false;
        }
        Assert.assertEquals("Тип ингредиента не соответствует ожидаемому результату!", expectedResult, actualResult);
    }
}