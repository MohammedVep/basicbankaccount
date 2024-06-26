package main;

import bank.BankAccount;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BankAccount bankAccount = new BankAccount(45564,"Autism world",4543.44);
        System.out.println("Your name is " + bankAccount.getAccountHolder());
        System.out.println("Your bank balance is " + bankAccount.getBalance());
        System.out.println("Your account number is " + bankAccount.getAccountNumber());
    }
}