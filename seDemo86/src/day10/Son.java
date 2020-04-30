package day10;

public class Son extends Father {
	private String classroom;

	/**
	 * @param classroom
	 */
	public Son(String classroom) {
		this.classroom = classroom;
	}

	/**
	 * 
	 */
	public Son() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	
	public Son(String name, int age) {
		super(name,age);
		// TODO Auto-generated constructor stub
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Son [classroom=" + classroom + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
	}
	
	public String playGame(String game) {
		return "玩的游戏是"+game;
	}

	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		return "子类重写方法"+super.getName()+"点的外卖是"+food;
	}
	
	
}
