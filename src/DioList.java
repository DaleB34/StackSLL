import org.w3c.dom.Node;

public class DioList
{
    private Node head;
    private Node tail;

    public DioList()
    {
        tail = null;
    }

    private class Node
    {

        private int data;
        private Node link;

        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        public String toString()
        {
            return "data:" + data + " links to " + link;
        }

    }
}

