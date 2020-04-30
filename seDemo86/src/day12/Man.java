package day12;

public class Man extends Person {
	@Override
	public void eat(String food) {//对父类方法的重写
		System.out.println("聚餐吃的是"+food);
	}
	
	public void play(String game) {
		System.out.println("玩的游戏是"+game);
	}
}
