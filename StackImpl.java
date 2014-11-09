public class StackImpl extends AbstractStack implements Stack{
	public LinkedList linkedList;
	
	// TODO Untested
	public StackImpl(List list) {
		super(list);
		linkedList = (LinkedList) internalList;
	}

	// TODO Untested
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	// TODO Untested
	public int size() {
		return linkedList.size();
	}

	// TODO Untested
	public void push(Object o) {
		linkedList.add(o);
		// TODO add code to handle arrors
		
	}

	// TODO Untested
	public ReturnObject top() {
		linkedList.last();
		// TODO add code to handle arrors
		return null;
	}

	// TODO Untested
	public ReturnObject pop() {
		return linkedList.removeLast();
		// TODO add code to handle arrors
	}

}
