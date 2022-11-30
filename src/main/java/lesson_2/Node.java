package lesson_2;

public class Node<E> {

    private Node previous;
    private E item;

    public Node() {
        this.previous = null;
    }

    public Node(Node previous) {
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
