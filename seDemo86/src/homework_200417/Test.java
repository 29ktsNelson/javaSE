package homework_200417;

import java.awt.print.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="格林豪泰苏州火车站南广场拙政园商务酒店";
		String name2="格雅苏州工业园区金鸡湖东方之门酒店";
		String name3="格林豪泰苏州漕湖工业园智选酒店";
		String addr1="江苏省苏州市姑苏区人民路2156号";
		String addr2="江苏省苏州工业园区星海街169号";
		String addr3="江苏省苏州市相城区黄畦路3号";
		String[] room1= {"标间","大床房","豪华双床房"};
		String[] room2= {"豪华双床房"};
		String[] room3= {"高级大床房"};
		double[] priceC1= {168,189,209};
		double[] priceC2= {399};
		double[] priceC3= {189};
		double[] priceV1= {149,161,190};
		double[] priceV2= {339};
		double[] priceV3= {161};
		double[] vou1= {10,20,30};
		double[] vou2= {20};
		double[] vou3= {10};
		
		Hotel hotel1=new Hotel(name1,addr1,room1,priceC1,priceV1,vou1);
		Hotel hotel2=new Hotel(name2,addr2,room2,priceC2,priceV2,vou2);
		Hotel hotel3=new Hotel(name3,addr3,room3,priceC3,priceV3,vou3);
		Customer customer1=new Customer("张三", true,true);
		customer1.bookHotel(hotel2.hotelName, hotel2.roomLevel[0]);
		customer1.bookHotel(hotel1.hotelName, hotel1.roomLevel[0]);
	}
	
	
	
}
