package HomeWork_1.generics;

import java.util.HashMap;
import java.util.Map;

public class ExecCountMap <T> implements CountMap<T> {

    private final Map<T, Integer> map;

    public ExecCountMap() {
        map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        map.put(o, map.getOrDefault(o, 0) + 1);
    }

    @Override
    public int getCount(T o) {
        return map.getOrDefault(o, 0);
    }

    @Override
    public int remove(T o) {
        Integer count = map.getOrDefault(o, 0);
        if (count == 0) {return 0;}
        else {
            map.put(o, count);
            return count;}
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        if (source == null) return;

        for (Map.Entry<T, Integer> entry : source.toMap().entrySet()) {
            T key = entry.getKey();
            int count = entry.getValue();
            map.put(key, count + map.getOrDefault(key, 0) + count);
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<>(map);
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(map);
    }

    @Override
    public String toString() {
        return "map=" + map;
    }
}
