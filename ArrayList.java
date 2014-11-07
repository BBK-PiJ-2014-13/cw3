
public class ArrayList implements List{
	Object[] array = new Object[10];

	// TODO Untested
	public boolean isEmpty() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
			return false;	
			}
		}
		return true;
	}

	// TODO Untested
	public int size() {
		
		for (int i = 0; i < array.length; i++){
			if (array[i] == null) {
				return i;
			}
		}
		return array.length;
	}

	// TODO Untested
	public ReturnObject get(int i) {
		return (ReturnObjectImpl) array[i];
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject remove(int i) {
		ReturnObjectImpl output = (ReturnObjectImpl) array[i];
		for (int j = i; j < array.length - i; j++) {
			array[j] = array[j+1];
		}
		return output;
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject add(int i, Object o) {
		// TODO add code to increase the size of array
		for (int j = size(); i > i; j--) {
			array[j] = array[j-1];
		}
		array[i] = (ReturnObjectImpl) o;
		return null; // TODO return null if operation is successfull, error otherwise
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject add(Object o) {
		// TODO add code to increase the size of array
		array[size()] = (ReturnObjectImpl) o;
		// TODO Add code to handle errors
		return null; // TODO return null if operation is successfull, error otherwise
	}

}
