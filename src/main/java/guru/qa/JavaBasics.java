package guru.qa;

public class JavaBasics {

    public static void main(String args[]) {
        arithmetic();
        compare();
        logic();
        onemorelogic();
        codewithif();
        minandmax();
        operations();
    }

    static void arithmetic() {

        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println("a + b = " + (a + b)); // + сложение
        System.out.println("b - a = " + (b - a)); // - вычитание
        System.out.println("a * b = " + (a * b)); // умножение
        System.out.println("b / a = " + (b / a)); // / деление (целочисленное!)
        System.out.println("c % b = " + (c % b)); // % взятие остатка от деления

    }

    static void compare() {

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b)); // == равно
        System.out.println("a != b = " + (a != b)); // != не равно
        System.out.println("a > b = " + (a > b)); // > больше
        System.out.println("a < b = " + (a < b)); // < меньше
        System.out.println("b >= a = " + (b >= a)); // >= больше или равно
        System.out.println("b <= a = " + (b <= a)); // <= меньше или равно
    }

    static void logic() {

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b)); // & И (&&)
        System.out.println("a || b = " + (a || b)); // | Или (||)
        System.out.println("!(a && b) = " + !(a && b)); // ! Отрицание
    }

    static void onemorelogic() {

        String name = "Алина";
        boolean result = name instanceof String; //instanceof
        System.out.println(result);
    }

    static void codewithif() {

        byte aByte = 127;

        if (aByte <= 127) {
            System.out.println("Это байт");
        } else {
            System.out.println("Переполнение в большую сторону");
        }
    }

    static void minandmax() {

        int aInt = 2147483647;
        System.out.println("aInt + 2 = " + (aInt + 2));

        int bInt = -2147483648;
        System.out.println("bInt - 2 = " + (bInt - 2));

    }

    static void operations() {

        short aShort = 10000;
        int aInt = 10000;
        System.out.println("aInt + aShort = " + (aInt + aShort));

        float aFloat = 4222.812F;
        double aDouble = 222.812D;
        System.out.println("aFloat - aDouble = " + (aFloat - aDouble));

    }
}

