package napda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class OopExample {
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("count: " + list.getCount());

		list.addAll(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("count: " + list.getCount());
	}
}

class MyList<E> extends ArrayList<E> {
	private int count;

	public int getCount() {
		return this.count;
	}

	@Override
	public boolean addAll(Collection c) {
		this.count += c.size();
		return super.addAll(c);
	}

	@Override
	public boolean add(E e) {
		this.count++;
		return super.add(e);
	}

	Object d = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return 0;
		}
	};
}
