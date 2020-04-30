package day15;


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car fiveLRedLight=new Car(1, "五菱宏光", Color.GERY);
		System.out.println(fiveLRedLight.getBrand()+"的颜色是"+
		judgeColor(fiveLRedLight.getColor()));
	}

	public static String judgeColor(Color c) {
		String s=null;
		switch (c) {
		case RED:
			s= "红色";
			break;
		case YELLOW:
			s="黄色";
			break;
		case GREEN:
			s="绿色";
			break;
		case GERY:
			s="灰色";
			break;
		}
		return s;
	}
}
