import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListTimer {

    private static long getTime() {
        return System.currentTimeMillis();
    }

    private static long populateList(List<Integer> list, long max) throws RuntimeException {
        long startTime = getTime();
        for (int i = 0; i < max; i++) {
            list.add(i);
            if (getTime() - startTime > 5000) {
                throw new RuntimeException("Operation failed");
            }
        }
        long endTime = getTime();
        return endTime - startTime;
    }

    public static void testList(long max) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        long resultForArrayList;
        long resultForLinkedList;

        try {
            resultForArrayList = populateList(arrayList, max);
            System.out.println("Time to build ArrayList of " + max + " elements: " + resultForArrayList + " ms.");
        } catch (RuntimeException e) {
            System.out.println("ArrayList operation took longer than 5 seconds:");
            e.printStackTrace();
        }

        try {
            resultForLinkedList = populateList(linkedList, max);
            System.out.println("Time to build LinkedList of " + max + " elements: " + resultForLinkedList + " ms.");
        } catch (RuntimeException e) {
            System.out.println("LinkedList operation took longer than 5 seconds:");
            e.printStackTrace();
        }

    }
}








