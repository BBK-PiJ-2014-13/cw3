
public class ImprovedStackImpl implements ImprovedStack{
	// TODO Copy the methods from stckImpl and LinkedList so that you can us "this" statement
	private StackImpl stack;
	private LinkedList linkedList;
	
	public ImprovedStackImpl() {
		stack = new StackImpl(new LinkedList());
		linkedList = stack.linkedList;
	}

	// TODO Untested
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// TODO Untested
	public int size() {
		return stack.size();
	}

	// TODO Untested
	public void push(Object o) {
		stack.push(o);
		
	}

	// TODO Untested
	public ReturnObject top() {
		return stack.top();
	}

	// TODO Untested
	public ReturnObject pop() {
		return stack.pop();
	}

	// TODO Untested
	public ImprovedStack reverse() {
		reverse(false, linkedList);
		return null;
	}
	
	// TODO Untested
	// TODO Unfinished
	public ImprovedStack reverse(boolean b, LinkedList l) {
		if (b == false) {
			if (l.nextElement.nextElement == null) {
				return reverse(true, l); 
			} else {
				return reverse(false, l.nextElement);
			}
		} else {
		}
		return null;
	}
	

	// TODO Untested
	public void remove(Object object) {
		// TODO Auto-generated method stub
		
	}

}
