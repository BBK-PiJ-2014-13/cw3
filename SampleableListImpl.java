public class SampleableListImpl extends LinkedList implements SampleableList {
	public static SampleableListImpl sampleableList;

	public SampleableListImpl() {
		sampleableList = new SampleableListImpl();
		sampleableList.nextElement = linkedListStart.nextElement;
	}

	// TODO Untested
	public SampleableList sample() { // TODO How do we copy objects without knowing their values?
		while (true) {
			if (nextElement.nextElement == null) {
				break;
			}
			
		}
		return null;

	}
}
