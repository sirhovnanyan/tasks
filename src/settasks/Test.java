package settasks;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        CollectionTasks<Integer> collectionTasks = new CollectionTasks<>();

        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(10000);
        hashSet.add(874);
        hashSet.add(69874);
        hashSet.add(1);
        hashSet.add(14789);

        //task 1
        System.out.print("My set is: " + hashSet + "\n");
        System.out.println("Number of elements in my set: " + collectionTasks.numElements(hashSet));

        //task 2
        System.out.println("Is empty my set? " + collectionTasks.isEmpty(hashSet));

        //task 3
        Set<Integer> cloneSet;
        cloneSet = collectionTasks.clone(hashSet);
        System.out.println("Clone set is: " + cloneSet + "\n");

        //task 4
        Set<Integer> treeSet;
        treeSet = collectionTasks.toTreeSet(hashSet);
        System.out.println("Tree set is: " + treeSet);

        //task 5
        List<Integer> list = collectionTasks.toList(hashSet);
        System.out.println("Set convert to ArrayList: " + list);

        //task 6
        boolean isEqual = collectionTasks.compare(hashSet, cloneSet);
        System.out.println("Is hashSet and cloneSet are equals? " + isEqual);

        //task 7
        collectionTasks.deleteAll(hashSet);
        System.out.println("After removing all elements in hashSet: " + hashSet);

        //task 8
        System.out.print("Passing over the elements of the treeSet with the help of an iterator: ");
        collectionTasks.iterate(treeSet);

        //task 9
        System.out.println("\nFirst element of treeSet is: " + collectionTasks.getFirst(treeSet) +
                "\nLast element of treeSet is: " + collectionTasks.getLast(treeSet));

        //task 10
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(123);
        integerTreeSet.add(1234);
        integerTreeSet.add(12);
        integerTreeSet.add(1);
        TreeSet<Integer> cloneTreeSet;
        cloneTreeSet = collectionTasks.cloneTreeSet(integerTreeSet);
        System.out.println("Clone tree set is: " + cloneTreeSet);

        //task 11
        System.out.println("Number elements of my treeSet: " + collectionTasks.numElements(cloneTreeSet));

        //task 12
        isEqual = collectionTasks.compare(treeSet, cloneTreeSet);
        System.out.println("Is treeSet and cloneTreeSet are equals? " + isEqual);

        //task 13
        List<Integer> integerList = collectionTasks.search(cloneTreeSet);
        System.out.println("Numbers less then 7: " + integerList);

        //task 14
        integerList = collectionTasks.searchGreater(cloneTreeSet, 12);
        System.out.println("Numbers greater then 12: " + integerList);

        //task 15
        collectionTasks.delete(cloneTreeSet, 1234);
        System.out.println("Clone Tree Set after delete 1234 element: " + cloneTreeSet);

        //task 16
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("a");
        priorityQueue.add("abc");
        priorityQueue.add("ab");
        priorityQueue.add("abcd");

        System.out.print("String priority queue is: ");
        Iterator<String> it = priorityQueue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        //task 17
        Queue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("a");
        priorityQueue1.add("abc");
        priorityQueue1.add("ab");
        priorityQueue1.add("abcd");
        priorityQueue1.add("abcde");
        isEqual = priorityQueue.equals(priorityQueue1);
        System.out.println("\nIs equals priorityQueue and priorityQueue1? " + isEqual);

        //task 18
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 5;
        for (int i = 0; i < d; i++) {
            collectionTasks.LeftShift(array, array.length);
        }
        System.out.print("\n array after rotation: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
