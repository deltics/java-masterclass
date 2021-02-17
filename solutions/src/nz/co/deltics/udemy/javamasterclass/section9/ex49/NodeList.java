package nz.co.deltics.udemy.javamasterclass.section9.ex49;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item);
}
