public class FunctionalArrayList extends ArrayList implements FunctionalList {

	// TODO Untested
	public ReturnObject head() {
		if (isEmpty()) {
			ReturnObjectImpl output = new ReturnObjectImpl();
			output.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
			return output;
		} else {
			return (ReturnObjectImpl) array[0];
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
