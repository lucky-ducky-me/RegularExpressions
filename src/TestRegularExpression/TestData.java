package TestRegularExpression;

import java.util.ArrayList;

/**
 * Данные для тестирования регулярных выражений.
 * */
public class TestData {

    /**
     * Некорректные данные для проверки Ip.
     * */
    public ArrayList<String> incorrectIpExamples = new ArrayList<>();
    {
        incorrectIpExamples.add("111.111.111.1111");
        incorrectIpExamples.add("abc.def.gha.bcd");
        incorrectIpExamples.add("111.111.111.311");
        incorrectIpExamples.add("1300.6.7.8");
        incorrectIpExamples.add("0.0.0.2222");
        incorrectIpExamples.add("100.1.100");
    }

    /**
     * Корректные данные для проверки Ip.
     * */
    public ArrayList<String> correctIpExamples = new ArrayList<>();
    {
        correctIpExamples.add("111.111.111.111");
        correctIpExamples.add("127.0.0.1");
        correctIpExamples.add("255.255.255.0");
        correctIpExamples.add("0.0.0.0");
        correctIpExamples.add("1.1.1.1");
        correctIpExamples.add("6.16.166.225");
    }

    /**
     * Некорректные данные для проверки Guid.
     * */
    public ArrayList<String> incorrectGuidExamples = new ArrayList<>();
    {
        incorrectGuidExamples.add("f7+8cddb-72b9-450e-b6d2-4a3a7f387d0b");
        incorrectGuidExamples.add("f768cddb_72b9-450e-b6d2-4a3a7f387d0b");
        incorrectGuidExamples.add("f768cddb72b9-450e-b6d2-4a3a7f387d0b");
        incorrectGuidExamples.add("f768cddb:72b9-450e-b6d2-4a3a7f387d0b");
        incorrectGuidExamples.add("e02fd0e4-00fd-090A-ca30-0d00a0038ba0f");
        incorrectGuidExamples.add("-e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
    }

    /**
     * Корректные данные для проверки Guid.
     * */
    public ArrayList<String> correctGuidExamples = new ArrayList<>();
    {
        correctGuidExamples.add("e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        correctGuidExamples.add("f768cddb-72b9-450e-b6d2-4a3a7f387d0b");
        correctGuidExamples.add("a997f9e7-946d-406b-942a-c9c4a423785c");
        correctGuidExamples.add("8AFF6F9E-D12B-44EE-B93C-12FCF5F7208B");
        correctGuidExamples.add("23b43d47-07b2-46a8-a13c-aef1842674e8");
        correctGuidExamples.add("06761fa2-7b5a-4453-805b-5a34b55b96e7");
    }

    /**
     * Некорректные данные для проверки Url.
     * */
    public ArrayList<String> incorrectUrlExamples = new ArrayList<>();
    {
        incorrectUrlExamples.add("htt://www.example.com");
        incorrectUrlExamples.add("httpss://www.example.com");
        incorrectUrlExamples.add("-www.example.com");
        incorrectUrlExamples.add("Just Text");
        incorrectUrlExamples.add("http://a.a.com");
        incorrectUrlExamples.add("http://_a._aa.com");
        incorrectUrlExamples.add("http://Aa.aa_.com");
        incorrectUrlExamples.add("http://-Aa.aa.com");
        incorrectUrlExamples.add("http://Aa.aa.com_");
        incorrectUrlExamples.add("http://Aa.aa.com##ancor1");
        incorrectUrlExamples.add("www.example.com?1arg1=test&arg2==test2");
    }

    /**
     * Корректные данные для проверки Url.
     * */
    public ArrayList<String> correctUrlExamples = new ArrayList<>();
    {
        correctUrlExamples.add("http://www.example.com");
        correctUrlExamples.add("https://www.example.com");
        correctUrlExamples.add("https://www.example.com:8888");
        correctUrlExamples.add("www.example.com");
        correctUrlExamples.add("www.example.com?arg2=test2");
        correctUrlExamples.add("http://Aa.aa.com");
        correctUrlExamples.add("http://Aa.aa.com#ancor1");
        correctUrlExamples.add("www.example.com?arg1=test1&arg2=test2");
        correctUrlExamples.add("hz.com/test/demo_form.php?name1=value1&name2=value2");
    }

    /**
     * Некорректные данные для проверки Url.
     * */
    public ArrayList<String> incorrectPasswordExamples = new ArrayList<>();
    {
        incorrectPasswordExamples.add("Cool_pass");
        incorrectPasswordExamples.add("C00l");
        incorrectPasswordExamples.add("supperpas1");
    }

    /**
     * Корректные данные для проверки Url.
     * */
    public ArrayList<String> correctPasswordExamples = new ArrayList<>();
    {
        correctPasswordExamples.add("C00l_Pass");
        correctPasswordExamples.add("SupperPas1");
    }


}
