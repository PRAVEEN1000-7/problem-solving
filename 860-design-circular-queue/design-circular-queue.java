class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class MyCircularQueue {

    Node front;
    Node rear;
    int size;
    int currentsize;

    public MyCircularQueue(int k) {

        size = k;
        
    }
    
    public boolean enQueue(int value) {
        
        Node newNode = new Node(value);

        if(front==null) {
            front = rear = newNode;
            rear.next = front;
            currentsize=1;
            return true;
        }
        if(size>currentsize){
            rear.next = newNode;
            newNode.next = front;
            rear = newNode;
            currentsize++;
            return true;       
        }
        
        return false;

    }
    
    public boolean deQueue() {

        if(front==null) return false; 

        if(front==rear){

            front = rear = null;
            return true;
        }

        front = front.next;
        rear.next = front;
        currentsize--;
        return true;
    }
    
    public int Front() {

        return (front!=null)? front.data : -1;
        
    }
    
    public int Rear() {
        
        return (rear!=null)? rear.data : -1;

    }
    
    public boolean isEmpty() {
        
        return front==null;
    }
    
    public boolean isFull() {
        
        if(currentsize==size) return true;

        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */