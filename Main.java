
public class Main {

	public static void main(String[] args) {
		CircularList<Integer> list = new CircularList<Integer>(); 
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.head.data);
		System.out.println(list.head.reference.data);
		System.out.println(list.head.reference.reference.data);
		System.out.println(list.head.reference.reference.reference.data);
		System.out.println(list.head.reference.reference.f_head);
	}

}
