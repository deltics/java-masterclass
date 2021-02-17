package nz.co.deltics.udemy.javamasterclass.section8.ex45;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    public String getName() {
        return name;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public boolean newCustomer(String name, double openingBalance) {

        Customer customer = findCustomer(name);
        if (customer != null)
            return false;

        customer = new Customer(name, openingBalance);
        this.customers.add(customer);

        return true;
    }


    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer customer = findCustomer(customerName);
        if (customer == null)
            return false;

        customer.addTransaction(amount);

        return true;
    }


    private Customer findCustomer(String name) {

        for (Customer c : this.customers) {
            if (c.getName().equals(name))
                return c;
        }

        return null;
    }
}
