
public interface List {
    void add(Object object);

    void add(int position, Object object);

    Object get(int position);

    void remove(int position);

    boolean contains(Object object);

    int size();
}
