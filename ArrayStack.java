public class ArrayStack<E> implements StackInterface<E> {
    private E[] data;
    private int size;

    private int topIndex;

    public ArrayStack(){
        size = 0;
        data = (E[]) new Object[10];
    }

    public ArrayStack(int capacity) {
        size = 0;
        data = (E[]) new Object [capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(E e) {
        topIndex += 1;
        data[topIndex] = e;
        size ++;
    }

    public E pop() {
        E temp = top();
        data[topIndex] = null;
        topIndex--;
        size--;
        return temp;
    }

    public E top() {
        return data[topIndex];
    }
}
