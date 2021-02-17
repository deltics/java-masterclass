package nz.co.deltics.udemy.javamasterclass.section7.ex40;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", meat, price, "Brown rye");

        this.healthyExtra1Price = -1;
        this.healthyExtra2Price = -1;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();

        if (healthyExtra1Price != -1)
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        if (healthyExtra2Price != -1)
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);

        return price
                + (this.healthyExtra1Price != -1 ? this.healthyExtra1Price : 0)
                + (this.healthyExtra2Price != -1 ? this.healthyExtra2Price : 0);
    }
}
