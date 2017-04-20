public class Stack implements StackInterface {
	private Object[] stack;
	private int topIndex = -1;

	public Stack() {
		stack = new Object[100];
	}

	public Stack(int n) {
		stack = new Object[n];
	}

	@Override
	public void push(Object item) throws StackOverflowException {
		if (!isFull()) {
			topIndex++;
			stack[topIndex] = item;
		} else {
			throw new StackOverflowException("Stack is full!");
		}

	}

	@Override
	public void pop() throws StackUnderflowException {
		if (!isEmpty()) {
			stack[topIndex] = null;
			topIndex--;
		} else {
			throw new StackUnderflowException("The Stack is empty!");
		}

	}

	@Override
	public Object top() throws StackUnderflowException {
		Object topOfStack = null;
		if (!isEmpty()) {
			topOfStack = stack[topIndex];
		} else {
			throw new StackUnderflowException("Stack is Empty!");
		}

		return topOfStack;
	}

	@Override
	public boolean isEmpty() {
		if (topIndex == -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if (topIndex == (stack.length - 1)) {
			return true;
		} else {
			return false;
		}
	}

}