
public class ReturnObjectImpl implements ReturnObject{
	Object value;
	
	
	// TODO Untested
	public boolean hasError() {
		ErrorMessage probableError = (ErrorMessage) value;
		switch (probableError) {
		case EMPTY_STRUCTURE:
		case INDEX_OUT_OF_BOUNDS:
		case INVALID_ARGUMENT:
			return true;
		default:
			return false;
		}
	}

	// TODO Untested
	public ErrorMessage getError() {
//		if (hasError()) {
//			return errorMessage;
//		} else {
//			return ErrorMessage.NO_ERROR;
//		}
		return null;
	}

	// TODO Untested
	public Object getReturnValue() {
		if (hasError()) {
			return null;
		} else {
			return this; // TODO I don't know what it is supposed to return
		}
	}

}
