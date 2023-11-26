public class QEx1 {
     
    public static void main(String[] args) {
 
        Queue myQueue = new Queue(10);

        int[] elementsToAdd = {2, 5, 8, 1, 9, 3, 6, 7, 4};
        
        for (int element : elementsToAdd) {
            myQueue.enqueue(element);
        }
        System.out.println("Size of the queue: " + myQueue.size());

        System.out.println("Front element of the queue: " + myQueue.front());

        myQueue.dequeue();

        System.out.println("Front element of the queue: " + myQueue.front());

        myQueue.enqueue(10);
        myQueue.enqueue(11);

        myQueue.print();
    }
}
