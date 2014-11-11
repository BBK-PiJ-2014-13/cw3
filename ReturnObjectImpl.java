
public class ReturnObjectImpl implements ReturnObject{
	Object value;
	
	
	public boolean hasError() {
		if (value instanceof ErrorMessage == false) {
			return false;
		}
		
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

	public ErrorMessage getError() {
		if (hasError()) {
			return (ErrorMessage) value;
		} else {
			return ErrorMessage.NO_ERROR;
		}
	}

	public Object getReturnValue() {
		if (hasError()) {
			return null;
		} else {
			return value;
		}
	}

}
