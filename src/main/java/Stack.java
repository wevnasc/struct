import java.util.LinkedList;

public class Stack {

    private java.util.List<Object> objects = new LinkedList<>();

    public void push(Object object) {
        objects.add(object);
    }

    public Object pop() {
        return objects.remove(objects.size() - 1);
    }

    public boolean empty() {
        return objects.size() == 0;
    }

}
