package HomeWork_1;

import HomeWork_1.generics.CountMap;
import HomeWork_1.generics.ExecCountMap;

public class Main {
    public static void main(String[] args) {
    CountMap<String> stringCountMap = new ExecCountMap<>();
    stringCountMap.add("яблоко");
    stringCountMap.add("яблоко");
    stringCountMap.add("банан");
    System.out.println(stringCountMap.getCount("яблоко"));

    CountMap<String> verificationCountMap = new ExecCountMap<>();
    verificationCountMap.addAll(stringCountMap);

    int apple = stringCountMap.remove("яблоко");
    System.out.println(apple);

    CountMap<Integer> intCountMap = new ExecCountMap<>();
    intCountMap.add(1);
    intCountMap.add(1);
    intCountMap.add(2);
    System.out.println(intCountMap.getCount(1));
}
}