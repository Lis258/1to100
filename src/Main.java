public class Main {
    public static void main(String[] args) {
        int balance = 20;
        int amount = 1300;
        int divisor = 100;
        int bonus;
        if (amount >= 1000) {
            bonus = amount / divisor;
        } else {
            bonus = 0;
        }
        System.out.println("balance = "+(balance+amount+bonus));
        System.out.println("bonus = "+bonus);
    }

}
