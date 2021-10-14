package settasks;

import java.util.*;

public class CollectionTasks<T> {

    public int numElements(Set<T> set) {
        return set.size();
    }

    public boolean isEmpty(Set<T> set) {
        return set.isEmpty();
    }

    public Set<T> clone(Set<T> set) {
        Set<T> cloneSet = new HashSet<>();
        for (T value : set) {
            cloneSet.add(value);
        }
        return cloneSet;
    }

    public TreeSet<T> cloneTreeSet(TreeSet<T> treeSet) {
        TreeSet<T> cloneTreeSet = new TreeSet<>();
        for (T value : treeSet) {
            cloneTreeSet.add(value);
        }
        return cloneTreeSet;
    }

    public TreeSet<T> toTreeSet(Set<T> set) {
        return new TreeSet<>(set);
    }

    public List<Integer> toList(Set<Integer> set) {
        return new ArrayList<>(set);
    }

    public boolean compare(Collection<T> coll1, Collection<T> coll2) {
        if (coll1.size() != coll2.size()) {
            return false;
        }
        return coll1.equals(coll2);
    }

    public void deleteAll(Set<T> set) {
        set.removeAll(set);
    }

    public void iterate(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public T getFirst(Set<T> set) {
        ArrayList<T> list = new ArrayList<>(set);
        return list.get(0);
    }

    public T getLast(Set<T> set) {
        ArrayList<T> list = new ArrayList<>(set);
        return list.get(list.size() - 1);
    }

    public void delete(Set<T> set, T element) {
        set.remove(element);
    }

    public List<Integer> search(Set<Integer> set) {
        List<Integer> returned = new ArrayList<>();
        List<Integer> list = this.toList(set);
        for (Integer value : set) {
            if (value < 7) {
                returned.add(value);
            }
        }
        return returned;
    }

    public List<Integer> searchGreater(Set<Integer> set, int element) {
        List<Integer> returned = new ArrayList<>();
        List<Integer> list = this.toList(set);
        for (Integer value : set) {
            if (value >= element) {
                returned.add(value);
            }
        }
        return returned;
    }

    public static void LeftShift(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }
}
