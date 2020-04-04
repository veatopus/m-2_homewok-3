package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public int withDraw(int sum) throws LimitException{
    if (sum > amount){
        throw new LimitException("введеная сумм больше чем " +
                "остаток на счете!\nОстаток на счете = " + amount
                + "\nВведенная сумма = " + sum, amount);
    }
    amount -= sum;
    return sum;
    }
}
