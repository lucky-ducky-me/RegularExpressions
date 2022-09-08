package Test;

import Libraries.RegularExpression;
import org.junit.*;

/**
 * Тестирование проверки Ip.
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
     * Тестирование работы с неопределённым значением.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectIp_ThrowsException_WithNull() {
        RegularExpression.IsCorrectIp(null);
    }

    /**
     * Тестирование работы с пустой строкой.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectIp_ThrowsException_WithEmptyString() {
        RegularExpression.IsCorrectIp("");
    }

    /**
     * Тестирование на некорректных данных.
     * */
    @Test
    public void IsCorrectIp_ReturnsFalse_WithIncorrectValues() {
       testRegularExpressionData.incorrectIpExamples.forEach(
               (str) -> Assert.assertFalse(RegularExpression.IsCorrectIp(str))
       );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void IsCorrectIp_ReturnsTrue_WithCorrectValues() {
        testRegularExpressionData.correctIpExamples.forEach(
                (str) -> Assert.assertTrue(RegularExpression.IsCorrectIp(str))
        );
    }
}
