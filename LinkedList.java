public class LinkedList implements List {
	public static LinkedList linkedListStart = new LinkedList();
	public int index;
	public LinkedList nextElement;

	public LinkedList() {
	}

	// TODO Untested
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	// TODO Untested
	public int size() {
		if (nextElement == null) {
			return 0;
		} else {
			return 1 + nextElement.size();
		}
	}

	// TODO Untested
	public ReturnObject get(int i) {
		if (nextElement.index == i) {
			return (ReturnObject) this; // TODO Why can't cast to ReturnObjectImpl?
		} else {
			return nextElement.get(i);
		}
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject remove(int i) {
		if (nextElement.index == i) {
			LinkedList result = nextElement;
			nextElement = nextElement.nextElement;
			return (ReturnObject) result;
		} else {
			nextElement.remove(i);
		}
		// TODO Add code to handle arrors
		return null; // TODO add return statement
	}

	// TODO Untested
	public ReturnObject add(int i, Object o) {
		LinkedList input = (LinkedList) o;
		if (nextElement.index == i) {
			nextElement.moveIndexes();
			input.nextElement = nextElement;
			nextElement = input;
		} else {
			nextElement.add(i, o);
		}
		// TODO Add code to handle arrors
		return null; // TODO add return statement
	}

	// Moves indexes of all elements down the list by 1
	// TODO Untested
	public void moveIndexes() {
		index++;
		if (nextElement == null) {
			return;
		} else {
			nextElement.moveIndexes();
		}
	}

	// TODO Untested
	public ReturnObject add(Object o) {
		if (nextElement == null) {
			nextElement = (LinkedList) o;
			nextElement.index = index + 1;
		} else {
			(nextElement).add(o);
		}
		// TODO Add code to handle an error
		return null; // TODO add return statement
	}

	// TODO Untested
	public ReturnObject last() {
		if (nextElement == null) {
			return (ReturnObject) this;
		} else {
			return nextElement.last();
		}
		// TODO Add code to handle an error
	}

	// TODO Untested
	public ReturnObject removeLast() {
		ReturnObject output;
		if (nextElement.nextElement == null) {
			output = (ReturnObject) nextElement;
			nextElement = null;
			return output;
		} else {
			return nextElement.removeLast();
		}
		// TODO Add code to handle an error
	}
}
