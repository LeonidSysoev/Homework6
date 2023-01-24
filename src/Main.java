public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 0;
        int month = 0;
        while (money <= 2459000) {
            money = money + 15000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + " рублей.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year <= 10) {
            // population = population + (fertility * 1000 - mortality * 1000);
            population += population / 1000 * fertility - population / 1000 * mortality;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        double money = 15000;
        int month = 0;
        double percent = 0.07;
        while (money <= 12000000) {
            money += money * percent;
            month++;
            System.out.printf("Месяц %s сумма накоплений равна %.2f рублей.\n", month, money);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double money = 15000;
        int month = 0;
        double percent = 0.07;
        while (money <= 12000000) {
            money += money * percent;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s сумма накоплений равна %.2f рублей.\n", month, money);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double money = 15000;
        int month = 0;
        double percent = 0.07;
        while (month <= 9 * 12) {
            money += money * percent;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s сумма накоплений равна %.2f рублей.\n", month, money);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int numberDay = 6;
        while (numberDay <= 31) {
            System.out.println("Сегодня пятница " + numberDay + "-е число. Необходимо подготовить отчет.");
            numberDay += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023, pastYear = currentYear - 200, futureYear = currentYear + 100;
        for (int i = 0; i <= futureYear; i += 79) {
            if (i >= pastYear && i <= futureYear) {
                System.out.println(i);
            }
        }
    }
}
