public class Main {
    public static void main(String[] args) {
        List<Double> list = new List<>();

        for (int i = 0; i < 50; i++) {
            list.pushBack(i / 0.33);
        }
        list.printList();
    }
}