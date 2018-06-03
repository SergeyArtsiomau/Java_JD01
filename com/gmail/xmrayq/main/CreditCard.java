package com.gmail.xmrayq.main;

public class CreditCard {
    private int accountNumber;
    private int currentAmountOnAccount;

    public CreditCard(int accountNumber, int currentAmountOnAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountOnAccount = currentAmountOnAccount;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public int getCurrentAmountOnAccount() {

        return currentAmountOnAccount;
    }

    public void addMoney(int sum) {
        currentAmountOnAccount += sum;
        System.out.println("New card balance: " + currentAmountOnAccount + "$" + " ");

    }

    public void differenceMoney(int diff) {
        currentAmountOnAccount -= diff;
        System.out.println("New card balance: " + currentAmountOnAccount + "$" + " ");
    }

    void printInfo() {
        System.out.println();
        System.out.println("Account Number");
        System.out.println(accountNumber);
        System.out.println("Current Amount On Account");
        System.out.println(currentAmountOnAccount);

    }
}

