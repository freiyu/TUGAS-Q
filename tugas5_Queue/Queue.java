package tugas5_Queue;

//JAWABAN INI MILIK
//RAKASYAEL HIZKIA KOLONDAM
//2023105490 - SISTEM INFORMASI
public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    // Mencetak seluruh nilai node pada queue secara berurutan
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Menampilkan nilai node pada urutan pertama
    public void getFirst() {
        if (first == null) {
            System.out.println("First: null");
        } else {
            System.out.println("First: " + first.value);
        }
    }

    // Menampilkan nilai node urutan terakhir
    public void getLast() {

        if (last == null) {
            System.out.println("Last: null");
        } else {
            System.out.println("Last: " + last.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // Menambah node pada urutan terkahir
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            last.next = newNode;
            last = newNode;
        }

        length++;
    }

    // Menhapus dan mengembalikan node urutan pertama
    public int dequeue() {
        if(first == null){
            System.out.println("Empty List");
            length--;
            return -1;
        }
        else{
            Node current = first;
            first = first.next;
            current.next = null;
            length--;
            return current.value;
        }
    }
}
