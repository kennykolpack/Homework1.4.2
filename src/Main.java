public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задача 1
        System.out.println("Задача 1");
        int amount = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + amount;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
        // Задача 2
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println("\n");
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        // Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int mortalityRatePerThousand = 8;
        for (int i = 1; i <= 10; i++) {
            int birthRate = birthRatePerThousand * (population / 1000);
            int mortalityRate = mortalityRatePerThousand * (population / 1000);
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задача 1
        System.out.println("Задача 1");
        int total1 = 0;
        int amount1 = 15000;
        for (int i = 1; i <= 60; i++) {
            total1 = total1 + total1 * 7 / 100;
            total1 = total1 + amount1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1);
        }
        // Задача 2
        System.out.println("Задача 2");
        int total2 = 0;
        int amount2 = 15000;
        for (int i = 1; i <= 60; i++) {
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + amount2;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total2);
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        int total3 = 0;
        int amount3 = 15000;
        for (int i = 1; i <= 108; i++) {
            total3 = total3 + total3 * 7 / 100;
            total3 = total3 + amount3;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total3);
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        int friday = 7;
        for (int i = 1; i < 31; i++) {
            if (i % friday == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        int year1 = 1822;
        int year2 = 2122;
        for (int i = 0; i <= 2122; i = i + 79) {
            if (i > year1 && i < year2) {
                System.out.println(i);
            }
        }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 1; i <= 10; i++) {
            int two = 2 * i;
            System.out.println("2 * " + i + " = " + two);
        }
    }
}