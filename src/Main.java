public class Main {
    public static void main(String[] args) {
        DioList stairs = new DioList();
        stairs.addHeadNode(0);
        stairs.addTailNode(1);

        stairs.showList();
        System.out.println("The List Length is: " + stairs.length());
    }
}