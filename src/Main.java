import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static boolean determineYear(int year) {
        boolean yearLeap;
        yearLeap = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        return yearLeap;
    }

    public static void determineMessage(int yearDevice, String modelDevice) {

        if (yearDevice < 2015) {
            System.out.println("Установите облегчённую версию приложения для " + modelDevice + " по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения для " + modelDevice + " по ссылке.");
        }
    }

    public static int determineTimeDelivery(int distance) {
        int timeOfDelivery;
        if (distance <= 20) {
            timeOfDelivery = 1;
        } else if (distance > 20 && distance <= 60) {
            timeOfDelivery = 2;
        } else if (distance > 60 && distance <= 100) {
            timeOfDelivery = 3;
        } else {
            timeOfDelivery = 0;
        }
        return timeOfDelivery;
    }


    public static void main(String[] args) {

        System.out.println("    Задание 1");

        int yearReal = 2024;
        if (determineYear(yearReal)) {
            System.out.println("Год " + yearReal + " - високосный.");
        } else {
            System.out.println("Год " + yearReal + " -  не високосный.");
        }

        System.out.println("    Задание 2");

        int dataDeviceClient = 2015;
        String modelDeviceClient = "Android";
        determineMessage(dataDeviceClient, modelDeviceClient);

        System.out.println("    Задание 3");

        int deliveryDistance = 95;
        if (determineTimeDelivery(deliveryDistance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Количество дней доставки - " + determineTimeDelivery(deliveryDistance));
        }
    }
}