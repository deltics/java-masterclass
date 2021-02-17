package nz.co.deltics.udemy.javamasterclass.section8.ex45;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, double openingBalance) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(openingBalance);
    }


    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public void addTransaction(double amount)
    {
        this.transactions.add(amount);
    }
}
