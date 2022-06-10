package lesson1602;

import java.util.Locale;

public class Test {
    Helper helper = new Helper();

    public void m1(String a, int b) {
        System.out.println(a.toLowerCase(Locale.ROOT));
        helper.say();
        int c = Integer.parseInt(a)+b;
        System.out.println(c);
        helper.check(c);
        System.out.println(c/b);
        helper.say();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(b/c);

    }
}
