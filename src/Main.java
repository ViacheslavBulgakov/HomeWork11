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

    public static void determineTimeDelivery(int distance) {


        if (distance <= 20) {
            System.out.println("Срок доставки 1 день");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Срок доставки 2 дня");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Срок доставки 3 дня");
        } else {
            System.out.println("Доставки нет.");
        }


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

        int deliveryDistance = 160;
        determineTimeDelivery(deliveryDistance);
    }
}