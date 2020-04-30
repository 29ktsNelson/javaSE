package day8;

import java.util.Date;

/**
 * 商品清单类
 * 包含商品编号，商品名称，产地，库存数量，上架时间，价格，生产日期，安全库存
 * @author 29ktsNelson
 * @date 2020年4月21日
 */
public class ShopItem {
	//1.成员变量
	String productId;//商品编号
	String productName;//商品名称
	String origin;//产地
	int inventory;//库存数量
	long shelfTime;//上架时间
	double price;//价格
	long prductionTime;//生产日期
	int saftyStock;//安全库存
	int shelfLife;//保质期,单位为月
	
	//2.set,get方法
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public long getShelfTime() {
		return shelfTime;
	}
	public void setShelfTime(long shelfTime) {
		this.shelfTime = shelfTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getPrductionTime() {
		return prductionTime;
	}
	public void setPrductionTime(long prductionTime) {
		this.prductionTime = prductionTime;
	}
	public int getSaftyStock() {
		return saftyStock;
	}
	public void setSaftyStock(int saftyStock) {
		this.saftyStock = saftyStock;
	}
	public int getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	

	/**
	 * 3.构造方法
	 */
	public ShopItem() {
		// TODO Auto-generated constructor stub无参
	}
	/**带参数
	 * @param productId
	 * @param productName
	 * @param origin
	 * @param inventory
	 * @param shelfTime
	 * @param price
	 * @param prductionTime
	 * @param saftyStock
	 * @param shelfLife
	 */
	public ShopItem(String productId, String productName, String origin, int inventory, long shelfTime, double price,
			long prductionTime, int saftyStock, int shelfLife) {
		this.productId = productId;
		this.productName = productName;
		this.origin = origin;
		this.inventory = inventory;
		this.shelfTime = shelfTime;
		this.price = price;
		this.prductionTime = prductionTime;
		this.saftyStock = saftyStock;
		this.shelfLife = shelfLife;
	}
	
	//4重写toString()方法
	@Override
	public String toString() {
		return "ShopItem [productId=" + productId + ", productName=" + productName + ", origin=" + origin
				+ ", inventory=" + inventory + ", shelfTime=" + shelfTime + ", price=" + price + ", prductionTime="
				+ prductionTime + ", saftyStock=" + saftyStock + ", shelfLife=" + shelfLife + ", getProductId()="
				+ getProductId() + ", getProductName()=" + getProductName() + ", getOrigin()=" + getOrigin()
				+ ", getInventory()=" + getInventory() + ", getShelfTime()=" + getShelfTime() + ", getPrice()="
				+ getPrice() + ", getPrductionTime()=" + getPrductionTime() + ", getSaftyStock()=" + getSaftyStock()
				+ ", getShelfLife()=" + getShelfLife() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
