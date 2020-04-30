package homework_200430_rail;

public class Ticket {
	private String name;
	private RailwaySite originSite;
	private RailwaySite endSite;
	private int seatClass;//座位等级，1一等座，2二等座
	private Double price;
	/**
	 * 
	 */
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param originSite
	 * @param endSite
	 * @param seatClass
	 */
	public Ticket(String name, RailwaySite originSite, RailwaySite endSite, int seatClass) {
		this.name = name;
		this.originSite = originSite;
		this.endSite = endSite;
		this.seatClass = seatClass;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RailwaySite getOriginSite() {
		return originSite;
	}
	public void setOriginSite(RailwaySite originSite) {
		this.originSite = originSite;
	}
	public RailwaySite getEndSite() {
		return endSite;
	}
	public void setEndSite(RailwaySite endSite) {
		this.endSite = endSite;
	}
	public int getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(int seatClass) {
		this.seatClass = seatClass;
	}
	public Double getPrice() {
		return price;
	}
	public  void setPrice() {
		this.price =calPrice();
	}
	
	
	public Double calPrice() {
		Double price = null;
		Double originPirce=null;
		Double endPrice=null;
		if (this.seatClass==1) {
			 originPirce = this.originSite.getPrice1st();
			 endPrice = this.endSite.getPrice1st();	
		}else if (this.seatClass==2) {
			 originPirce = this.originSite.getPrice2nd();
			 endPrice = this.endSite.getPrice2nd();
		}else {
			System.out.println("座位等级输入错误");
		}
		if (originPirce!=null) {
			price = Math.abs(originPirce - endPrice);
		}
		
		return price;
	}
	
	@Override
	public String toString() {
		return "Ticket [乘车人：" + name + ", 始发站：" + originSite.getSite() + ", 目的站：" + endSite.getSite() + ",  "
				+ seatClass + "等座, 票价：" + price + "]";
	}
	
}
