//created by zelmad mohamed.
//import util library.

import java.util.*;

public class QueueImpl{
	
	public static void main(String[] args){
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<10; i++){
			queue.add(i);
		}
		// view the queue first.
		
		System.out.println("our queue is = "+queue);
		int remImpl = queue.remove();
		System.out.println("the remove function = "+remImpl);
		
		int peekImpl = queue.peek();
		
		System.out.println("the peek function = "+peekImpl);
		
		int sizeImpl = queue.size();
		System.out.println("the peek function = "+sizeImpl);

	}
	//frequency fonction.
}