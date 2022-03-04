public class ArrayQueue<E> extends AbstractQueue<E> {
    private Object[] arr = new Object[6];
    private int head=0,tail = 0;//定义头部(队首)和尾部（队尾）
    @Override
    public void Offer(E e) { //牺牲最后一个位置，使得tail不能超过head
        int next = (tail+1) % arr.length;
        if(next == head) return;//队满
        arr[tail] = e;
        tail = next;//相当于把tail往后移动一位
    }

    @Override
    public E poll() {
        E e = (E) arr[head];
        head = (head+1) % arr.length;
        return e;
    }
    public void OutputElem(){
        for (int i = head;i<tail;i++) {
            System.out.println(arr[i]);
        }
    }
}
