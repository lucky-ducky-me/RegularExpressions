package Test;

import Libraries.RegularExpression;
import org.junit.*;

/**
 * Тестирование проверки Guid.
 * */
public class Test_RegularExpression_IsCorrectGuid {
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
    public void IsCorrectGuid_ThrowsException_WithNull() {
        RegularExpression.IsCorrectGuid(null);
    }

    /**
     * Тестирование работы с пустой строкой.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectGuid_ThrowsException_WithEmptyString() {
        RegularExpression.IsCorrectGuid("");
    }

    /**
     * Тестирование на некорректных данных.
     * */
    @Test
    public void IsCorrectGuid_ReturnsFalse_WithIncorrectValues() {
        testRegularExpressionData.incorrectGuidExamples.forEach(
                (str) -> Assert.assertFalse(RegularExpression.IsCorrectGuid(str))
        );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void IsCorrectGuid_ReturnsTrue_WithCorrectValues() {
        testRegularExpressionData.correctGuidExamples.forEach(
                (str) -> Assert.assertTrue(RegularExpression.IsCorrectGuid(str))
        );
    }
}
