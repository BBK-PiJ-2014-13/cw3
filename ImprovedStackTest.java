import org.junit.Test;

public class ImprovedStackTest extends BasicTest {
	ImprovedStackImpl improvedStack = new ImprovedStackImpl();

	public void testsIsEmpty() {
		valueExpected = true;
		valueActual = improvedStack.isEmpty();
		test();

		improvedStack.push(new Object());
		improvedStack.push(new Object());
		improvedStack.push(new Object());
		improvedStack.push(new Object());
		valueExpected = false;
		valueActual = improvedStack.isEmpty();
		test();
	}

	public void TestsSize() {
		improvedStack.push("Object 1");
		improvedStack.push("Object 2");
		improvedStack.push("Object 3");
		valueExpected = 3;
		valueActual = improvedStack.size();
		test();
	}

	public void testsPush() {
		improvedStack.push(valueExpected = "Object 1");
		improvedStack.push("Object 2");
		improvedStack.push("Object 3");
		valueActual = improvedStack.list.array[0];
		test();
	}

	public void testsTop() {
		valueExpected = ErrorMessage.EMPTY_STRUCTURE;
		valueActual = improvedStack.top().getError();
		test();
	}

	public void testsPop() {
		improvedStack.push("1");
		improvedStack.push(valueExpected = "2");
		improvedStack.push("3");
		valueActual = improvedStack.pop().getReturnValue();
		// test();

		valueActual = improvedStack.top().getReturnValue();
		test();
	}

	public void testsReverse() {
		improvedStack.push(valueExpected = "1");
		improvedStack.push("2");
		improvedStack.push("3");
		improvedStack.push("4");
		improvedStack.push("5");

		valueActual = improvedStack.reverse().top().getReturnValue();
		test();
	}

	public void testsRemove() {
		improvedStack.push("1");
		Object temp = "2";
		improvedStack.push(temp);
		improvedStack.push("5");
		improvedStack.push(valueExpected = "4");
		improvedStack.push(temp);
		improvedStack.remove(temp);
		valueActual = improvedStack.top().getReturnValue();
		test();

	}

}
