package HomeWork_2.generics;

import java.util.*;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        //This is safe, subList returns a view, not a copy.  No modification happens here.
        return new ArrayList<>(source.subList(0, Math.min(size, source.size())));
    }


    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<?> removeFrom, List<?> c2) { //Corrected:  No need for <? super T> here.
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<?> c2) {
        return new HashSet<>(c1).containsAll(c2);
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<?> c2) {
        for (Object o : c2) {
            if (c1.contains(o)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<? super T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (element.compareTo(min) >= 0 && element.compareTo(max) <= 0) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (comparator.compare(element, min) >= 0 && comparator.compare(element, max) <= 0) {
                result.add(element);
            }
        }
        return result;
    }
}