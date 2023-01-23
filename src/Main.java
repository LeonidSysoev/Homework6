public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            population = population + (fertility * 1000 - mortality * 1000);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

    }
}