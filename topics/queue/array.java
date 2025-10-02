package topics.queue;

class CustomQueue {
    int count = 10;
    int[] arr = new int[count];
    int cp = 0;

    public void add(int element) {
        arr[cp] = element;
        cp++;
    }

    public void remove() {
        for (int i = 1, j = 0; i < arr.length && j < arr.length - 1; i++) {
            arr[j] = arr[i];
        }
    }

    public void peek() {
        System.out.println(arr[0]);
    }
}

public class array {
    public static void main(String[] args) {
        CustomQueue que = new CustomQueue();
        que.add(1);
        que.add(2);
        que.add(3);
        que.peek();

    }
}
