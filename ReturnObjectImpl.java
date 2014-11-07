
public class ReturnObjectImpl implements ReturnObject{
	ErrorMessage errorMessage;
	
	
	// TODO Untested
	public boolean hasError() {
		if (errorMessage == null) {
			return false;
		}
		return true;
	}

	// TODO Untested
	public ErrorMessage getError() {
		if (hasError()) {
			return errorMessage;
		} else {
			return ErrorMessage.NO_ERROR;
		}
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
