import java.util.*;

class Figure {
    Integer color = 0;

    Figure(Integer color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        Figure figure = (Figure) o;
        return color.equals(figure.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
    //ćwiczenie 2:
    //napisać metodę toString()

    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                '}';
    }


    //ćwiczenie 3
    //usupełnić klasę tak, żeby kolekcja set używała koloru
}

public class App {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    Deque<Integer> deque = new ArrayDeque<>();
    Set<Figure> setFigures = new HashSet<>();
    MyCollection myCollection = new MyCollection();

    public static void main(String[] args) {
        App app = new App();

        app.arrayListExample();
        app.setExample();

        app.iteratorsExamples();

        /*System.out.println("MyCollection:");

        MyCollection myCollection = new MyCollection();
        for(Integer element: myCollection){
            System.out.println("element: "+element);
        }*/

        //app.dequeExample();
        app.ownSetExample();
    }

    public void addElements(Collection<Integer> collection, int n) {

        /*ćwiczenie 1: proszę uzupełnić metodę tak, żeby dodawała do
            kolekcji elementy od 1 do 10 o krotności n
            np n=2 [1,1,2,2,3,3,4,4..]
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n; j++)
                collection.add(i);
        }
    }

    public void arrayListExample() {
        addElements(arrayList, 5);

        System.out.println("ArrayList: " + arrayList);
    }

    public void setExample() {
        addElements(set, 5);

        System.out.println("Set: " + set);
    }

    public void dequeExample() {
        addElements(deque, 2);

        System.out.println("Deque: " + deque.toString());
        deque.poll();
        System.out.println("Deque: " + deque.toString());
    }

    public void ownSetExample() {
        //ćwiczeni4: proszę uzupełnić metodę tak, żeby używała klasy Figure

        setFigures.add(new Figure(1));
        setFigures.add(new Figure(1));
        setFigures.add(new Figure(1));
        setFigures.add(new Figure(2));
        setFigures.add(new Figure(1));

        setFigures.add(new Figure(4));
        setFigures.add(new Figure(5));
        setFigures.add(new Figure(5));
        setFigures.add(new Figure(5));
        setFigures.add(new Figure(5));

        System.out.println("Own set: " + setFigures);
    }

    public void iteratorsExamples(){
    }

    public void iteratorExample(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();

        /*while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }*/

        //Jeżeli klasa posiada iterator można użyć pętli for
        //ćwiczenie 5: proszę użyć pętli for dla klasy MyCollection

        for (Integer element : collection) {
            System.out.println(element);
        }
    }

}
