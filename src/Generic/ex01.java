package Generic;

public class ex01 {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.set("hongildong");
		String name = (String)box.get();

		Box<Apple> box2 = new Box<>();
		box2.set(new Apple());
		Apple apple = box2.get();
	}
}

class Box<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
}

class Apple {

}


