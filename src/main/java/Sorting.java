import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

    public  static void sort() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(
            10, 1, 3, 7, 11, -2, 15
        ));

        System.out.println("Initial Order:\n");
        list.forEach(n -> System.out.println(n));
        System.out.println("\nSorted:\n");
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) return 0;
                return o1 < o2 ? -1 : 1;
            }
        });

        Collections.sort(list);
        list.forEach(n -> System.out.println(n));

        System.out.println("\nSorting People:\n");

        Person p1 = new Person(17, "Sean");
        Person p2 = new Person(16, "Sze Wai");
        Person p3 = new Person(19, "Kenneth");
        Person p4 = new Person(15, "Sophia");

        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(
                p1, p2, p3, p4
        ));

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) return 0;
                return o1.getAge() < o2.getAge() ? -1 : 1;
            }
        });

        people.stream().forEach(p -> System.out.println(p.getName()));
    }

}
