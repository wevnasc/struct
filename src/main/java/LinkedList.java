public class LinkedList implements List {

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
            cell.setPrevious(last);
            last = cell;
            size++;
        }

    }

    @Override
    public void add(int position, Object object) {
        if (position == 0) {
            addFirst(object);
        } else if (position == size) {
            add(object);
        } else {
            Cell previous = getCell(position - 1);
            Cell next = previous.getNext();
            Cell current = new Cell(next, object);
            current.setPrevious(previous);
            previous.setNext(current);
            next.setPrevious(current);
            size++;
        }
    }

    @Override
    public Object get(int position) {
        return getCell(position).getElement();
    }

    @Override
    public void remove(int position) {

        if (!hasPosition(position)) {
            throw new IllegalArgumentException("the position is invalid");
        }

        if (size == 1) {
            removeFirst();
        } else if (position == size - 1) {
            removeLast();
        } else {
            Cell previous = getCell(position - 1);
            Cell current = previous.getNext();
            Cell next = current.getNext();

            previous.setNext(next);
            next.setPrevious(previous);
            size--;
        }

    }

    @Override
    public boolean contains(Object object) {

        Cell current = first;
        while (current != null) {
            if (current.getElement().equals(object)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public void addFirst(Object object) {

        if (size == 0) {
            Cell cell = new Cell(object);
            first = cell;
            last = cell;
        } else {
            Cell cell = new Cell(first, object);
            this.first.setPrevious(cell);
            this.first = cell;
        }
        size++;

    }

    public void removeFirst() {
        if (!hasPosition(0)) {
            throw new IllegalArgumentException("the position is invalid");
        }
        first = first.getNext();
        size--;

        if (size == 0) {
            last = null;
        }
    }

    public void removeLast() {
        if (!hasPosition(size - 1)) {
            throw new IllegalArgumentException("the position is invalid");
        }

        if (size == 1) {
            removeFirst();
        } else {
            Cell penultimate = last.getPrevious();
            penultimate.setNext(null);
            last = penultimate;
            size--;
        }
    }

    private boolean hasPosition(int position) {
        return position >= 0 && position < size;
    }

    private Cell getCell(int position) {
        if (!hasPosition(position)) {
            throw new IllegalArgumentException("the position is invalid");
        }

        Cell current = first;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        return current;

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

        java.util.LinkedList<Student> teste = new java.util.LinkedList<>();

        return builder.toString();
    }

}
