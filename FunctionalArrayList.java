public class FunctionalArrayList extends ArrayList implements FunctionalList {

	// Tested
	public ReturnObject head() {
		ReturnObjectImpl output = new ReturnObjectImpl();
		if (isEmpty()) {
			output.value = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			output.value = array[0];
		}
		return output;
	}

	// Tested
	public FunctionalList rest() {
		FunctionalArrayList output = new FunctionalArrayList();
		for (int i = 0; i < size(); i++) {
			Object currentElementValue = array[i];
			output.add(currentElementValue);
		}
		
		output.remove(0);
		return output;
	}

}
