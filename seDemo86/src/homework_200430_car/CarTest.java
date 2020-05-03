package homework_200430_car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car FiveEdgeRedLight=new Car("五菱宝骏","五菱宏光",6.58, 0.1,100.0,50.0);
		//Double不能接收int，100会报错
		
		System.out.println(FiveEdgeRedLight.toString());
	}

}
