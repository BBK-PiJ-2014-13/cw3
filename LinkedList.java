public class LinkedList implements List {
	public int index = -1;
	public LinkedList nextElement;
	public LinkedList firstElement = this;;
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
		return firstElement.sizeCalculate();		
	}
	
	// Gets called by size()
	private int sizeCalculate() {
		if (nextElement == null) {
			return 0;
		} else {
			return 1 + nextElement.sizeCalculate();
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
		ReturnObjectImpl output = new ReturnObjectImpl();
		if (i < 0 || i >= size()) {
			output.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return output;
		}
		if (nextElement.index == i) {
			output.value = nextElement.value;
			if (nextElement.nextElement == null) {
				nextElement = null;
			} else {
				nextElement = nextElement.nextElement;
				nextElement.moveIndexes(index);
			}
			return output;
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
			newElement.nextElement = nextElement;
			nextElement = newElement;
			nextElement.index = index + 1;
			if (nextElement.index >= 0) {
				nextElement.firstElement = firstElement;
			}
			nextElement.value = o;
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
			if (nextElement.index >= 0) {
				nextElement.firstElement = firstElement;
			}
			return null;
		} else {
			return nextElement.add(o);
		}
	}

}
