public class ArrayList implements List {
	Object[] array = new Object[10];

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
		return 0;
	}

	// Tested
	public ReturnObject get(int i) {
		ReturnObjectImpl returnValue = new ReturnObjectImpl();
		if (i < 0 || i >= size()) {
			returnValue.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
			return returnValue;
		}

		returnValue.value = array[i];
		return returnValue;
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
		// TODO add code to increase the size of array
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
		// TODO add code to increase the size of array
		if (o == null) {
			ReturnObjectImpl returnObject = new ReturnObjectImpl();
			returnObject.value = ErrorMessage.INVALID_ARGUMENT;
			return returnObject;
		}

		array[size()] = o;

		return null;
	}

}
