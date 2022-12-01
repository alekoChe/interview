package lesson_2;

public class AnalogLinkedList<E> implements MyList<E>{

    private Node<E> node;

    private AnalogArrayList<Node> nodes;

    private int size = 0;

    public AnalogLinkedList(AnalogArrayList<Node> nodes) {
        this.nodes = nodes;
        nodes = new AnalogArrayList<>();
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E obj) {
        node = new Node<>();
        if (nodes.getCounterFullness() == 0) {
            node.setItem(obj);
        } else {
            node.setPrevious(nodes.get(size));
            node.setItem(obj);
        }
        nodes.add(node);
        size++;
    }

    @Override
    public void insert(int index, E obj) {
        Node temp = nodes.get(index);
    }

    @Override
    public void delete(int index) {
        nodes.delete(index);
    }
}
