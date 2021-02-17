package nz.co.deltics.udemy.javamasterclass.section8.ex45;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch(String name) {

        Branch branch = findBranch(name);
        if (branch != null)
            return false;

        branch = new Branch(name);
        this.branches.add(branch);

        return true;
    }


    public boolean addCustomer(String branchName, String customerName, double openingBalance) {

        Branch branch = findBranch(branchName);
        if (branch == null)
            return false;

        return branch.newCustomer(customerName, openingBalance);
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {

        Branch branch = findBranch(branchName);
        if (branch == null)
            return false;

        return branch.addCustomerTransaction(customerName, amount);
    }


    private Branch findBranch(String name) {

        for (Branch b : this.branches) {
            if (b.getName().equals(name))
                return b;
        }

        return null;
    }


    public boolean listCustomers(String branchName, boolean printTransactions) {

        Branch branch = findBranch(branchName);
        if (branch == null)
            return false;

        ArrayList<Customer> customers = branch.getCustomers();

        System.out.println("Customer details for branch " + branch.getName());
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");

            if (!printTransactions)
                continue;

            System.out.println("Transactions");
            ArrayList<Double> transactions = customer.getTransactions();
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println("[" + (i + 1) + "]  Amount " + String.format("%.2f", transactions.get(i)));
            }
        }
        return true;
    }
}
