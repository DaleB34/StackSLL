import org.w3c.dom.Node;

public class DioList
{
    private Node head;

    public DioList()
    {
        head = null;
    }

    public void addNode(int addData)
    {
        head = new Node(addData, head);
        System.out.println(head.toString());
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

    public void showList()
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.getData());
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

        public String toString()
        {
            return "data:" + data + " links to " + link;
        }

    }//end of Node

}//end of DioList

