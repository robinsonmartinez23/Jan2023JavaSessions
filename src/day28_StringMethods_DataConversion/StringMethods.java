package day28_StringMethods_DataConversion;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "This is my java code"; // 0-19
        int l = s.length();
        System.out.println(l);
        System.out.println(s.charAt(0)); // T
        System.out.println(s.charAt(19)); //e
        //System.out.println(s.charAt(20)); // StringIndexOutOfBoundsException
        //System.out.println(s.charAt(-1)); // StringIndexOutOfBoundsException
        System.out.println("-------------");
        System.out.println(s.indexOf('T')); // index 0
        System.out.println(s.indexOf('i')); // index 2, 1st occurrence
        System.out.println(s.indexOf('i', 3)); // index 5 2nd occurrence
        System.out.println(s.indexOf('i', s.indexOf('i') + 1));
        System.out.println("-------------");
        System.out.println(s.indexOf("java")); // 11
        System.out.println(s.indexOf("testing")); //-1
        System.out.println("-------------");
        String msg = "welcome admin";
        if (msg.indexOf("admin") == 8) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("-------------");
        String test = "   hello world  ";
        System.out.println(test.trim());
        System.out.println("-------------");
        String t = "Hello this is a java code";
        System.out.println(t.toUpperCase());
        System.out.println(t.toLowerCase());
        String dob = "01-01-1990";
        System.out.println(dob.replace('-', '/'));
        String h = " Hello world   ";
        System.out.println(h.replace(" ", ""));
        System.out.println("-------------");
        String st = "hello world";
        String st1 = "hello world";
        System.out.println(st.equals(st1)); // true  NOTE: Never use == to compare 2 Strings
        String str = "Hello world";
        String str1 = "hello WorlD";
        System.out.println(str.equalsIgnoreCase(str1)); // true
        System.out.println("-------------");
        String browser = " Chrome";
        if (browser.trim().equalsIgnoreCase("chrome")) {
            System.out.println("PASS");
        }
        System.out.println("-------------");
        String p = "this is selenium testing";
        System.out.println(p.contains("selenium"));
        System.out.println("-------------");
        String lang = "JAVA_PYTHON_DOTNET_RUBY";
        String r[] = lang.split("_");
        System.out.println(r[0]);
        System.out.println(r[1]);
        System.out.println(Arrays.toString(r));
        System.out.println("-------------");
        String pop = "xXseleniumxXXtestingXxXJavaXXxpythonX";
        String r1[] = pop.split("xX");
        System.out.println(Arrays.toString(r1));//[,selenium, XtestingX, JavaXXxpythonX]
        System.out.println("-------------");
        String empInfo = "Robin|Martinez|Caracas|43|IBM|SDET";
        String emp[] = empInfo.split("\\|");
        for (String each: emp) {
            System.out.println(each);
        }
        System.out.println("------PARSE-------");
        String x = "100";
        System.out.println(x+20); // 10020
        int i = Integer.parseInt(x);
        System.out.println(i+20); // 120

        String v = "12.45";
        System.out.println(v+10); // 12.4510
        double d1 = Double.parseDouble(v);
        System.out.println(d1+10);
        System.out.println("------VALUE OF-------");
        int k = 100;
        System.out.println(k+20);  // 120
        String k1 = String.valueOf(k);
        System.out.println(k1+20); // 10020

        System.out.println("-----------------");
        String flag = "true";
        boolean bl = Boolean.parseBoolean(flag); // true
        if(bl){
            System.out.println("PASS");
        }

    }
}
