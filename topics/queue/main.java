package topics.queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(3);
        que.add(7);
        que.add(9);
        que.remove();
        que.remove();

        System.out.println(que);
    }
}
