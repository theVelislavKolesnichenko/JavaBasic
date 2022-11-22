package bg.tu_varna.sit;

public class University<E extends Person> {
    private E[] items;

    public void setItems(E[] items) {
        this.items = items;
    }

    public E[] getItems() {
        return items;
    }

    public static <T> void print(T item) {
        System.out.println(item);
    }

    @Override
    public String toString() {

        String builder = "";
        for (int i = 0; i < items.length; i++) {
            builder += String.format("%d: %s \n", (i + 1), items[i].toString());
        }
        return builder;
    }

    public String itemsToString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            builder.append(String.format("%d: %s \n", (i + 1), items[i].toString()));
        }
        return builder.toString();
    }
}
