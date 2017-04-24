public class Vector {

    private Object[] objects = new Object[100];
    private int size;

    public void add(Object object) {
        ifWithoutSpaceThenCreate();
        objects[size] = object;
        size++;
    }

    public void add(int position, Object object) {
        ifWithoutSpaceThenCreate();
        if (!isValidPosition(position)) {
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = size(); i >= position; i--) {
            objects[i + 1] = objects[i];
        }

        objects[position] = object;
        size++;
    }

    public Object get(int position) {
        if (!hasPosition(position)) {
            throw new IllegalArgumentException("invalid position");
        }
        return objects[position];
    }

    public void remove(int position) {
        if (!hasPosition(position)) {
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = position; i < size() - 1; i++) {
            objects[i] = objects[i + 1];
        }

        size--;
    }

    public void remove(Object object) {
        int position = indexOf(object);
        if (position == -1) {
            return;
        }
        remove(object);
        remove(position);
    }

    public boolean contains(Object object) {
        for (int position = 0; position < size(); position++) {
            if (object.equals(objects[position])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object) {
        for (int position = 0; position < size(); position++) {
            if (object.equals(objects[position])) {
                return position;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    private boolean hasPosition(int position) {
        return position >= 0 && position < size();
    }

    private boolean isValidPosition(int position) {
        return position >= 0 && position <= size();
    }

    private void ifWithoutSpaceThenCreate() {

        if (size() == objects.length) {
            Object[] space = new Object[size() * 2];
            for (int i = 0; i < objects.length; i++) {
                space[i] = objects[i];
            }
            objects = space;
        }

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (size() == 0) {
            return builder.append("[]").toString();
        }

        builder.append("[");

        for (int position = 0; position < size(); position++) {
            builder.append(objects[position]);
            builder.append(",");
        }
        builder.append("]");
        return builder.toString();
    }
}
