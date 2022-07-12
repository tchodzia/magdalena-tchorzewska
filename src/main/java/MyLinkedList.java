import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private MyNode<E> firstNode = null;
    private int actualSize = 0;

    @Override
    public boolean add(E e) {
        MyNode<E> newNode = new MyNode<>(e); // tworzę "wagonik" którym będzie przechowywał nowy element
        actualSize++;
        if (firstNode == null) {
            firstNode = newNode;
            return true; //skonczylismy prace - koniec metody
        }
        //aktualny node = first node
        MyNode<E> actualNode = firstNode;

        while (actualNode.nextNode != null) { //czy masz następnego? Jak tak to...
            actualNode = actualNode.nextNode; //ustawmy go na aktualny
        }
        //tu actualNode to ostatni node
        actualNode.nextNode = newNode;
        return true;
    }

    @Override
    public void add(int index, E element) {
        MyNode<E> newNode = new MyNode<>(element);
        MyNode<E> actual = firstNode;
        MyNode<E> beforeActual = null;
        for (int i = 1; i <= index; i++) {
            actual = actual.nextNode;
        }
        newNode.nextNode = actual;
        if (beforeActual != null)
            beforeActual.nextNode = newNode;
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public E get(int index) {
      /*  switch (index){
            case 0:
                return firstNode.data;
            case 1:
                return firstNode.nextNode.data;
        }*/
        if (index < 0 || index >= actualSize) {  //czy zapytano i istniejacy index?
            throw new IndexOutOfBoundsException();
        }

        MyNode<E> actualNode = firstNode; //aktualny node

        for (int i = 1; i <= index; i++) { //przestawianie aktualnego aż na ten o danym indexie
            actualNode = actualNode.nextNode;
        }
        return actualNode.data; //wyciągnięcie danych
    }

    @Override
    public boolean remove(Object o) {
        if (actualSize > 0) {
            MyNode<E> actualNode = firstNode;
            for (int i = 0; i < actualSize; i++) {
                if (actualNode.data.equals(o)) {
                    actualNode = actualNode.nextNode;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (actualSize > 0)
            return false;
        else return true;
    }

    @Override
    public boolean contains(Object o) {
        if (actualSize > 0) {
            MyNode<E> actualNode = firstNode;
            for (int i = 0; i < actualSize; i++) {
                if (actualNode.data.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        actualSize = 0;
        firstNode = null;
    }


    @Override
    public E remove(int index) {

        if (actualSize > 0) {
            MyNode<E> actualNode = firstNode;
            for (int i = 0; i < actualSize; i++) {
                if (actualSize == index + 1) {
                    actualNode = actualNode.nextNode;
                    return actualNode.data;
                }
            }
        }
        return null;
    }


    class MyNode<E> {

        private E data;
        private MyNode<E> nextNode = null;

        public MyNode(E data) {
            this.data = data;
        }
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
