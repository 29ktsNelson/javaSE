package homework_200430_rail;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化车站及票价
		RailwaySite NJ=new RailwaySite(1,"南京",0,0);
		RailwaySite ZJ=new RailwaySite(2, "镇江",44.5,29.5);
		RailwaySite DY=new RailwaySite(3, "丹阳",64.5,39.5);
		RailwaySite CZ=new RailwaySite(4, "常州",99.5,64.5);
		RailwaySite WX=new RailwaySite(5,"无锡",129.5,79.5);
		RailwaySite SZ=new RailwaySite(6, "苏州",159.5,99.5);
		RailwaySite SH=new RailwaySite(7, "上海",219.5,139.5);
		
		Ticket tkt1=new Ticket("张三", CZ, NJ, 2);
		tkt1.setPrice();
		System.out.println(tkt1.toString());
		
		
	}


}
