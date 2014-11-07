
public class FunctionalLinkedList extends LinkedList implements FunctionalList{

	@Override
	public ReturnObject head() {
		if (size() == 0) {
			ReturnObjectImpl output = new ReturnObjectImpl();
			output.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
			return output;
		} else {
			return (ReturnObject) linkedListStart.nextElement;
		}
	}

	@Override
	public FunctionalList rest() {
		FunctionalLinkedList output = (FunctionalLinkedList) linkedListStart;
		output.remove(0);
		return output;
	}

}
