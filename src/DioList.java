import org.w3c.dom.Node;

public class DioList
{
    private Node head;
    private Node tail;

    public DioList()
    {
        tail = null;
    }


    public void addTailNode(int addData)
    {
        tail = new Node(addData, tail);
    }

    public void deleteTailNode()
    {
        if(tail!= null)
        {
            tail = tail.getLink();
        }
        else
        {
            System.out.println("Deleting from empty list");
            System.exit(0);
        }
    }

    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }

    public int length()
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
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

    }//end of Node

}//end of DioList

