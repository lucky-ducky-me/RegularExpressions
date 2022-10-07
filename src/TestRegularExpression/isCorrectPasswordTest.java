package TestRegularExpression;

import Libraries.RegularExpression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Тестирование проверки пароля.
 * */
public class isCorrectPasswordTest {

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
    public void isCorrectUrl_ThrowsException_WithNull() {
        RegularExpression.isCorrectPassword(null);
    }

    /**
     * Тестирование работы с пустой строкой.
     * */
    @Test(expected = IllegalArgumentException.class)
    public void isCorrectUrl_ThrowsException_WithEmptyString() {
        RegularExpression.isCorrectPassword("");
    }

    /**
     * Тестирование на некорректных данных.
     * */
    @Test
    public void isCorrectPassword_ReturnsFalse_WithIncorrectValues() {
        testData.incorrectPasswordExamples.forEach(
            (str) -> Assert.assertFalse(RegularExpression.IsCorrectUrl(str))
        );
    }

    /**
     * Тестирование на корректных данных.
     * */
    @Test
    public void isCorrectPassword_ReturnsTrue_WithCorrectValues() {
        testData.correctPasswordExamples.forEach(
            (str) ->  Assert.assertTrue(RegularExpression.isCorrectPassword(str))
        );
    }
}
