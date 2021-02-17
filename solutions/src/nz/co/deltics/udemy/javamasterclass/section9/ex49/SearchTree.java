package nz.co.deltics.udemy.javamasterclass.section9.ex49;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if ((item.next() != null) || (item.previous() != null))
            return false; // Already in a list

        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem curr = this.root;
        do {
            switch (item.compareTo(curr)) {
                case 0:
                    return false;   // Duplicates not allowed

                case -1: {
                    ListItem prev = curr.previous();

                    if (prev == null) {
                        curr.setPrevious(item);
                        return true;
                    } else {
                        curr = prev;
                    }
                }
                break;

                case 1: {
                    ListItem next = curr.next();

                    if (next == null) {
                        curr.setNext(item);
                        return true;
                    } else {
                        curr = next;
                    }
                }
                break;
            }
        } while (true);
    }


    @Override
    public boolean removeItem(ListItem item) {

        if ((item != this.root) && (item.next() == null) && (item.previous() == null))
            return false; // Not in any list

        if (this.root == null) {
            return false; // List is empty
        }

        ListItem curr = this.root;
        ListItem parent = null;
        do {
            switch (item.compareTo(curr)) {
                case 0:
                    performRemoval(curr, parent);
                    return true;

                case -1:
                    parent = curr;
                    curr = curr.previous();
                    break;

                case 1:
                    parent = curr;
                    curr = curr.next();
                    break;
            }
        } while (curr != null);

        return false;
    }


    private void performRemoval(ListItem item, ListItem parent) {

        ListItem next = item.next();
        ListItem prev = item.previous();

        if ((next == null) && (prev == null)) {
            if (parent != null) {
                if (item == parent.previous()) {
                    parent.setPrevious(null);
                } else {
                    parent.setNext(null);
                }
            } else {
                this.root = null;
            }
            return;
        }

        if (next == null) {
            if (parent != null) {
                if (item == parent.previous()) {
                    parent.setPrevious(prev);
                } else {
                    parent.setNext(prev);
                }
            } else {
                this.root = item.previous();
            }
            return;
        }

        if (prev == null) {
            if (parent != null) {
                if (item == parent.previous()) {
                    parent.setPrevious(next);
                } else {
                    parent.setNext(next);
                }
            } else {
                this.root = item.next();
            }
            return;
        }

        // Item to be removed has both next and previous items.
        //
        // To remove this item:
        //   1. Find subtree minimum in next() subtree
        //   2. Set value of item to be removed with subtree minimum value
        //   3. Remove the subtree minimum item (which will have at most 1 child)

        ListItem subTreeMin = item.next();
        ListItem subTreeMinParent = item;
        while (subTreeMin.previous() != null) {
            subTreeMinParent = subTreeMin;
            subTreeMin = subTreeMin.previous();
        }

        item.setValue(subTreeMin.getValue());
        performRemoval(subTreeMin, subTreeMinParent);
    }


    @Override
    public void traverse(ListItem item) {

        if (item != null) {
            traverse(item.previous());
            System.out.println(item.value);
            traverse(item.next());
        }
    }
}

