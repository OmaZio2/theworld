public class Main {
    public static void main(String[] args){
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.Offer("a");
        queue.Offer("b");
        queue.Offer("c");
        queue.Offer("d");
        queue.Offer("e");
        queue.poll();
        queue.Offer("f");
        queue.OutputElem();
    }
}
