package guru.qa;

public class JavaBasics {

    public static void main(String args[]) {
        arithmetic();
        compare();
        logic();
        onemorelogic();
        code();
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
        boolean result = name instanceof String;
        System.out.println(result);
    }

    static void code() {

        String aString = "Dima";

        if (aString.equals("Dima")) {
            if (aString.length() == 5) {
                System.out.println("Hi, " + aString);
            }

        } else if (aString.equals("Alex")) {
            System.out.println("Hi, " + aString);

        } else {
            System.out.println("Dosada");
        }
    }
}








//            if (aString.equals("Dima")) {
//                if (aString.length() == 5) {
//                    System.out.println("Hi, " + aString);
//                }
//            } else if (aString.equals("Alex")) {
//                System.out.println("Hi, " + aString);
//            } else {
//                System.out.println("Dosada");
//            }
//
//            switch (aString) {
//                case "Dima":
//                    System.out.println("Hi, " + aString);
//                    break;
//                case "Alex":
//                    System.out.println("Hi, " + aString);
//                    break;
//            }
//
//            aString = 3 > 2
//                    ? "Dima"
//                    : "Alex";
//
//            if (3 > 2) {
//                aString = "Dima";
//            } else {
//                aString = "Alex";
//            }
//
//
//            getMaxIntNumber();
//            System.out.println(summ(aByte, (int) aLong));
//        }
//
//
//        static void getMaxIntNumber() {
//            System.out.println("max value: " + Integer.MAX_VALUE);
//        }
//
//        static int summ(int first, int second) {
//            return first + second;
//        }
//    }
//
