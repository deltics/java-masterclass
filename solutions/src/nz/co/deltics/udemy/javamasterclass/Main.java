package nz.co.deltics.udemy.javamasterclass;


import nz.co.deltics.udemy.javamasterclass.section9.ex49.ListItem;
import nz.co.deltics.udemy.javamasterclass.section9.ex49.Node;
import nz.co.deltics.udemy.javamasterclass.section9.ex49.MyLinkedList;
import nz.co.deltics.udemy.javamasterclass.section9.ex49.SearchTree;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        ListItem a = new Node('a');
        ListItem b = new Node('b');
        ListItem c = new Node('c');
        ListItem d = new Node('d');

        list.addItem(d);
        list.addItem(a);
        list.addItem(c);
        list.addItem(b);
        list.traverse(list.getRoot());

        list.removeItem(b);
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        ListItem w = new Node('w');
        ListItem x = new Node('x');
        ListItem y = new Node('y');
        ListItem z = new Node('z');

        tree.addItem(z);
        tree.addItem(x);
        tree.addItem(y);
        tree.addItem(w);
        tree.traverse(tree.getRoot());

        tree.removeItem(x);
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
