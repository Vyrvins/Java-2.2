public class Main {
    public static void main(String[] args) {
        int amount = 100; // сумма начального счета
        int payment = 1100; // сумма пополнения
        int bonus = (payment) / 100;
        if (payment >= 1000) {
            System.out.println("Cумма бонусов " + bonus);
        } else {
            System.out.println("Cумма бонусов " + 0);
        }
        System.out.println("Итоговая сумма на счете " + (amount + payment + bonus));

    }
}