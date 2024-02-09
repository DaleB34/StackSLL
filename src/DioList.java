public class DioList
{
    private Node head;
    private Node tail;

    public DioList()
    {
        head = null;
        tail = null;
    }

    public void addHeadNode(int addData)
    {
        if(head == null)
        {
            head = new Node(addData, null); //in the case of an empty list
            tail = head;
        }
        else {
            head = new Node(addData, head);
            System.out.println(head);
        }
    }


    public boolean hasNext()
    {
        Node position = head;
        if (position.getLink() != null)
            return true;
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
            System.out.println(position.getData() + " ");
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
            if(length() > 0)
            {
                if(getLink() == null)
                {
                    return "data:" + data + " links to " + head.getData();
                }
            }
            return "data:" + data + " links to " + link;
        }


    }//end of Node

}//end of DioList

