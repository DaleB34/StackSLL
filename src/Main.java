public class Main {
    public static void main(String[] args) {
        DioList stairs = new DioList();
        stairs.addNode(0);
        stairs.addNode(1);
        stairs.addNode(2);
        stairs.addNode(3);

        stairs.showList();
        System.out.println("The List Length is: " + stairs.length());
    }
}