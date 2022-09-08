package Test;

import Libraries.RegularExpression;
import org.junit.*;

/**
 * Тестирование регулярных выражений.
 * */
public class Test_RegularExpression_IsCorrectIp {

    /**
     * Данные для тестирования.
     * */
    public TestRegularExpressionData testRegularExpressionData;

    /**
     * Инициализация данных для тестирования.
     * */
    @Before
    public void InitializeTestData() {
        testRegularExpressionData = new TestRegularExpressionData();
    }

    /**
     * Проверка работы с неопределённым значением.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectIp_ThrowsException_WithNull() throws Exception {
        RegularExpression.IsCorrectIp(null);
    }

    /**
     * Проверка работы с пустой строкой.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectIp_ThrowsException_WithEmptyString() throws Exception {
        RegularExpression.IsCorrectIp("");
    }

    /**
     * Проверка на некорректных данных.
     * */
    @Test
    public void IsCorrectIp_ReturnsFalse_WithIncorrectValues() {
       testRegularExpressionData.stringIpIncorrectExamples.forEach(
               (str) -> Assert.assertFalse(RegularExpression.IsCorrectIp(str))
       );
    }

    /**
     * Проверка на корректных данных.
     * */
    @Test
    public void IsCorrectIp_ReturnsTrue_WithCorrectValues() {
        testRegularExpressionData.stringIpCorrectExamples.forEach(
                (str) -> Assert.assertTrue(RegularExpression.IsCorrectIp(str))
        );
    }
}
