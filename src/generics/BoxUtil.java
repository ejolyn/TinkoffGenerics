package generics;

public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null) {
            dest.put(src.get());
        }
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src,
                                                                    final Box<? super T> dest) {
        if (src.get() != null && src.get().getFresh()) {
            dest.put(src.get());
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<T> box) {
        if (box.get() instanceof Box) {
            Box<T> boxCopy = (Box<T>) box.get();
            System.out.println(boxCopy.get().toString());
        } else {
            System.out.println("В коробке нет вложенной коробки");
        }
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
        if (box.get() instanceof Box) {
            Box<T> boxCopy = (Box<T>) box.get();
            while (boxCopy.get() instanceof Box) {
                boxCopy = (Box<T>) boxCopy.get();
            }
            System.out.println(boxCopy.get().toString());
        } else {
            System.out.println(box.get().toString());
        }
    }
}
