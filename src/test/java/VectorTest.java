import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    public void shouldAddOnEnd() {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("John");
        student2.setName("Joseph");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);

        assertEquals(2, list.size());
        assertEquals(student2, list.get(1));
    }

    @Test
    public void addOnPosition() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("John");
        student2.setName("Joseph");
        student3.setName("Rafael");

        Vector list = new Vector();
        list.add(0, student1);
        list.add(1, student2);
        list.add(1, student3);

        assertEquals(3, list.size());
        assertEquals(student3, list.get(1));

    }

    @Test
    public void addOnInvalidPosition() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student1 = new Student();

            student1.setName("John");

            Vector list = new Vector();
            list.add(1, student1);
        });

    }

    @Test
    public void getForPosition() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("John");
        student2.setName("Joseph");
        student3.setName("Rafael");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        assertEquals(3, list.size());
        assertEquals(student1, list.get(0));
        assertEquals(student2, list.get(1));
        assertEquals(student3, list.get(2));

    }

    @Test
    public void getOnNotFoundPosition() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student1 = new Student();
            student1.setName("John");

            Vector list = new Vector();
            list.add(student1);
            list.get(1);
        });

    }

    @Test
    public void removeOnPosition() {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("John");
        student2.setName("Joseph");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);
        list.remove(0);

        assertEquals(1, list.size());
        assertEquals(student2, list.get(0));
    }

    @Test
    public void removeOnInvalidPosition() {
        assertThrows(IllegalArgumentException.class, () -> {
            Student student1 = new Student();
            student1.setName("Joseph");

            Vector list = new Vector();
            list.add(student1);
            list.remove(1);
        });

    }

    @Test
    public void containsDatesOnVector() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("John");
        student2.setName("Joseph");
        student3.setName("Rafael");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);

        assertTrue(list.contains(student1));
        assertTrue(list.contains(student2));
        assertFalse(list.contains(student3));
    }

    @Test
    public void shouldSizeOfVector() {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("John");
        student2.setName("Joseph");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);

        assertEquals(2, list.size());
    }

    @Test
    public void shouldReturnIndexOfStudent() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("John");
        student2.setName("Joseph");
        student3.setName("Rafael");

        Vector list = new Vector();
        list.add(student1);
        list.add(student2);

        assertEquals(0, list.indexOf(student1));
        assertEquals(1, list.indexOf(student2));
        assertEquals(-1, list.indexOf(student3));
    }

}
