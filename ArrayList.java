
public class ArrayList implements List{
	ReturnObjectImpl[] array = new ReturnObjectImpl[10];

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
		return (ReturnObject) array[i];
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject remove(int i) {
		for (int j = i; j < array.length - i; j++) {
			array[j] = array[j+1];
		}
		return (ReturnObject) this;
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject add(int i, Object o) {
		// TODO add code to increase the size of array
		for (int j = size(); i > i; j--) {
			array[j] = array[j-1];
		}
		array[i] = (ReturnObjectImpl) o;
		return null; // TODO add something to return
		// TODO Add code to handle errors
	}

	// TODO Untested
	public ReturnObject add(Object o) {
		// TODO add code to increase the size of array
		array[size()] = (ReturnObjectImpl) o;
		// TODO Add code to handle errors
		return null; // TODO add something to return
	}

}
