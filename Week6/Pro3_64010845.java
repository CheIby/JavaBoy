package Week6;

public class Pro3_64010845 {
    public static void main(String[] args) {
        Queue test = new Queue();
        for (int i = 1; i <= 20; i++) {
            test.enqueue(i);
        }
        while (!test.empty()) {
            System.out.println(test.dequeue());
        }
    }
}

class Queue {
    private int[] elements;
    private int size = 0;

    public Queue() {
        this.elements = new int[8];
    }

    public void enqueue(int v) {
        if (this.size >= this.elements.length) {
            int[] temp = new int[this.size * 2];
            System.arraycopy(elements, 0, temp, 0, this.size);
            this.elements = temp;
        }
        this.elements[size++] = v;
    }

    public int dequeue() {
        int v = this.elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return v;
    }

    public boolean empty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return this.size;
    }
}