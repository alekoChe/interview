package lesson_2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface MyList<E> extends Iterable<E>   {

    /** 1.Создать интерфейс MyList с методами get, add, insert, delete. Также интерфейс должен реализоввывать Iterable */
    E get(int index);
    void add(E o);
    void insert(int index, E obj);
    void delete(int index);

    @Override
    default Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }

    @Override
    default void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    default Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
