package nz.co.deltics.udemy.javamasterclass;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0) && (tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {

        if ((tonerAmount <= 0) || (tonerAmount > 100))
            return -1;

        if ((this.tonerLevel + tonerAmount) > 100)
            return -1;

        return this.tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {

        int pagesToPrint = this.duplex ? (int) Math.ceil(pages / 2.0) : pages;

        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }
}
