package pkg;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FortuneBank bank = new FortuneBank();
        System.out.println("=== Dev Fortune ===");
        System.out.println(bank.getTip());
    }
}