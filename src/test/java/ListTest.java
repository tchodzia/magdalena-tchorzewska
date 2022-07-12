import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public abstract class ListTest {

    private List<Integer> elements;

    public ListTest(List<Integer> elements) {
        this.elements = elements;
    }


    @Test
    public void addShouldHandleOneElement() {
        elements.add(10);

        assertEquals(1, elements.size());
        assertEquals(10, elements.get(0));
    }

    @Test
    public void addShouldHandleFewElements() {
        elements.add(23);
        elements.add(11);
        elements.add(13);

        assertEquals(3, elements.size());
    }

    @Test
    public void addShouldHandleManyElements() {
        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);//11 elements

        assertEquals(11, elements.size());
    }

    @Test
    public void itsImpossibleToAddNullValue() {
        elements.add(null);
        assertEquals(0, elements.size());
    }

    @Test
    public void shouldThrowExceptionWhenOutOfBound() {
        try {
            elements.get(3);
//            elements.get(13);
        } catch (Exception e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
            return;
        }
        fail();
    }

    @Test
    public void shouldMakeRoomForNewNumber() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        elements.add(1, 9);

        assertEquals(5, elements.size());
        assertEquals(9, elements.get(1));
        assertEquals(3, elements.get(2));
        assertEquals(4, elements.get(3));
        assertEquals(8, elements.get(4));
    }
    // 6 , 3, 4, 8    = 4 actualSize
    // 0   1  2  3

    // 6 , 3, 4, 8, 8
    // 6 , 3, 4, 4, 8
    // 6 , 3, 3, 4, 8
    // 6 , 9, 3, 4, 8

    @Test
    public void shouldFindMatchingElement() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean shouldFind = elements.contains(3);
        boolean shouldNotFind = elements.contains(10);

        assertTrue(shouldFind);
        assertFalse(shouldNotFind);
    }

    @Test
    public void shouldRemoveGivenObject() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean removedElement = elements.remove(new Integer(6));
        boolean removed2Element = elements.remove(new Integer(10));
        assertTrue(removedElement);
        assertFalse(removed2Element);
    }

    @Test
    public void shouldFindEmptyNode() {
        boolean emptyElement = elements.isEmpty();
        assertTrue(emptyElement);

        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean empty2Element = elements.isEmpty();
        assertFalse(empty2Element);
    }

    @Test
    public void shouldRemoveGivenIndex() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        Integer removedElement = elements.remove(1);

        assertEquals(3, removedElement);

    }

    @Test
    public void shouldClearAllNodes() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        elements.clear();

        assertEquals(0, elements.size());

    }

    @Test
    public void shouldContainGivenObject() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean containElement = elements.contains(new Integer(6));
        boolean contain2Element = elements.remove(new Integer(10));
        assertTrue(containElement);
        assertFalse(contain2Element);
    }
}