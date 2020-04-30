package day15;

public class Car {
	private Integer id;
	private String brand;
	private Color color;
	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param brand
	 * @param color
	 */
	public Car(Integer id, String brand, Color color) {
		this.id = id;
		this.brand = brand;
		this.color = color;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", color=" + color + "]";
	}
	
	
}
