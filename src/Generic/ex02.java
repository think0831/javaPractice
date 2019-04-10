package Generic;

public class ex02 {
	public static void main(String[] args) {
		Boxer<String> boxer1 = new Boxer<>();
		boxer1.set("hello");
		String str = boxer1.get();

		Boxer<Integer> boxer2 = new Boxer<>();
		boxer2.set(6);
		int value = boxer2.get();
	}
}

class Boxer<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
