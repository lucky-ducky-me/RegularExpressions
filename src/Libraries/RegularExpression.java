package Libraries;

import java.util.regex.*;

/**
 * Проверка регулярных выражений.
 * */
public class RegularExpression {

    /**
     * Проверка коректности Ip адреса.
     * @param ip проверяемый Ip.
     * @return Результат проверки в виде логического значения.
     * */
    public static Boolean IsCorrectIp(String ip) {
        validateString(ip);

        var ipPattern = Pattern.compile("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})");

        if (!ipPattern.matcher(ip).matches()) {
            return false;
        }

        var separatorPattern = Pattern.compile("[.]");

        var nums = separatorPattern.split(ip);

        var minValue = 0;

        var maxValue = 255;

        for (var num : nums) {
            var numIntValue = Integer.parseInt(num);

            if (numIntValue < minValue
                    || numIntValue > maxValue) {
                return false;
            }
        }

        return true;
    }

    /**
     * Проверка коректности Guid.
     * @param guid проверяемый Guid.
     * @return Результат проверки в виде логического значения.
     * */
    public static Boolean IsCorrectGuid(String guid) {
        validateString(guid);

        var guidPattern = Pattern.compile("[0-9a-zA-Z]{8}-" +
                "[0-9a-zA-Z]{4}-" +
                "[0-9a-zA-Z]{4}-" +
                "[0-9a-zA-Z]{4}-" +
                "[0-9a-zA-Z]{12}");

        return guidPattern.matcher(guid).matches();
    }

    /**
     * Проверка коректности Url.
     * @param url проверяемый Url.
     * @return Результат проверки в виде логического значения.
     * */
    public static Boolean IsCorrectUrl(String url) {
        validateString(url);

        var urlPattern = Pattern.compile("(http(s)?://)?" +
                "([a-zA-Z0-9]{2,63}\\.)+[a-zA-Z0-9]{2,63}(:\\d+)?" +
                "(/[a-z\\-.A-Z_0-9]+)*" +
                "(\\?([a-zA-Z\\-_0-9]+=[a-zA-Z0-9]+&)*[a-zA-Z\\-_0-9]+=[a-zA-Z0-9]+)?" +
                "(#[a-zA-Z0-9]{2,})?");

        return urlPattern.matcher(url).matches();
    }

    /**
     * Проверка коректности пароля.
     * @param password проверяемый пароль.
     * @return Результат проверки в виде логического значения.
     * */
    public static Boolean isCorrectPassword(String password) {
        validateString(password);

        var passwordPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z_\\d]{8,}$");

        return passwordPattern.matcher(password).matches();
    }

    /**
     * Валидация строки.
     * @param str валидируемая строка.
     */
    private static void validateString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Передано неопределённое значение.");
        }

        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Передано пустое значение строки.");
        }
    }
}
