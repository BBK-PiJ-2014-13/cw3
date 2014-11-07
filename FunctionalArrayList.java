public class FunctionalArrayList extends ArrayList implements FunctionalList {

	// TODO Untested
	public ReturnObject head() {
		ReturnObjectImpl output = new ReturnObjectImpl();
		if (isEmpty()) {
			output.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
			return output;
		} else {
			output.errorMessage = (ErrorMessage) array[0].errorMessage;
			return array[0];
		}
	}

	// TODO Untested
	public FunctionalList rest() {
		FunctionalArrayList output = new FunctionalArrayList();
		output.array = array;
		output.remove(0);
		return output;
	}

}
