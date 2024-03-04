import tugas5_Queue.Queue;

public class MainQ {
    public static void main(String[] args) {

        // Membuat Queue dengan Node awal bernilai 1
        Queue queue = new Queue(1);
        // Menambah Node bernilai 2 pada queue
        queue.enqueue(2);
        // Menambah Node bernilai 3 pada queue
        queue.enqueue(3);
        // Menambah Node bernilai 4 pada queue
        queue.enqueue(4);
        // Menghapus queue urutan pertama saat ini
        queue.dequeue();
        // Menghapus queue urutam pertama saat ini
        queue.dequeue();
        // Mencetak nilai nilai node pada queue
        queue.printQueue();
        // Menambah Node bernilai 5 pada queue
        queue.enqueue(5);
        // Menambah Node bernilai 6 pada queue
        queue.enqueue(6);
        // Mencetak nilai nilai node pada queue
        queue.printQueue();
    }
}
