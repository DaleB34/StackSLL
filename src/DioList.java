public class DioList
{
    private Node head; // because head is at the very bottom

    public DioList()
    {
        head = null;
    }

    public void addHeadNode(int addData)
    {
        head = new Node(addData, head);
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
            System.out.print(position.getData() + " ");
            position = position.getLink();
        }
        System.out.println();
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

