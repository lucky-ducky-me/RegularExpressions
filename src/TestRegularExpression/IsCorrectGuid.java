package TestRegularExpression;

import Libraries.RegularExpression;
import org.junit.*;

/**
 * Тестирование проверки Guid.
 * */
public class IsCorrectGuid {
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
        testData.incorrectGuidExamples.forEach(
                (str) -> Assert.assertFalse(RegularExpression.IsCorrectGuid(str))
        );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void IsCorrectGuid_ReturnsTrue_WithCorrectValues() {
        testData.correctGuidExamples.forEach(
                (str) -> Assert.assertTrue(RegularExpression.IsCorrectGuid(str))
        );
    }
}
