package nz.co.deltics.udemy.javamasterclass.section7.ex40;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        this.addition1Price = -1;
        this.addition2Price = -1;
        this.addition3Price = -1;
        this.addition4Price = -1;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {

        System.out.println(this.name + " burger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (addition1Price != -1)
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        if (addition2Price != -1)
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        if (addition3Price != -1)
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        if (addition4Price != -1)
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);

        return this.price
                + (this.addition1Price != -1 ? this.addition1Price : 0)
                + (this.addition2Price != -1 ? this.addition2Price : 0)
                + (this.addition3Price != -1 ? this.addition3Price : 0)
                + (this.addition4Price != -1 ? this.addition4Price : 0);
    }
}
