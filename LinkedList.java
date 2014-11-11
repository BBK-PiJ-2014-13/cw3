public class LinkedList implements List {
	public static LinkedList linkedListStart = new LinkedList();
	public int index = -1;
	public LinkedList nextElement;
	public Object value;

	// Tested
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	// Tested
	public int size() {
		if (nextElement == null) {
			return 0;
		} else {
			return 1 + nextElement.size();
		}
	}

	// Tested
	public ReturnObject get(int i) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (i < 0 || i >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}

		if (nextElement.index == i) {
			returnValue.value = nextElement.value;
			return returnValue;
		} else {
			return nextElement.get(i);
		}
	}

	// Tested
	public ReturnObject remove(int i) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (i < 0 || i >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}
		if (nextElement.index == i) {
			returnValue.value = nextElement.value;
			if (nextElement.nextElement == null) {
				nextElement = null;
			} else {
				nextElement = nextElement.nextElement;
				nextElement.moveIndexes(index);
			}
			return returnValue;
		} else {
			return nextElement.remove(i);
		}
	}

	// Tested
	public ReturnObject add(int i, Object o) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (i < 0 || i >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}
		
		if (o == null) {
			returnValue.value = ErrorMessage.INVALID_ARGUMENT;
			return returnValue;
		}
		
		if (nextElement.index == i) {
			LinkedList newElement = new LinkedList();
			newElement.index = index + 1;
			newElement.value = o;
			newElement.nextElement = nextElement;
			nextElement = newElement;
			nextElement.moveIndexes(index);
			return null;
		} else {
			return nextElement.add(i, o);
		}
	}

	// Tested
	public void moveIndexes(int i) {
		index = i + 1;
		if (nextElement == null) {
			return;
		} else {
			nextElement.moveIndexes(index);
		}
	}

	// Tested
	public ReturnObject add(Object o) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (o == null) {
			returnValue.value = ErrorMessage.INVALID_ARGUMENT;
			return returnValue;
		}

		if (nextElement == null) {
			nextElement = new LinkedList();
			nextElement.index = index + 1;
			nextElement.value = o;
			return null;
		} else {
			return (nextElement).add(o);
		}
	}

}
