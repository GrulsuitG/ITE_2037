package homework4;
/*
class Person {
	private String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void set(String name, int age) {
		this.name=name;
		this.age =age;
	}
	public void set(int age, String name) {
		this.name = name;
		this.age = age;
	}	

}
*/
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age >= 100 || age < 0) {
			System.out.println("0-100세까지만 입력하세요.");
			return;
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void set(String name, int age) {
		this.name=name;
		this.age =age;
	}
	public void set(int age, String name) {
		this.name = name;
		this.age = age;
	}
}

class PersonTset{
	public static void main(String[] args) {
		Person kim = new Person("김기자", 30);
//		kim.name = "김기장";
//		kim.age = 40;
		kim.setName("김기장");
		kim.setAge(20);
		String name = kim.getName();
		int age = kim.getAge();
		System.out.println("이름 = "+name + ", 나이 = " +age);
		kim.set("김길장", 30);
		System.out.println("이름 = "+kim.getName() + ", 나이 = " +kim.getAge());
		kim.set(40, "김결장");
		System.out.println("이름 = "+kim.getName() + ", 나이 = " +kim.getAge());

//		kim.age = -20;
	}
}
