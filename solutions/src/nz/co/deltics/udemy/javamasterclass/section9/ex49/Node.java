package nz.co.deltics.udemy.javamasterclass.section9.ex49;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }


    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    int compareTo(ListItem item) {
        Comparable self = (Comparable) this.value;
        Comparable other = (Comparable) item.getValue();

        if (self.compareTo(other) > 0)
            return 1;
        else if (self.compareTo(other) < 0)
            return -1;
        else
            return 0;
    }
}
