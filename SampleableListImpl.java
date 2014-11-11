public class SampleableListImpl extends ArrayList implements SampleableList {

	@Override
	public SampleableList sample() {
		SampleableListImpl output = new SampleableListImpl();
		if (size() == 0) {
			return null;
		}
		
		for (int i = 0; i < size(); i = i + 2) {
			if (array[i] != null) {
				output.add(get(i).getReturnValue());
			} else {
				break;
			}
		}
		return output;
	}
	
}
