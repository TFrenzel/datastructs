import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	@Test
	public void testInit() {
		Stack stack = new Stack(50);
		assert(stack != null);
	}
	
	@Test
	public void testPush(){
		Stack stack = new Stack(50);
		try{
			for(int i = 1; i <= 50; i++){
				stack.push(i);
			}
		}catch(StackOverflowException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
	
	@Test
	public void testPop(){
		Stack stack = new Stack(25);
		Stack stackerTwo = new Stack(25);
		try{
			stack.push("test");
			stack.push(5);
			stack.push(19);
			stack.push(stackerTwo);
			assert(stack.top() == stackerTwo);
			stack.pop();
			stack.pop();
			assert((Integer)stack.top() ==  5);
			System.out.println(stack.top());
			
		}catch(StackOverflowException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}catch(StackUnderflowException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

}
