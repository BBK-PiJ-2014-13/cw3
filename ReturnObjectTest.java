import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class ReturnObjectTest {
	

	public void testsHasError() {
		ReturnObjectImpl ReturnObjectImpl = new ReturnObjectImpl();
		ReturnObjectImpl.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		assertEquals(true, ReturnObjectImpl.hasError());
	}
	
	public void testsGetError() {
		ReturnObjectImpl returnObjectImpl = new ReturnObjectImpl();
		returnObjectImpl.value = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage errorExpected = (ErrorMessage) returnObjectImpl.value;
		assertEquals(errorExpected, returnObjectImpl.getError());
		
		returnObjectImpl.value = null;
		errorExpected = ErrorMessage.NO_ERROR;
		assertEquals(returnObjectImpl.getError(), errorExpected);
	}
	
	public void testsGetReturnValue() {
		ReturnObjectImpl returnObjectImpl = new ReturnObjectImpl();
		returnObjectImpl.value = new Random();
		Object returnValueExpected = returnObjectImpl.value;
		assertEquals(returnObjectImpl.getReturnValue(), returnValueExpected);
		
		returnObjectImpl.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		assertEquals(null, returnObjectImpl.getReturnValue());
	}

}
