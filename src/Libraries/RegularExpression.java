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
        if (ip == null) {
            throw new IllegalArgumentException("Передано неопределённое значение.");
        }

        if (ip.trim().isEmpty()) {
            throw new IllegalArgumentException("Передано пустое значение строки.");
        }

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
}