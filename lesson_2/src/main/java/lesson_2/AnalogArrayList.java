package lesson_2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AnalogArrayList<E> implements MyList<E> {

    private int capacity = 16;
    private int counterFullness = 0;
    E[] arrayOfObjects = (E[]) new Object[capacity];

    public int getCounterFullness() {
        return counterFullness;
    }

    @Override
    public E get(int index) {
        return arrayOfObjects[index];
    }

    @Override
    public void add(E obj) {

        if (checkingFullness()) {
            arrayOfObjects[counterFullness] =  obj;
        } else {
            increasingArrayBy2Times();
            arrayOfObjects[counterFullness] = obj;
        }
        incrementCounterFullness();
    }

    private boolean checkingFullness() {
        return (capacity - counterFullness) > capacity / 4;
    }

    private void incrementCounterFullness() {
        ++counterFullness;
    }

    private void decrementCounterFullness() {
        --counterFullness;
    }

    private void increasingCapacityBy2Times() {
        capacity = capacity * 2;
    }

    private void increasingArrayBy2Times() {
        increasingCapacityBy2Times();
        E[] doubleArrayOfObjects = (E[]) (new Object[capacity]);
        for (int i = 0; i < capacity / 2; i++) {
            doubleArrayOfObjects[i] = arrayOfObjects[i];
        }
        arrayOfObjects = doubleArrayOfObjects;

    }

    @Override
    public void insert(int index, E obj) {
        if (arrayOfObjects[index] == null) {
            arrayOfObjects[index] = obj;
        } else {
            shiftDownItemOfList(index);
            arrayOfObjects[index] = obj;
        }
        incrementCounterFullness();
    }

    private void shiftDownItemOfList(int index) {
        E [] tempArray =(E[]) (new Object[capacity]);
        for (int i = index; i < capacity; i++) {
            if (arrayOfObjects[i] != null) {
                tempArray[i] = arrayOfObjects[i];
            }
        }
        for (int i = index; i < capacity; i ++) {
            if (tempArray[i] != null) {
                if (checkingFullness()) {
                    arrayOfObjects[i + 1] = tempArray[i];
                } else {
                    increasingArrayBy2Times();
                    arrayOfObjects[i + 1] = tempArray[i];
                }
            }
        }
    }

    @Override
    public void delete(int index) {
        arrayOfObjects[index] = null;
        decrementCounterFullness();
    }

    @Override
    public Iterator<E> iterator() {
        return MyList.super.iterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return MyList.super.spliterator();
    }

    private void shiftUpItemOfList(int index) {
    }
}
