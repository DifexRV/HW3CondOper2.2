public class Main {
    public static void main(String[] args) {


    System.out.println("Задача 1");
    int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");        }


    System.out.println("Задача 2");
    int clientOS1 = 1;
    int clientDeviceYear = 2017;
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015)
                System.out.println("Рекомендуем Вам установить приложение!");
            if (clientDeviceYear < 2015)
                System.out.println("Рекомендуем Вам установить облегченную версию приложения");        }

        if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear >= 2015)
                System.out.println("Рекомендуем Вам установить приложение!");
            if (clientDeviceYear < 2015)
                System.out.println("Рекомендуем Вам установить облегченную версию приложения");        }

    System.out.println("Задача 3");
    int year = 2021;
        boolean year1 = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (year1) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliverDays = 1;

            if (deliveryDistance > 20) {
                deliverDays++;
            }

            if (deliveryDistance > 60) {
                deliverDays++;
            }
        System.out.println("Потребуется дней: " + deliverDays);

    System.out.println("Задача 5");
        int monthNumber = 2;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                System.out.println("Зима");
                break;
                case 3:
                case 4:
                case 5:
                System.out.println("Весна");
                break;
                case 6:
                case 7:
                case 8:
                System.out.println("Лето");
                break;
                case 9:
                case 10:
                case 11:
                System.out.println("Осень");
                break;
                default:
                System.out.println("Такого месяца не существует");
            }



    }


}