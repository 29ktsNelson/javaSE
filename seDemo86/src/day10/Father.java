package day10;

public class Father {
	private String name;
	private int age;
	/**
	 * 
	 */
	public Father() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param age
	 */
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + "]";
	}
	
	public  String eat(String food) {
		return name+"吃的是"+food;
	}
}
