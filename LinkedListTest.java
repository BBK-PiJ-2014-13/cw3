import org.junit.Test;

public class LinkedListTest extends BasicTest {
	LinkedList linkedList = new LinkedList();

	public void testsIsEmpty() {
		valueExpected = true;
		valueActual = linkedList.isEmpty();
		test();

		linkedList.nextElement = new LinkedList();
		linkedList.nextElement.nextElement = new LinkedList();
		valueExpected = false;
		valueActual = linkedList.isEmpty();
		test();
	}

	public void testsSize() {
		valueExpected = 0;
		valueActual = linkedList.size();
		test();

		linkedList.nextElement = new LinkedList();
		linkedList.nextElement.nextElement = new LinkedList();
		valueExpected = 2;
		valueActual = linkedList.size();
		test();
	}

	public void testsGet() {
		linkedList.add(new Object());
		linkedList.add(valueExpected = new Object());
		
		valueActual = linkedList.get(1).getReturnValue();
		test();

		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = linkedList.get(-10).getError();
		test();

		valueActual = linkedList.get(2).getError();
		test();

		valueActual = linkedList.get(100).getError();
		test();
	}

	public void testsRemove() {
		linkedList.add("Object 1");
		linkedList.add(valueExpected = "Object 2");
		linkedList.add("Object 3");
		valueActual = linkedList.remove(0).getReturnValue();
		test();

		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = linkedList.remove(-10).getError();
		test();

		valueActual = linkedList.remove(2).getError();
		test();

		valueActual = linkedList.remove(100).getError();
		test();
	}

	public void testsAdd() {
		valueExpected = ErrorMessage.INVALID_ARGUMENT;
		valueActual = linkedList.add(null).getError();
		test();

		linkedList.add(new Object());
		linkedList.add(valueExpected = new Object());
		valueActual = linkedList.get(1).getReturnValue();
		System.out.println(linkedList.nextElement.size());
		test();
	}

	public void testsAddWithIndex() {
		linkedList.add(new Object());
		linkedList.add(new Object());
		linkedList.add(new Object());
		valueExpected = new Object();

		linkedList.add(1, valueExpected);
		valueActual = linkedList.get(1).getReturnValue();
		test();

		System.out.print(linkedList.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.index);
		System.out.println(linkedList.nextElement.nextElement.nextElement.index);
		linkedList.remove(1);
		System.out.print(linkedList.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.nextElement.index);

	}

	public void testsMoveIndexes() {
		linkedList.add(new Object());
		linkedList.add(new Object());
		linkedList.add(new Object());
		linkedList.add(new Object());

		System.out.print(linkedList.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.index);
		System.out.println(linkedList.nextElement.nextElement.nextElement.index);
		linkedList.remove(0);
		System.out.print(linkedList.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.index);
		System.out.print(linkedList.nextElement.nextElement.nextElement.index);

		valueExpected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		valueActual = linkedList.remove(-10).getError();
		test();

		valueActual = linkedList.remove(2).getError();
		test();

		valueActual = linkedList.remove(100).getError();
		test();

		valueExpected = ErrorMessage.INVALID_ARGUMENT;
		valueActual = linkedList.add(null).getError();
		test();
	}

}
