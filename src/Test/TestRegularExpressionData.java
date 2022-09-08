package Test;

import java.util.ArrayList;

/**
 * Данные для тестирования регулярных выражений.
 * */
public class TestRegularExpressionData {

    /**
     * Некорректные данные для проверки Ip.
     * */
    public ArrayList<String> stringIpIncorrectExamples = new ArrayList<>();
    {
        stringIpIncorrectExamples.add("111.111.111.1111");
        stringIpIncorrectExamples.add("abc.def.gha.bcd");
        stringIpIncorrectExamples.add("111.111.111.311");
        stringIpIncorrectExamples.add("1300.6.7.8");
        stringIpIncorrectExamples.add("0.0.0.2222");
        stringIpIncorrectExamples.add("100.1.100");
    }

    /**
     * Корректные данные для проверки Ip.
     * */
    public ArrayList<String> stringIpCorrectExamples = new ArrayList<>();
    {
        stringIpCorrectExamples.add("111.111.111.111");
        stringIpCorrectExamples.add("127.0.0.1");
        stringIpCorrectExamples.add("255.255.255.0");
        stringIpCorrectExamples.add("0.0.0.0");
        stringIpCorrectExamples.add("1.1.1.1");
        stringIpCorrectExamples.add("6.16.166.225");
    }
}
