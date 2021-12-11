import java.util.*;

interface IStack<T> {
	T pop();
	boolean push(T item);
}

class MyStack<T> implements IStack {
	int tos;
	Object[] stack;
	
	public MyStack() {
		this.tos = 0;
		this.stack = new Object[10];
	}

	@Override
	public Object pop() {
		if(tos == 0) {
			return null;
		}
		return stack[--tos];
	}

	@Override
	public boolean push(Object item) {
		if(tos >= stack.length) {
			return false;
		} else {
			stack[tos++] = item;
			return true;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		while(true) {
			Integer n = stack.pop();
			if(n == null) {
				break;
			}
			System.out.print(n + " ");
		}
	}
}
