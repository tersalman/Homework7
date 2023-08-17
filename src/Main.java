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

    public static void task1 () {
        System.out.println("Задача 1");
         int accumulation = 15_000;
         int month = 0;
         int total = 0;
         while (total< 2_459_000){
             month +=1;
             total = total + accumulation;
             System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
         }
    }

    public static void task2 () {
        System.out.println("Задача 2");
         int number = 0;
         while (number <10){
             number++;
             System.out.print(number + " ");
         }
        System.out.println();
         number = 11;
         for (; number > 1;){
             number--;
             System.out.print(number + " ");

         }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int deathrate = 8;// on 1000 persons
        int birthrate = 17;//on 1000 persons
        long population = 12_000_000L;
        long thousandInTwentyMillions = population/ 1_000;
        long birthrateOnAllPopulation = birthrate * thousandInTwentyMillions;
        long deathrateOnAllPopulation = deathrate * thousandInTwentyMillions;

        for (int year = 1; year< 11; year++){
            population = population + birthrateOnAllPopulation - deathrateOnAllPopulation;
            System.out.println("Год"+ year + ", численность населения составляет" + population);
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total<15_000_000){
            total = total+ total/100 * 7;
            total+= salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total<15_000_000){
            total = total+ total/100 * 7;
            total+= salary;
            month++;
            if (month %6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int salary = 15_000;
        int total = 0;
        for (int month = 1; month<=108;month++){
            total = total+ total/100 * 7;
            total+= salary;
            if (month %6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 5;
        for (;friday< 31;){
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday = friday +7;
        }

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int yearInWichTheCometFlies = 79;
        int presentYear = 2023;
        int year200YearBeforePresent = presentYear-200;
        int year100YearFuturepresent = presentYear+100;
        while (year200YearBeforePresent<year100YearFuturepresent){
            year200YearBeforePresent++;
            if (year200YearBeforePresent%yearInWichTheCometFlies==0){
                System.out.println(year200YearBeforePresent);
            }
        }
    }
}