package nz.co.deltics.udemy.javamasterclass.section9.ex49;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if ((item.next() != null) || (item.previous() != null))
            return false; // Already in a list

        if (this.root == null) {
            this.root = item;
            return true;
        }

        if (item.compareTo(this.root) < 0) {
            ListItem next = this.root;

            next.setPrevious(item);
            item.setNext(next);

            this.root = item;

            return true;
        }

        ListItem curr = this.root;
        do {
            switch (item.compareTo(curr)) {
                case 0:
                    return false;   // Duplicates not allowed

                case -1: {  // Only occurs if inserting between items (curr != root)
                    ListItem next = curr;
                    ListItem prev = curr.previous();

                    prev.setNext(item);
                    next.setPrevious(item);

                    item.setPrevious(prev);
                    item.setNext(next);

                    return true;
                }

                case 1: {
                    ListItem next = curr.next();
                    ListItem prev = curr;

                    if (next == null) {
                        item.setPrevious(prev);
                        prev.setNext(item);
                        return true;
                    } else {
                        curr = next;
                    }
                    break;
                }
            }
        } while (true);
    }

    @Override
    public boolean removeItem(ListItem item) {

        if ((item.next() == null) && (item.previous() == null))
            return false; // Not in any list

        if (this.root == null) {
            return false; // List is empty
        }

        ListItem curr = this.root;
        do {
            switch (item.compareTo(curr)) {
                case -1:
                    return false; // Item not in this list

                case 1:
                    curr = curr.next();
                    break;

                case 0:
                    ListItem next = curr.next();
                    ListItem prev = curr.previous();

                    if (prev != null)
                        prev.setNext(next);

                    if (next != null)
                        next.setPrevious(prev);

                    if (curr == this.root)
                        this.root = curr.next();

                    curr.setNext(null);
                    curr.setPrevious(null);

                    return true;
            }
        } while (curr != null);

        return false;
    }


    @Override
    public void traverse(ListItem item) {
        if (item == null) {
            System.out.println("The list is empty");
            return;
        }

        ListItem curr = item;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next();
        }
    }
}
