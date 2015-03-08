public class CircularList<T extends Comparable> {
	Node<T> head;

	public CircularList<T> add(S data) {
		Node<T> addedNode = new Node<T>(data);
		if (head.equals(null)) {
			head = addedNode;
			head.setNext(head);
			head.setFlag();
		} else {
			if (!(search(data))) {
				Node<T> currentNode = head.getNext();
				Node<T> afterNode = current.getNext();
				while (true) {
					if (afterNode.getFlag()) {
						currentNode.setNext(addedNode);
						addedNode.setNext(head);
						return;
					} else {
						currentNode = currentNode.getNext();
						afterNode = afterNode.getNext();
					}

				}
			}
		}
		return this;
	}

	public boolean search(S data) {
		Node<T> currentNode = head.getNext();
		boolean found = false;
		if (head.getData().equals(data)) {
			return !(found);
		}
		while (currentNode.getFlag()) {
			if (currentNode.getData().equals(data)) {
				return !(found);
			} else {
				currentNode = currentNode.getNext();
			}
		}
		return found;
	}
	
	public boolean isEmpty() {
		return (head.equals(null));
	}
	
	public CircularList<T> clear() {
		head.equals(null);
		return this;
	}

	private class Node<S extends Comparable> {
		boolean f_head = false;
		S data;
		Node<S> reference;

		private Node() {
		}

		private Node(S data) {
			this.data = data;
		}

		private S getData() {
			return data;
		}

		private Node<S> getNext() {
			return reference;
		}

		private void setNext(Node<S> reference) {
			this.reference = reference;
		}

		private boolean getFlag() {
			return f_head;
		}

		private void setFlag() {
			this.f_head = !(f_head);
		}

	}
}