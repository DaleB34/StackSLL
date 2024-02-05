import org.w3c.dom.Node;

public class DioList
{
    private Node tail; // because head is at the very bottom

    public DioList()
    {
        tail = null;
    }

    public void addNode(int addData)
    {
        tail = new Node(addData, tail);
    }

    public boolean hasNext()
    {
        Node position = tail;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }

    public int length()
    {
        int count = 0;
        Node position = tail;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void showList()
    {
        Node position = tail;
        while (position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getLink();
        }
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
        public void setLink(Node next)
        {
            this.link = next;
        }

        public String toString()
        {
            return "data:" + data + " links to " + link;
        }

    }//end of Node

}//end of DioList

