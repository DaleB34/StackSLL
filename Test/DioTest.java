import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DioTest
{
    @Test
    void tailDeleteUpdate()
    {
        DioList stack = new DioList();

        stack.addTailNode(4);//first node in the list, the head
        stack.addTailNode(3);
        stack.addTailNode(2);
        stack.addTailNode(1);
        stack.addTailNode(0);//last node in the list, the tail

        stack.deleteTailNode();

        assertEquals(1, stack.getTail());
    }

    @Test
    void tailDoesntUpdate()
    {
        DioList stack = new DioList();

        stack.addTailNode(4);//first node in the list, the head
        stack.addTailNode(3);
        stack.addTailNode(2);
        stack.addTailNode(1);
        stack.addTailNode(0);//last node in the list, the tail

        //stack.deleteTailNode();

        assertNotEquals(1, stack.getTail());
    }

    @Test
    void headAndTailInOne()
    {
        //checking if the head and tail have the same data
        DioList stack = new DioList();

        stack.addTailNode(4);//first node in the list, the head, and the last node in the list, the tail

        assertEquals(stack.getHead(), stack.getTail());
    }

    @Test
    void tailAddUpdate()
    {
        DioList stack = new DioList();

        stack.addTailNode(4);//first node in the list, the head
        stack.addTailNode(3);
        stack.addTailNode(2);
        stack.addTailNode(1);
        stack.addTailNode(0);//last node in the list, the tail
        stack.addTailNode(1234);

        assertEquals(1234, stack.getTail());
    }

}
