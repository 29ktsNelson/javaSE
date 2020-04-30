package homework_200430_rail;

public class RailwaySite {
	private int id;
	private String site;
	private double price1st;
	private double price2nd;
	
	/**
	 * 构造方法
	 */
	public RailwaySite() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param site
	 */
	public RailwaySite(int id, String site,double price1st,double price2nd) {
		this.id = id;
		this.site = site;
		this.price1st=price1st;
		this.price2nd=price2nd;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public double getPrice1st() {
		return price1st;
	}

	public void setPrice1st(double price1st) {
		this.price1st = price1st;
	}

	public double getPrice2nd() {
		return price2nd;
	}

	public void setPrice2nd(double price2nd) {
		this.price2nd = price2nd;
	}

	@Override
	public String toString() {
		return "RailwaySite [id=" + id + ", site=" + site + ", price1st=" + price1st + ", price2nd=" + price2nd + "]";
	}


	
}
