public class ArrayList implements List {
	public Object[] array = new Object[10];

	// Tested
	public boolean isEmpty() {

		return (array[0] == null);
	}

	// Tested
	public int size() {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				return i;
			}
		}
		return array.length;
	}

	// Tested
	public ReturnObject get(int i) {
		ReturnObjectImpl output = new ReturnObjectImpl();
		if (size() == 0) {
			output.value = ErrorMessage.EMPTY_STRUCTURE;
			return output;
		}
		
		if (i < 0 || i >= size()) {
			output.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return output;
		}

		output.value = array[i];
		return output;
	}

	// Tested
	public ReturnObject remove(int index) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (index < 0 || index >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}

		for (int i = index; i < size(); i++) {
			array[i] = array[i + 1];
		}
		return null;
	}

	// Tested
	public ReturnObject add(int index, Object o) {
		if (array.length == size()) {
			doubleArray();
		}
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (index < 0 || index >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}

		for (int i = size(); i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = o;
		return null;
	}

	// Tested
	public ReturnObject add(Object o) {
		if (array.length == size()) {
			doubleArray();
		}
		
		if (o == null) {
			ReturnObjectImpl returnObject = new ReturnObjectImpl();
			returnObject.value = ErrorMessage.INVALID_ARGUMENT;
			return returnObject;
		}

		array[size()] = o;

		return null;
	}
	
	// Untested
	private void doubleArray() {
		Object[] tempArray = new Object[array.length * 2];
		for (int i = 0; i < size(); i++) {
			tempArray[i] = array[i];
		}
		array = tempArray;
	}

}
