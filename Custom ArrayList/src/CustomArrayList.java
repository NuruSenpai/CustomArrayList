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
