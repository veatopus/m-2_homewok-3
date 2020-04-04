package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        while (true) {
            try {
                System.out.println("счет = " + bankAccount.getAmount());
                bankAccount.withDraw(600);
            } catch (LimitException e) {
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
        System.out.println("счет = " + bankAccount.getAmount());
    }
}
