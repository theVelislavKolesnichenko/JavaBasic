package bg.tu_varna.sit;

import java.util.*;

public class University<K, V extends Person> {
    private Map<K, V> items;

    public University() {
        this.items = new HashMap<>();
    }

    public void setItems(Map<K, V> items) {
        this.items = items;
    }

    public Map<K, V> getItems() {
        return items;
    }

    public static <T> void print(T item) {
        System.out.println(item);
    }

    public void add(K key, V item) {
        items.put(key, item);
    }

    @Override
    public String toString() {
        String builder = "";
        for (Map.Entry<K, V> entry : items.entrySet()) {
            builder += String.format("%s : %s \n", entry.getKey(), entry.getValue());
        }

        return builder;
    }
}
