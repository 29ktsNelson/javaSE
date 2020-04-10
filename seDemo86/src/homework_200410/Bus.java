package homework_200410;

public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String no="706";
		String departure="洛斯里克首末站";
		String destination="洛斯里克首末站";
		//String currSite="法兰要塞";
		String nextSite="不死聚落";
		String slogan="戴好口罩，防范疾病，平安洛城";
		int price=2;
		double internal=15;
		
		System.out.println("名称："+no+"路");
		System.out.println("首发站："+departure);
		System.out.println("终点站："+destination);
		System.out.println("下一站："+nextSite);
		System.out.println("距到达下一站还有："+internal+"分钟");
		System.out.println("票价："+price);
		System.out.println(slogan);
	}

}
