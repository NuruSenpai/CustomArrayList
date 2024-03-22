public class CustomArrayList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAP = 10;

    public CustomArrayList() {
        array = new Object[DEFAULT_CAP];
        size = 0;
    }

    public void add(T element) {
        Capacity(size + 1);
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                removeAtIndex(i);
                return;
            }
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void Capacity(int minCap) {

        if (minCap > array.length) {
            int newCap = array.length * 2;
            if (newCap < minCap) {
                newCap = minCap;
            }
            Object[] newArray = new Object[newCap];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }


    }
}
