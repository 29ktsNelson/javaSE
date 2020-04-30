package day8;

import java.util.Date;

/**
 * 测试商品清单类
 * @author 29ktsNelson
 * @date 2020年4月21日
 */
public class TestShopItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopItem shopitem=new ShopItem("0001", "ROG幻14", "深圳", 100, new Date().getTime(), 10000.00, new Date().getDate(), 10, 36);
		shopitem.toString();
	}
	
}
