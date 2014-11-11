import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArrayListTest {
	ArrayList arrayList = new ArrayList();
	Object valueExpected;
	Object valueActual;
	
	public void test() {
		assertEquals(valueExpected, valueActual);
	}
	
	public void testsAdd() {
		valueExpected = ErrorMessage.INVALID_ARGUMENT;
		valueActual = arrayList.add(null).getError();
		test();
		
		valueExpected = null;
		valueActual = arrayList.add(new Object());
		test();
		
	}
	
	public void testsAddWithIndex() {
		arrayList.add(new Object());
		arrayList.add(new Object());
		valueExpected = new Object();
		arrayList.add(valueExpected);
		
		arrayList.add(2, new Object());
		valueActual = arrayList.get(3).getReturnValue();
		test();
		
		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = arrayList.add(-1, new Object()).getError();
		test();
		
		valueActual = arrayList.add(4, new Object()).getError();
		test();
		
		valueActual = arrayList.add(100, new Object()).getError();
		test();
	}
	
	public void testsSize() {
		arrayList.add(new Object());
		arrayList.add(new Object());
		arrayList.add(new Object());
		test();
		
		valueExpected = 3;
		valueActual = arrayList.size();
		test();
	}

	public void testsIsEmpty() {
		valueExpected = true;
		valueActual = arrayList.isEmpty();
		test();
		
		arrayList.add(new Object());
		valueExpected = false;
		valueActual = arrayList.isEmpty();
		test();
		
	}
	
	public void testsGet() {
		arrayList.add(new Object());
		arrayList.add(new Object());
		valueExpected = new Object();
		arrayList.add(valueExpected);
		valueActual = arrayList.get(2).getReturnValue();
		test();
		
		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = arrayList.get(-1).getError();
		test();
		
		valueActual = arrayList.get(3).getError();
		test();
		
		valueActual = arrayList.get(100).getError();
		test();
	}
	
	public void testsRemove() {
		arrayList.add(new Object());
		arrayList.add(new Object());
		valueExpected = new Object();
		arrayList.add(valueExpected);
		
		arrayList.remove(1);
		valueActual = arrayList.get(1).getReturnValue();
		test();
		
		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = arrayList.remove(-1).getError();
		test();
		
		valueActual = arrayList.remove(3).getError();
		test();
		
		valueActual = arrayList.remove(100).getError();
		test();
	}
	
	
	}
