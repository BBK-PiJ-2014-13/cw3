public class StackImpl extends AbstractStack implements Stack{

	public StackImpl(List list) {
		super(list);
	}

	// Tested
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	// Tested
	public int size() {
		return internalList.size();
	}

	// Tested
	public void push(Object o) {
		internalList.add(o);
	}

	// Tested
	public ReturnObject top() {
		return internalList.get(size() - 1);
	}

	//Tested
	public ReturnObject pop() {
		return internalList.remove(size() - 1);
	}

}
