package school.redrover;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static String getString(String str) {

        return StringUtils.upperCase(str);
    }

    public static void main(String[] args) {
        System.out.println(getString("Funny"));
    }
}