import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StackTest {

    @Test
    public void shouldAddElement() {
        Stack stack = new Stack();
        stack.push(new Part());
        assertFalse(stack.empty());
    }

    @Test
    public void shouldRemoveElement() {
        Stack stack = new Stack();
        stack.push(new Part());
        stack.pop();
        assertTrue(stack.empty());
    }

    @Test
    public void shouldVerifyIfStackIsEmpty() {
        Stack stack = new Stack();
        assertFalse(stack.empty());
    }

}
