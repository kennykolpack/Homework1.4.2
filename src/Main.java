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
            total += amount;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
        // Задача 2
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
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
        total = 0;
        amount = 15000;
        for (int i = 1; i <= 60; i++) {
            total += total * 7 / 100;
            total += amount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        // Задача 2
        System.out.println("Задача 2");
        total = 0;
        amount = 15000;
        for (int i = 1; i <= 60; i++) {
            total += total * 7 / 100;
            total += amount;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        total = 0;
        amount = 15000;
        for (int i = 1; i <= 108; i++) {
            total += total * 7 / 100;
            total += amount;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int friday = 5; friday < 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        for (int year = 0; year <= 2122; year += 79) {
            if (year > 1822 && year < 2122) {
                System.out.println(year);
            }
        }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 1; i <= 10; i++) {
            int solution = 2 * i;
            System.out.println("2 * " + i + " = " + solution);
        }
    }
}