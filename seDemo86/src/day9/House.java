package day9;

public class House {
	private int hid;
	private String addr;
	private String htype;
	private double price;
	private double area;
	/**
	 * @param hid
	 * @param addr
	 * @param htype
	 * @param price
	 * @param area
	 */
	public House(int hid, String addr, String htype, double price, double area) {
		this.hid = hid;
		this.addr = addr;
		this.htype = htype;
		this.price = price;
		this.area = area;
	}
	/**
	 * 
	 */
	public House() {
		// TODO Auto-generated constructor stub
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String  getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "House [hid=" + hid + ", addr=" + addr + ", htype=" + htype + ", price=" + price + ", area=" + area
				+ "]";
	}
	
}
