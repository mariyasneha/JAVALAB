import java.util.PriorityQueue;
public class Queue{
	public static void main(String[] args){
		PriorityQueue<Integer> number=new PriorityQueue<>();
		number.add(4);
		number.add(2);
		number.add(1);
		number.add(12);
		number.add(9);
		System.out.println("Priority Queue "+number);
		int front = number.peek();
        	System.out.println("Front element of Queue: " + front);
       		number.remove(2);
        	System.out.println("After removing 2:" + number);
       
        	System.out.println("Size of Queue: " + number.size());
       
         	int element1 = 15;
        	System.out.println("Does the queue contain " + element1 + "?: " + number.contains(element1));
        	int element2 = 8;
        	System.out.println("Does the queue contain " + element2 + "?: " + number.contains(element2));
       
        	System.out.println("Is the queue empty?: " + number.isEmpty());
        }
}
