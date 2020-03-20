import java.util.Iterator;

public class MyCollection implements Iterable<Integer>{
    //ćwiczenie uzupełnić klasę
    int counter = 0;
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return counter < 10;
            }

            @Override
            public Integer next() {
                counter++;
                return 10;
            }
        };
    }
}
