public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int dogs = 8;
        System.out.println("Значение переменной dogs с типом int равно " + dogs + ".");
        byte cats = 5;
        System.out.println("Значение переменной cats с типом bytes равно " + cats + ".");
        short pinapples = 2;
        System.out.println("Значение переменной pinapples с типом short равно " + pinapples + ".");
        long stars = 50_000_000_000_000L;
        System.out.println("Значение переменной stars с типом long равно " + stars + ".");
        float pi = 3.1415F;
        System.out.println("Значение переменной pi с типом float равно " + pi + ".");
        double number = 5.5;
        System.out.println("Значение переменной number с типом double равно " + number + ".");

        // Задача 2
        System.out.println("Задача 2");
        float number1 = 27.12F;
        long number2 = 987_678_965_549L;
        double number3 = 2.786;
        boolean number4 = false;
        char number5 = 569;
        short number6 = -159;
        int number7 = 27897;
        byte number8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int papersCount = 480;
        int papersPerson = papersCount / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + papersPerson + " листов бумаги.");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivity = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За 20 минут машины произвела бутылок " + productivity * twentyMinutes + " штук.");
        int day = 24 * 60;
        System.out.println("За день машины произвела бутылок " + productivity * day + " штук.");
        int threeDays = 3 * 24 * 60;
        System.out.println("За 3 дня машины произвела бутылок " + productivity * threeDays + " штук.");
        int month = 30 * 24 * 60;
        System.out.println("За месяц машины произвела бутылок " + productivity * month + " штук.");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whitePaintCans = 2;
        int brownPaintCans = 4;
        int totalClasses = totalCans / (whitePaintCans + brownPaintCans);
        int totalWhiteCans = whitePaintCans * totalClasses;
        int totalBrownCans = brownPaintCans * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans +
                        " банок белой краски и " + totalBrownCans + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        int banans = 5 * 80;
        int milk = 2 *105;
        int iceCream = 2 *100;
        int rawEggs = 4 * 70;
        double gramms = banans + milk + iceCream + rawEggs;
        double kilogramms = (gramms / 1000);
        System.out.println("Вес спорт-завтрака " + kilogramms + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        int weight = 7;
        int daysRation1 = weight * 1000 / 250;
        int daysRation2 = weight * 1000 / 500;
        int daysOnAverage = (daysRation1 + daysRation2) / 2;
        System.out.println(daysRation1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(daysRation2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println("Потребуется " + daysOnAverage + " дней в среднем, чтобы добиться результата похудения.");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMashaUpTo = 67760;
        int salaryDenisUpTo = 83690;
        int salaryKristinaUpTo = 76230;
        int salaryMashaAfter = salaryMashaUpTo / 100 * 110;
        int salaryDenisAfter = salaryDenisUpTo / 100 * 110;
        int salaryKristinaAfter = salaryKristinaUpTo / 100 * 110;
        int annualSalaryMashaUpTo = salaryMashaUpTo * 12;
        int annualSalaryDenisUpTo = salaryDenisUpTo * 12;
        int annualSalaryKristinaUpTo = salaryKristinaUpTo * 12;
        int annualSalaryMashaAfter = salaryMashaAfter * 12;
        int annualSalaryDenisAfter = salaryDenisAfter * 12;
        int annualSalaryKristinaAfter = salaryKristinaAfter * 12;
        int differenceAnnualSalaryMasha = annualSalaryMashaAfter - annualSalaryMashaUpTo;
        int differenceAnnualSalaryDenis = annualSalaryDenisAfter - annualSalaryDenisUpTo;
        int differenceAnnualSalaryKristina = annualSalaryKristinaAfter - annualSalaryKristinaUpTo;
        System.out.println("Маша теперь получает " + salaryMashaAfter + " рублей." +
                " Годовой доход вырос на " + differenceAnnualSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisAfter + " рублей." +
                " Годовой доход вырос на " + differenceAnnualSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaAfter + " рублей." +
                " Годовой доход вырос на " + differenceAnnualSalaryKristina + " рублей.");

    }
}