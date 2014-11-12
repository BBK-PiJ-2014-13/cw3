public class ImprovedStackImpl implements ImprovedStack {
	ArrayList list = new ArrayList();

	// Tested
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// Tested
	public int size() {
		return list.size();
	}

	// Tested
	public void push(Object o) {
		list.add(o);
	}

	// Tested
	public ReturnObject top() {
		return list.get(size() - 1);
	}

	// Tested
	public ReturnObject pop() {
		ReturnObjectImpl output = (ReturnObjectImpl) top();
		list.remove(size() - 1);
		return output;
	}

	// Tested
	public ImprovedStack reverse() {
		ImprovedStackImpl output = new ImprovedStackImpl();
		output.list.array = new Object[size()];
		for (int i = size() - 1; i >= 0; i--) {
			output.push(list.get(i).getReturnValue());
			System.out.println(list.get(i).getReturnValue());
		}
		return output;
	}

	// Untested
	public void remove(Object o) {
		for (int i = 0; i < size(); i++) {
			if (list.get(i).getReturnValue().equals(o)) {
				list.remove(i);
			}
		}
	}

}
