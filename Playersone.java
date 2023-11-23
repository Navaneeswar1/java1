public class Playersone {
    int number;
	String name;
	int age;
	public Playersone(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "playersone [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	}

