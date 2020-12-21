
package Queue;


public class Queuee {

   
    public static void main(String[] args) {
       Queuee arrayQueue = new Queuee();
        Queuee.enqueue("fouad");
        Queuee.enqueue("ziad");
        arrayQueue.enqueue("ahmad");
        

        System.out.println("Array Queue Queue with 3 String name ");
        arrayQueue.print();

        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        System.out.println("dequeue 3* ");
        arrayQueue.print();
    }

    }
}
