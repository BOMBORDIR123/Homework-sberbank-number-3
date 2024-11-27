package HomeWork_2;

import HomeWork_2.generics.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<>();
        CollectionUtils.addAll(list1, list2);
        System.out.println(list2);

        System.out.println(CollectionUtils.indexOf(list1, 3));

        System.out.println(CollectionUtils.limit(list1, 2));

        List<Number> list3 = new ArrayList<>();
        CollectionUtils.add(list3, 10);
        CollectionUtils.add(list3, 10.5);
        System.out.println(list3);

        List<String> list4 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list5 = new ArrayList<>(Arrays.asList("b", "d"));
        CollectionUtils.removeAll(list4, list5);
        System.out.println(list4);


        List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list7 = Arrays.asList(3, 4);
        System.out.println(CollectionUtils.containsAll(list6, list7));

        System.out.println(CollectionUtils.containsAny(list6, list5));


        List<Integer> list8 = Arrays.asList(8, 1, 3, 5, 6, 4);
        System.out.println(CollectionUtils.range(list8, 3, 6));

        System.out.println(CollectionUtils.range(list8, 3, 6, (a, b) -> a-b));

    }
}
