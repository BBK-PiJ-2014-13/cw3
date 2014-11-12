public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	// Tested
	public ReturnObject head() {
		ReturnObjectImpl output = new ReturnObjectImpl();
		if (size() == 0) {
			output.value = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			output.value = get(0).getReturnValue();
		}
		return output;
	}

	// Tested
	public FunctionalList rest() {
		FunctionalLinkedList output = new FunctionalLinkedList();
		if (size() == 0) {
			return null;
		}

		for (int i = 0; i < size(); i++) {
			output.add(get(i).getReturnValue());
		}
		output.remove(0);
		return output;

	}

}
