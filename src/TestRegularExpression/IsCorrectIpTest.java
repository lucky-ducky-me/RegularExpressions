package TestRegularExpression;

import Libraries.RegularExpression;
import org.junit.*;

/**
 * Тестирование проверки Ip.
 * */
public class IsCorrectIpTest {

    /**
     * Данные для тестирования.
     * */
    public TestData testData;

    /**
     * Инициализация данных для тестирования.
     * */
    @Before
    public void InitializeTestData() {
        testData = new TestData();
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
       testData.incorrectIpExamples.forEach(
               (str) -> Assert.assertFalse(RegularExpression.IsCorrectIp(str))
       );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void IsCorrectIp_ReturnsTrue_WithCorrectValues() {
        testData.correctIpExamples.forEach(
                (str) -> Assert.assertTrue(RegularExpression.IsCorrectIp(str))
        );
    }
}
