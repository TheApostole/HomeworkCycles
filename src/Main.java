public class Main {
    public static void main(String[] args) {
     homework1();
     homework2();
     homework3();
    }
    public static void homework1 ()  {

        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i ++) {
            System.out.println("Итерация цикла " + i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1 ; i --) {
            System.out.println("Итерация цикла " + i);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Итерация цикла " + i);
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10 ; i --) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void homework2 ()  {

        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " Год является високосным");
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");;
        }
        System.out.println();

    }
    public static void homework3 ()  {

        //Задание 1
        System.out.println("Задание 1");
        int monthlyAccumulation = 29000;
        int annualAccumulation = 0;
        for (int i = 1; i <= 12; i ++) {
            annualAccumulation = annualAccumulation + monthlyAccumulation;
            System.out.println("Месяц " + i +" сумма накоплений равна " + annualAccumulation + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        int depositAmount = 29000;
        int amountOfSavings = 0;
        for (int i = 1; i <= 12; i ++) {
            amountOfSavings = amountOfSavings + amountOfSavings / 100;
            amountOfSavings = amountOfSavings + depositAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + amountOfSavings + " рублей");
        }
    }


}