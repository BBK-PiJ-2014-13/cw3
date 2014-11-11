import org.junit.Test;

public class FunctionalArrayListTest extends BasicTest {
	FunctionalArrayList functionalArrayList = new FunctionalArrayList();
	
	public void testsHead() {
		valueExpected = ErrorMessage.EMPTY_STRUCTURE;
		valueActual = functionalArrayList.head().getError();
		test();
		
		valueExpected = new Object();
		functionalArrayList.add(valueExpected);
		functionalArrayList.add(new Object());
		functionalArrayList.add(new Object());
		
		valueActual = functionalArrayList.head().getReturnValue();
		test();
		
		
	}
	
	public void testsRest() {
		functionalArrayList.add(new Object());
		functionalArrayList.add(valueExpected = new Object());
		functionalArrayList.add(new Object());
		
		FunctionalArrayList secondFunctionalList = (FunctionalArrayList) functionalArrayList.rest();
		valueActual = secondFunctionalList.get(0).getReturnValue();
		test();
	}
}
