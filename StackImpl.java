public class StackImpl extends AbstractStack implements Stack{
	public static LinkedList listStart;
	
	// TODO Untested
	public StackImpl(List list) {
		super(list);
		listStart = new StackImpl(listStart);
	}

	// TODO Untested
	public boolean isEmpty() {
		
		return false;
	}

	// TODO Untested
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	// TODO Untested
	public void push(Object item) {
		// TODO Auto-generated method stub
		
	}

	// TODO Untested
	public ReturnObject top() {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO Untested
	public ReturnObject pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
