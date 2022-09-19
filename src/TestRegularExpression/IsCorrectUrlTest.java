package TestRegularExpression;

import Libraries.RegularExpression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Тестирование проверки Url.
 * */
public class IsCorrectUrlTest {
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
    public void IsCorrectUrl_ThrowsException_WithNull() {
        RegularExpression.IsCorrectUrl(null);
    }

    /**
     * Тестирование работы с пустой строкой.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void IsCorrectUrl_ThrowsException_WithEmptyString() {
        RegularExpression.IsCorrectUrl("");
    }

    /**
     * Тестирование на некорректных данных.
     * */
    @Test
    public void IsCorrectUrl_ReturnsFalse_WithIncorrectValues() {
        testData.incorrectUrlExamples.forEach(
            (str) -> Assert.assertFalse(RegularExpression.IsCorrectUrl(str))
        );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void IsCorrectUrl_ReturnsTrue_WithCorrectValues() {
        testData.correctUrlExamples.forEach(
            (str) ->  Assert.assertTrue(RegularExpression.IsCorrectUrl(str))
        );
    }
}
