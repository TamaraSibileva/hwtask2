public class Main {

    public static void main(String[] args) {

        int openingBalance = 100; // начальный счёт
        int topUp = 1300; // сумма пополнения счёта
        int b = 100; // количество рублей для одного бонусного рубля
        int minTopUp = 1000; // минимальная сумма пополнения для начисления бонусов
        int bonus;

        if (topUp > minTopUp) {
            bonus = topUp / b;
        } else {
            bonus = 0;
        }

        int balance = openingBalance + topUp + bonus; // итоговый счёт

        System.out.println("Итоговый счёт: " + balance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
