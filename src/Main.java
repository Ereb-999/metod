public class Main {
    public static void leapYear(int year){

        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високостный год.");
        } else {
            System.out.println(year + " год - невисокостный год.");
        }
    }

    public static void phoneVersion (short clientOS, short clientDeviceYear){

        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void bankCard(short deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуеться дней: " + 1);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуеться дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуеться дней: " + 3);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year;
        year = 2021;
        leapYear(year);

        System.out.println();

        System.out.println("Задача 2");
        short clientOS;
        short clientDeviceYear;
        clientOS = 1;
        clientDeviceYear = 2020;
        phoneVersion(clientOS, clientDeviceYear);

        System.out.println();

        System.out.println("Задача 3");
        short deliveryDistance;
        deliveryDistance = 100;
        bankCard(deliveryDistance);




    }
}