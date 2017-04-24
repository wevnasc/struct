import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    public void shouldAddElementOnLast() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList.toString());
        assertEquals(2, linkedList.size());

    }

    @Test
    public void shouldAddElementOnPosition() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add(0, "Paulo");
        linkedList.add(1, "Bruno");

        assertEquals(2, linkedList.size());

    }

    @Test
    public void shouldGetElementOnPosition() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add(0, "Paulo");
        linkedList.add(1, "Bruno");

        assertEquals("Paulo", linkedList.get(0));
        assertEquals("Bruno", linkedList.get(1));

    }

    @Test
    public void shouldRemoveElementOnPosition() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.add("Bruno");

        linkedList.remove(1);
        assertEquals(2, linkedList.size());
    }


    @Test
    public void shouldReturnSizeOfList() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.add("Bruno");

        assertEquals(3, linkedList.size());
    }

    @Test
    public void shouldReturnZeroIfListEmpty() {

        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.size());
    }


    @Test
    public void shouldReturnTrueIfContainElement() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");

        assertTrue(linkedList.contains("Rafael"));
    }

    @Test
    public void shouldReturnFalseIfNotContainElement() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");

        assertTrue(linkedList.contains("Paulo"));

    }

    @Test
    public void shouldAddElementOnFirstOfList() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.addFirst("Paulo");

        assertEquals("Paulo", linkedList.get(0));

    }

    @Test
    public void shouldRemoveFirstElementOfList() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.removeFirst();

        assertEquals("Paulo", linkedList.get(0));

    }

    @Test
    public void shouldRemoveLastElementOfList() {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.removeFirst();

        assertEquals("Rafael", linkedList.get(0));

    }

}
