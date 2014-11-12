import org.junit.Test;


public class SampleableListTest extends BasicTest{
	SampleableListImpl list = new SampleableListImpl();
	
	public void testsSample() {
		list.add("Object 1");
		list.add("Object 2");
		list.add(valueExpected = "Object 3");
		list.add("Object 4");
		list.add("Object 5");
		
		SampleableListImpl secondList = (SampleableListImpl) list.sample();
		valueActual = secondList.get(1).getReturnValue();
		test();
		
		System.out.println(list.get(0).getReturnValue());
		System.out.println(list.get(1).getReturnValue());
		System.out.println(list.get(2).getReturnValue());
	}
}
