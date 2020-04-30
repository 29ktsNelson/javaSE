package day12;

public class Person {
	private String name;
	
	public void eat(String food) {
		System.out.println("吃的是"+food);
	}

	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
