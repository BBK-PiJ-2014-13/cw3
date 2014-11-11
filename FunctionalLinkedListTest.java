import org.junit.Test;


public class FunctionalLinkedListTest extends BasicTest {
	FunctionalLinkedList list = new FunctionalLinkedList();
	
	public void testsHead() {
		valueExpected = ErrorMessage.EMPTY_STRUCTURE;
		valueActual = list.head().getError();
		test();
		
		
		list.add(valueExpected = new Object());
		list.add(new Object());
		list.add(new Object());
		
		valueActual = list.head().getReturnValue();
		test();
		
		
	}
	
	public void testsRest() {
		list.add("Object 1");
		list.add(valueExpected = "Object 2");
		list.add("Object 3");
		
		FunctionalLinkedList secondFunctionalList = (FunctionalLinkedList) list.rest();
		valueActual = secondFunctionalList.get(0).getReturnValue();
		test();
	}

}
