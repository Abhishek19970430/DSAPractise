package assignments;

public class Assignment9 {
    public void driver(){
        QueueLists Q=new QueueLists(5);
        Q.insert(10);
        Q.insert(20);
        Q.insert(30);
        Q.insert(40);
        System.out.println("Total Items: "+Q.countItems()+" front="+Q.getFront()+" rear="+Q.getRear());
        System.out.println("Rear Item: "+Q.getRearItem());
        System.out.println("Front Item: "+Q.getFrontItem());
        Q.delete();
        System.out.println("Total Items: "+Q.countItems()+" front="+Q.getFront()+" rear="+Q.getRear());
        System.out.println("Rear Item: "+Q.getRearItem());
        System.out.println("Front Item: "+Q.getFrontItem());
        Q.insert(50);
        System.out.println("Total Items: "+Q.countItems()+" front="+Q.getFront()+" rear="+Q.getRear());
        System.out.println("Rear Item: "+Q.getRearItem());
        System.out.println("Front Item: "+Q.getFrontItem());
        Q.insert(60);
        System.out.println("Total Items: "+Q.countItems()+" front="+Q.getFront()+" rear="+Q.getRear());
        System.out.println("Rear Item: "+Q.getRearItem());
        System.out.println("Front Item: "+Q.getFrontItem());
    }
}
 class QueueLists{
    private int front,rear;
    private int []ptr;
    public QueueLists(int size){
        rear=-1;
        front=-1;
        ptr=new int[size];
    }
    public void insert(int data){
        if(isFull())
            System.out.println("Queue Overflow");
        else if(isEmpty()){
            front=0;
            rear=0;
            ptr[rear]=data;
        }
        else if((rear)==(ptr.length-1)){
            rear=0;
            ptr[rear]=data;
        }
        else {
            rear++;
            ptr[rear]=data;
        }


    }
    public int getFrontItem(){
        try {
            return ptr[front];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is Empty");
        }
        return -1;
    }
    public int getRearItem(){
        try {
            return ptr[rear];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is Empty");
        }
        return -1;
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==ptr.length-1){
            front=0;
        }
        else {
            front++;
        }
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return (rear+1==front || (front==0 && rear==ptr.length-1));
    }
    public int countItems(){
        if(rear>=front){
            return rear-front+1;
        }
        else {
            return ptr.length-(front-rear)+1;
        }

    }
    public int getFront(){
        return front;
    }
    public int getRear(){
        return rear;
    }
}