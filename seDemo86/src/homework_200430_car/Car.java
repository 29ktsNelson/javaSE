package homework_200430_car;
/**
 * 剩余油量=油箱容量-里程*每公里油耗
 * @author 29ktsNelson
 * @date 2020年5月3日
 */
public class Car {
	private String brand;
	private String type;
	private Double price;//单位，万元
	private Double fuelConsu;//每公里油耗，L/km
	private Double mileage;//里程，单位km
	private Double tankCapacity;//油箱容量，单位L
	private Double remainFuel;//剩余油量，单位L
	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param brand
	 * @param type
	 * @param price
	 * @param fuelConsu
	 * @param mileage
	 * @param tankCapacity
	 */
	public Car(String brand, String type, Double price, Double fuelConsu, Double mileage, Double tankCapacity) {
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.fuelConsu = fuelConsu;
		this.mileage = mileage;
		this.tankCapacity = tankCapacity;
		this.remainFuel=calRemainFuel(this.tankCapacity,this.mileage,this.fuelConsu);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getFuelConsu() {
		return fuelConsu;
	}

	public void setFuelConsu(Double fuelConsu) {
		this.fuelConsu = fuelConsu;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public Double getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(Double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public Double getRemainFuel() {
		return remainFuel;
	}

	public void setRemainFuel() {
		this.remainFuel=calRemainFuel(this.tankCapacity,this.mileage,this.fuelConsu);
	}

	@Override
	public String toString() {
		return "Car [品牌：" + brand + ", 车型：" + type + ", 售价" + price + "（万元）, 油耗" + fuelConsu + "（L/km） \n本次行驶里程："
				+ mileage + "（km）, 油箱容量" + tankCapacity + "（L）, 剩余油量" + remainFuel + "（L）]";
	}

	/* 剩余油量=油箱容量-里程*每公里油耗 
	 * remainFuel=tankCapacity-mileage*fuelConsu
	 * */			
	public Double calRemainFuel(Double tankCapacity,Double mileage,Double fuelConsu) {
		Double remainFuel=tankCapacity-mileage*fuelConsu;
		return remainFuel;
	}
}
