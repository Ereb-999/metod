public class Main {
    public static void yearLeap(int year){

        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високостный год.");
        } else {
            System.out.println(year + " год - невисокостный год.");
        }
    }

    public static void versionPhone (short clientOS, short clientDeviceYear){

        if (clientOS == 1 && clientDeviceYear > 2023) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        if (clientOS == 0 && clientDeviceYear > 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2023){
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        if (clientOS == 0 && clientDeviceYear < 2023) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int cardBank(short deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days++;
            return days;
        }
        if (deliveryDistance <= 60) {
            days += 2;
            return days;
        }
        if (deliveryDistance <= 100) {
            days += 3;
            return days;
        }
        return days;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year;
        year = 2021;
        yearLeap(year);

        System.out.println();

        System.out.println("Задача 2");
        short clientOS;
        short clientDeviceYear;
        clientOS = 1;
        clientDeviceYear = 2020;
        versionPhone(clientOS, clientDeviceYear);

        System.out.println();

        System.out.println("Задача 3");
        short deliveryDistance1 = 10;
        int deliveryDays = cardBank(deliveryDistance1);
        if (deliveryDays == 0){
            System.out.println("Расстояние свыше 100 км не предусмотрено доставкой");
        } else {
            System.out.println("Потребуеться " + deliveryDays + " дней");

        }










    }
}