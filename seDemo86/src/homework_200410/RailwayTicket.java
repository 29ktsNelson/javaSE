package homework_200410;

public class RailwayTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String no="200410001";
		String passName="秦川德里奇";
		int seatNo=10;
		String departure="幽邃教堂";
		String destination="亚诺尔隆德";
		String depTime="2020-04-10 15:51";
		boolean onboard=true;
		double price=2222.22;
		
		System.out.println("票号："+no);
		System.out.println("乘车人："+passName);
		System.out.println("座位号："+seatNo);
		System.out.println("起点："+departure);
		System.out.println("终点："+destination);
		System.out.println("发车时间："+depTime);
		System.out.println("已上车："+onboard);
		System.out.println("票价："+price);
	}

}
