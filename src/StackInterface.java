public interface StackInterface {
	public void push(Object item) throws StackOverflowException;
	//Adds an item to the Stack
	//Postcondition: 
	//			If  (this stack is full)
	// 				an unchecked exception that communicates 'push on stack full' is thrown
	//			Else
	//				item is at the top of the stack

	public void pop() throws StackUnderflowException;
	//Removes an item from this Stack
	//Postcondition: 
	//		If (stack is empty)
	//			an unchecked exception that communicates 'pop on stack empty' is thrown
	//		Else
	//			top element has been removed from stack

	public Object top() throws StackUnderflowException;
	// Returns reference to the top element of the stack
	//Postcondition:
	//		If (stack is empty)
	//			an unchecked exception that communicates 'pop on stack empty' is thrown
	//		Else
	//			Return value = (top element of the stack)

	public boolean isEmpty();
	//Determines if the stack is empty
	//Postcondition: Return value = (this stack is empty)

	public boolean isFull();
	//Determines if the stack is full
	//Postcondition: Return value = (stack is full)
}

class StackOverflowException extends Exception {
	public StackOverflowException() {
	}

	public StackOverflowException(String message) {
		super(message);
	}
}

class StackUnderflowException extends Exception {
	public StackUnderflowException() {
	}

	public StackUnderflowException(String message) {
		super(message);
	}
}
