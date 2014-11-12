import org.junit.Test;


public class StackTest extends BasicTest {
	StackImpl stack = new StackImpl(new LinkedList());

	public void testsIsEmpty() {
		valueExpected = true;
		valueActual = stack.isEmpty();
		test();

		stack.push("Object 1");
		stack.push("Object 2");
		valueExpected = false;
		valueActual = stack.isEmpty();
		test();
	}

	public void testsSize() {
		valueExpected = 0;
		valueActual = stack.size();
		test();

		stack.push("Object 1");
		stack.push("Object 2");
		valueExpected = 2;
		valueActual = stack.size();
		test();
	}

	public void testsPush() {
		stack.push("Object 1");
		stack.push(valueExpected = "Object 2");
		valueActual = stack.top().getReturnValue();
		test();
	}

	
	public void testsTop() {
		stack.push(valueExpected = "Object 1");
		valueActual = stack.top().getReturnValue();
		test();
	}
	
	public void testsPop() {
		stack.push("Object 1");
		stack.push(valueExpected = "Object 2");
		stack.push("Object 3");
		stack.pop();
		valueActual = stack.top().getReturnValue();
		test();
	}
}
