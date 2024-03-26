class Animal{
	void eat() {
		System.out.println("게걸스럽게 먹습니다.");
	}
}

class Person extends Animal{ //Override
	void eat() {
		System.out.println("사람처럼 교양있게 먹습니다.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Person a = new Person();
		a.eat();
	}

}
