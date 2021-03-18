package generics;

public class Box<T> {
    private T element;

    public final T get() {
        return element;
    }

    public final void put(final T elem) {
        this.element = elem;
    }

}
