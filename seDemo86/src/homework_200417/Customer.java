package homework_200417;
/**
 * 顾客，有用姓名，是否是vip，是否有代金券属性
 * vip:数组？非数组？一个人不一定有全部酒店的会员
 * @author 29ktsNelson
 * @date 2020年4月19日
 */
public class Customer {
	String cusName;
	boolean vip;
	boolean coupon;
	
	public Customer(String name,boolean v,boolean c) {
		cusName=name;
		vip=v;
		coupon=c;
	}
	
	public void bookHotel(String name,String room) {
		double price=0;
		 if(name.equals("格林豪泰苏州火车站南广场拙政园商务酒店")) {
			 if(room.equals("标间")) {//标间
				 price=Customer.this.vip?149:169;
					if(Customer.this.coupon) {
						price=price-10;
					}
			 }else if(room.equals("大床房")) {//大床房
				 price=Customer.this.vip?161:189;
					if(Customer.this.coupon) {
						price=price-20;
					}
			 }else if(room.equals("豪华双床房")) {//豪华双床房
				 price=Customer.this.vip?190:209;
					if(Customer.this.coupon) {
						price=price-30;
					}
			 }else {
				 System.out.println("请输入正确的房型");
			 }
		 }else if(name.equals("格雅苏州工业园区金鸡湖东方之门酒店")) {
			 price=Customer.this.vip?339:399;
				if(Customer.this.coupon) {
					price=price-20;
				}
		 }else if(name.equals("格林豪泰苏州漕湖工业园智选酒店")) {
			price=Customer.this.vip?161:189;
			if(Customer.this.coupon) {
				price=price-10;
			}
		 }else {
			 System.out.println("请输入正确的酒店名");
		 }
		 System.out.println(Customer.this.cusName+"订购了"+name+"的"+room+"\n定价为："+price);
	}
}
