import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class ReturnObjectTest {
	
	@Test
	public void testsHasError() {
		ReturnObjectImpl ReturnObjectImpl = new ReturnObjectImpl();
		ReturnObjectImpl.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		assertEquals(true, ReturnObjectImpl.hasError());
	}
	
	public void testsGetError() {
		ReturnObjectImpl ReturnObjectImpl = new ReturnObjectImpl();
		ReturnObjectImpl.value = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage errorExpected = ErrorMessage.EMPTY_STRUCTURE;
		assertEquals(errorExpected, ReturnObjectImpl.getError());
		
		ReturnObjectImpl.value = null;
		errorExpected = ErrorMessage.NO_ERROR;
		assertEquals(ReturnObjectImpl.getError(), errorExpected);
	}
	
	public void testsGetReturnValue() {
		ReturnObjectImpl ReturnObjectImpl = new ReturnObjectImpl();
		ReturnObjectImpl.value = new Random();
		Object returnValueExpected = ReturnObjectImpl.value;
		assertEquals(ReturnObjectImpl.getReturnValue(), returnValueExpected);
		
		ReturnObjectImpl.value = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		returnValueExpected = ReturnObjectImpl.value;
		assertEquals(ReturnObjectImpl.getReturnValue(), returnValueExpected);
	}

}
