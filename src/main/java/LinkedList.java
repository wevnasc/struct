public class LinkedList implements Struct {

    private Cell first;
    private Cell last;
    private int size;


    @Override
    public void add(Object object) {
        if (size == 0) {
            addFirst(object);
        } else {
            Cell cell = new Cell(object);
            last.setNext(cell);
            last = cell;
            size++;
        }

    }

    public void addFirst(Object object) {

        Cell cell = new Cell(this.first, object);
        this.first = cell;

        if (size == 0) {
            this.last = this.first;
        }

        size++;

    }

    @Override
    public void add(int position, Object object) {

    }

    @Override
    public Object get(int position) {
        return null;
    }

    @Override
    public void remove(int position) {

    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (size() == 0) {
            return builder.append("[]").toString();
        }

        builder.append("[");

        Cell current = first;
        while (current != null) {
            builder.append(current.getElement());
            current = current.getNext();
            if (current != null) {
                builder.append(",");
            }
        }

        builder.append("]");
        return builder.toString();
    }

}
