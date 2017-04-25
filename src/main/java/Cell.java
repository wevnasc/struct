
public class Cell {

    private Cell previous;
    private Cell next;
    private Object element;


    public Cell(Cell next, Object element) {
        this.next = next;
        this.element = element;
    }

    public Cell(Object element) {
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
        return previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }

    public Object getElement() {
        return element;
    }
}
