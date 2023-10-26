import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        size++;
        siftUp(size - 1);
    }
public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(5);
        maxHeap.insert(10);
        maxHeap.insert(3);
        maxHeap.insert(8);
        maxHeap.insert(1);

        System.out.println("Max Heap:");
        while (!maxHeap.isEmpty()) {
            int max = maxHeap.remove();
            System.out.print(max + " ");
        }
    }
}
