public class Main {
    public static void main(String[] args) {
        DioList stairs = new DioList();
        stairs.addTailNode(4);//first node in the list, the head
        stairs.addTailNode(3);
        stairs.addTailNode(2);
        stairs.addTailNode(1);
        stairs.addTailNode(0);//last node in the list, the tail

        stairs.deleteTailNode();
        stairs.deleteTailNode();
        stairs.deleteTailNode();
        stairs.deleteTailNode();
        stairs.deleteTailNode();

        stairs.showList();
        System.out.println("The List Length is: " + stairs.length());
    }
}